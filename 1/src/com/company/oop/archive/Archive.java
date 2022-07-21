package com.company.oop.archive;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Archive {
    private ArrayList<Case> cases;
    private ArrayList<User> users;

    private static final String CASE_PATH = "C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\company\\oop\\archive" +
            "\\archive.xml";
    private static final String USER_PATH = "C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\company\\oop\\archive\\user.xml";

    public Archive() throws ParserConfigurationException, IOException, SAXException {
        this.cases = readCase(CASE_PATH);
    }

    public void runInProgram() {
        System.out.println("""
                0 - Выйти
                1 - Войти
                2 - Зарегистрироваться""");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0) {
            System.exit(0);
        }
    }

    public void addUser(String emailUser, String passwordHashUser) throws ParserConfigurationException, TransformerException {
        User user = new User(emailUser, passwordHashUser);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        Document document = factory.newDocumentBuilder().newDocument();
        Element userElement = document.createElement("User");
        document.appendChild(userElement);

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
            throws ParserConfigurationException, TransformerException {
        Case caseElement = new Case(nameCase, surnameCase, yearOfBirthCase, facultyCase);
       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       factory.setNamespaceAware(true);
       Document document = factory.newDocumentBuilder().newDocument();
       Element file = document.createElement("File");
       document.appendChild(file);

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

    public ArrayList<Case> readCase(String PathToFile) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = documentBuilder.parse(CASE_PATH);
        Node file = document.getDocumentElement();
        System.out.println("Список личных дел: ");
        System.out.println();
        NodeList cases = file.getChildNodes();
        for(int i = 0; i < cases.getLength(); i++) {
            Node caseElement = cases.item(i);
            if (caseElement.getNodeType() != Node.TEXT_NODE) {
                NodeList caseProps = caseElement.getChildNodes();
                for (int j = 0; j < caseProps.getLength(); i++) {
                    Node caseProp = caseProps.item(j);
                    if (caseProp.getNodeType() != Node.TEXT_NODE) {
                        System.out.println(caseProp.getNodeName() + ":" +
                                caseProp.getChildNodes().item(0).getTextContent());
                    }
                }
            }
        }
        return caseProp.getNodeName() + ":" +
                caseProp.getChildNodes().item(0).getTextContent();
    }

}
