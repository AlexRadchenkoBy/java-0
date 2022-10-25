package com.company.oop.archive.server;

import com.company.oop.archive.Archive;
import com.company.oop.archive.Case;
import com.company.oop.archive.Hash;
import com.company.oop.archive.User;
import com.company.oop.archive.client.Client;
import com.company.oop.archive.common.Mapper;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.Objects;

public class DispatcherController {

    private Archive archive;

    public DispatcherController() {
        archive = new Archive();
    }


    public String handle(String requestStr) throws ParserConfigurationException, IOException,
            TransformerException, SAXException {
        Request request = Mapper.toRequest(requestStr);
        return switch (request.getRequestType()) {
            case LOGIN -> loginAndPassword(request.getParameters().get(0), request.getParameters().get(1));
            case ADDUSER -> addUser(request.getParameters().get(0), request.getParameters().get(1));
            case ADDCASE -> addCase(request.getParameters().get(0), request.getParameters().get(1),
                    Integer.parseInt(request.getParameters().get(2)), request.getParameters().get(3));
            case SEARCHCASE -> searchCase(request.getParameters().get(0), request.getParameters().get(1),
                    Integer.parseInt(request.getParameters().get(2)));
            case GETALLCASE -> getAllCases();
            case CHANGETHECASE -> changeTheCase(request.getParameters().get(0), request.getParameters().get(1));

        };
    }

    private String loginAndPassword(String login, String password) {
        User user = archive.loginAndPassword(login, password);
        return Mapper.toString(user);
    }

    private String addUser(String emailUser, String passwordHashUser) throws ParserConfigurationException, IOException,
            TransformerException, SAXException {
        archive.addUser(emailUser, passwordHashUser);
        return null;
    }

    private String addCase(String nameCase, String surnameCase, int yearOfBirthCase, String facultyCase) throws
            ParserConfigurationException, IOException, TransformerException, SAXException {
        archive.addCase(nameCase, surnameCase, yearOfBirthCase, facultyCase);
        return null;
    }

    public String searchCase(String name, String surname, int yearOfBirth) {
        Case caseItem = archive.searchCase(name, surname, yearOfBirth);
        return Mapper.toString(caseItem);
    }

    public String getAllCases() {
        return Mapper.toString(archive.getCases());
    }

    public String changeTheCase(String faculty, String id) {
        archive.changeTheCase(faculty, id);
        return null;
    }


}
