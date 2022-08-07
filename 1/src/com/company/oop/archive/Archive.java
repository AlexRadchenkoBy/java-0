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
import java.util.Objects;
import java.util.Scanner;

public class Archive {
    private User currentUser;
    private ArrayList<Case> cases;
    private ArrayList<User> users;

    private static final String CASE_PATH = "C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\company\\oop\\archive" +
            "\\archive.xml";
    private static final String USER_PATH = "C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\company\\oop\\archive\\user.xml";

    public Archive() throws ParserConfigurationException, IOException, SAXException {
        this.cases = readCase(CASE_PATH);
        this.users = readUser(USER_PATH);
    }

    public void runInProgram() throws ParserConfigurationException, IOException, TransformerException, SAXException {
        System.out.println("""
                0 - Выйти
                1 - Войти
                2 - Зарегистрироваться""");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0) {
            System.exit(0);
        } else if (number == 1) {
            while (true) {
                System.out.println("Введите: ");
                System.out.print("Логин: ");
                String login = scanner.nextLine();
                System.out.print("Пароль: ");
                String password = scanner.nextLine();
                loginAndPassword(login, password);
                if (currentUser != null) {
                    break;
                } else {
                    System.out.println("Неккоректный ввод данных! Введите данные повторно!");
                }
            }
            while (true) {
               if (currentUser.getIsAdmin()) {
                   System.out.println("""
                           0 - Выйти
                           1 - Добавить личное дело
                           2 - Изменить личное дело
                           3 - Просмотр личных дел
                           4 - Поиск личного дела
                           """);
                   int number1 = Integer.parseInt(scanner.nextLine());
                   if (number1 == 0) {
                       System.exit(0);
                   } else if (number1 == 1) {
                       System.out.println("Введите: ");
                       System.out.print("Имя: ");
                       String name = scanner.nextLine();
                       System.out.print("Фамилия: ");
                       String surname = scanner.nextLine();
                       System.out.print("Год рождения: ");
                       int yearOfBirth = Integer.parseInt(scanner.nextLine());
                       System.out.print("Факультет: ");
                       String faculty = scanner.nextLine();
                       addCase(name, surname, yearOfBirth, faculty);
                   }
               } else {
                   System.out.println("""
                           0 - Выйти
                           1 - Поиск личного дела
                           """);
               }
            }
        } else if (number == 2) {
            System.out.println("Введите: ");
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Пароль: ");
            String password = scanner.nextLine();
            addUser(email, password);
        }
    }

        public void loginAndPassword (String login, String password){
            for (User user : users) {
                if (Objects.equals(login, user.getEmail()) && Objects.equals(password, user.getPasswordHash())) {
                    currentUser = user;
                }
            }
        }

        public void addUser (String emailUser, String passwordHashUser) throws
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

        public void addCase (String nameCase, String surnameCase,int yearOfBirthCase, String facultyCase)
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

        public ArrayList<Case> readCase (String pathToFile) throws
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

        public ArrayList<User> readUser (String pathToFile){
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
        public String toString () {
            return "Archive{" +
                    "cases=" + cases +
                    ", users=" + users +
                    '}';
        }
    }
