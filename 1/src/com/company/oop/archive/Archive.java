package com.company.oop.archive;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Archive {
    private ArrayList<Case> cases;
    private ArrayList<User> users;

    private static final String CASE_PATH = "C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\company\\oop\\archive" +
            "\\archive.xml";
    private static final String USER_PATH = "C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\company\\oop\\archive\\user.xml";

    public Archive() {
        try {
            this.cases = readCase(CASE_PATH);
            this.users = readUser(USER_PATH);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Case> getCases() {
        return cases;
    }

    public void caseSearch() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите данные студента: ");
//        System.out.print("Имя: ");
//        String name = scanner.nextLine();
//        System.out.print("Фамилия: ");
//        String surname = scanner.nextLine();
//        System.out.print("Год рождения: ");
//        int yearOfBirth = Integer.parseInt(scanner.nextLine());
//        printCase(searchCase(name, surname, yearOfBirth));
    }

    public Case getCaseById(String id) {
        for (Case caseItem : cases) {
            if (Objects.equals(id, caseItem.getId())) {
                return caseItem;
            }
        }
        return null;
    }

    public void changeTheCase(String faculty, String id) {
        Case caseToChange = getCaseById(id);
        File xmlFile = new File(CASE_PATH);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();

            NodeList cases = document.getElementsByTagName("File");

            for (int i = 0; i < cases.getLength(); i++) {
                Element element = (Element) cases.item(i);
                if (caseToChange.getId().equals(element.getElementsByTagName("Id").item(0).getTextContent())) {
                    Node facultyElement = element.getElementsByTagName("faculty").item(0).getFirstChild();
                    facultyElement.setNodeValue(faculty);
                    caseToChange.setFaculty(faculty);

                    document.getDocumentElement().normalize();
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource domSource = new DOMSource(document);
                    StreamResult result = new StreamResult(CASE_PATH);
                    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                    transformer.transform(domSource, result);
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }
    }

    public void printCase(Case caseElement) {
        System.out.println("ID: " + caseElement.getId() + "\n" + "Имя: " + caseElement.getName() + "\n" +
                "Фамилия: " + caseElement.getSurname() + "\n" + "Год рождения: " + caseElement.getYearOfBirth() +
                "\n" + "Факультет: " + caseElement.getFaculty());
    }

    public Case searchCase(String name, String surname, int yearOfBirth) {
        for (Case caseElement : cases) {
            if (Objects.equals(name, caseElement.getName()) && Objects.equals(surname, caseElement.getSurname()) &&
                    yearOfBirth == caseElement.getYearOfBirth()) {
                return caseElement;
            }
        }
        return null;
    }

    public User loginAndPassword(String login, String password) {
        String hashPassword = Hash.hashPassword(password);
        for (User user : users) {
            if (Objects.equals(login, user.getEmail()) && Objects.equals(hashPassword, user.getPasswordHash())) {
                return user;
            }
        }
        return null;
    }

    public void addUser(String emailUser, String passwordHashUser) throws
            ParserConfigurationException, TransformerException, IOException, SAXException {
        User user = new User(emailUser, passwordHashUser);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(USER_PATH);
        Node root = document.getDocumentElement();
        Element userElement = document.createElement("User");
        root.appendChild(userElement);

        Element id = document.createElement("Id");
        id.setTextContent(user.getId());
        userElement.appendChild(id);

        Element isAdmin = document.createElement("isAdmin");
        isAdmin.setTextContent(String.valueOf(Boolean.valueOf(user.getIsAdmin())));
        userElement.appendChild(isAdmin);

        Element email = document.createElement("Email");
        email.setTextContent(user.getEmail());

        Element passwordHash = document.createElement("passwordHash");
        passwordHash.setTextContent(user.getPasswordHash());

        userElement.appendChild(email);
        userElement.appendChild(passwordHash);

        File file = new File(USER_PATH);
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(document), new StreamResult(String.valueOf(file)));
    }

    public void addCase(String nameCase, String surnameCase, int yearOfBirthCase, String facultyCase)
            throws ParserConfigurationException, TransformerException, IOException, SAXException {
        Case caseElement = new Case(nameCase, surnameCase, yearOfBirthCase, facultyCase);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(CASE_PATH);

        Node root = document.getDocumentElement();

        Element file = document.createElement("File");
        root.appendChild(file);

        Element id = document.createElement("Id");
        id.setTextContent(caseElement.getId());


        Element name = document.createElement("name");
        name.setTextContent(caseElement.getName());

        Element surname = document.createElement("surname");
        surname.setTextContent(caseElement.getSurname());

        Element yearOfBirth = document.createElement("year-of-birth");
        yearOfBirth.setTextContent(String.valueOf(caseElement.getYearOfBirth()));

        Element faculty = document.createElement("faculty");
        faculty.setTextContent(caseElement.getFaculty());
        file.appendChild(id);
        file.appendChild(name);
        file.appendChild(surname);
        file.appendChild(yearOfBirth);
        file.appendChild(faculty);

        File file1 = new File(CASE_PATH);
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(document), new StreamResult(String.valueOf(file1)));
    }

    public ArrayList<Case> readCase(String pathToFile) throws
            ParserConfigurationException, IOException, SAXException {
        try {
            ArrayList<Case> cases = new ArrayList<>();
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(CASE_PATH);
            Node root = document.getDocumentElement();
            NodeList files = root.getChildNodes();
            for (int i = 0; i < files.getLength(); i++) {
                Node file = files.item(i);
                if (file.getNodeType() != Node.TEXT_NODE) {
                    NodeList fileProps = file.getChildNodes();
                    Case caseElement = new Case(
                            fileProps.item(1).getTextContent(),
                            fileProps.item(3).getTextContent(),
                            fileProps.item(5).getTextContent(),
                            Integer.parseInt(fileProps.item(7).getTextContent()),
                            fileProps.item(9).getTextContent());
                    cases.add(caseElement);
                }
            }
            return cases;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public ArrayList<User> readUser(String pathToFile) {
        ArrayList<User> users = new ArrayList<>();
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(USER_PATH);
            Node root = document.getDocumentElement();
            NodeList usersElement = root.getChildNodes();
            for (int i = 0; i < usersElement.getLength(); i++) {
                Node userElement = usersElement.item(i);
                if (userElement.getNodeType() != Node.TEXT_NODE) {
                    NodeList userProps = userElement.getChildNodes();
                    User user = new User(userProps.item(1).getTextContent(),
                            Boolean.parseBoolean(userProps.item(3).getTextContent()),
                            userProps.item(5).getTextContent(), userProps.item(7).getTextContent());
                    users.add(user);
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public String toString() {
        return "Archive{" +
                "cases=" + cases +
                ", users=" + users +
                '}';
    }
}
