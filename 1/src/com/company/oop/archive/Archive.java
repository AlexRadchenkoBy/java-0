package com.company.oop.archive;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Archive {
    private ArrayList<Case> cases;
    private ArrayList<User> users;

    private static final String ARCHIVE_PATH = "C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\company\\oop\\archive" +
            "\\archive.xml";
    private static final String USER_PATH = "C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\company\\oop\\archive\\user.xml";

    public Archive() {

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
        Case caseElment = new Case(nameCase, surnameCase, yearOfBirthCase, facultyCase);
       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       factory.setNamespaceAware(true);
       Document document = factory.newDocumentBuilder().newDocument();
       Element file = document.createElement("File");
       document.appendChild(file);

       Element id = document.createElement("Id");
       id.setTextContent(caseElment.getId());


       Element name = document.createElement("name");
       name.setTextContent(caseElment.getName());

       Element surname = document.createElement("surname");
       surname.setTextContent(caseElment.getSurname());

       Element yearOfBirth = document.createElement("year-of-birth");
       yearOfBirth.setTextContent(String.valueOf(caseElment.getYearOfBirth()));

       Element faculty = document.createElement("faculty");
       faculty.setTextContent(caseElment.getFaculty());
       file.appendChild(id);
       file.appendChild(name);
       file.appendChild(surname);
       file.appendChild(yearOfBirth);
       file.appendChild(faculty);

        File file1 = new File(ARCHIVE_PATH);
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(document), new StreamResult(String.valueOf(file1)));
    }

}
