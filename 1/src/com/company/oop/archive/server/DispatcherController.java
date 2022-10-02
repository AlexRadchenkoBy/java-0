package com.company.oop.archive.server;

import com.company.oop.archive.Archive;
import com.company.oop.archive.Hash;
import com.company.oop.archive.User;
import com.company.oop.archive.common.Mapper;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

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
            case ADDUSER -> addUser(request.getParameters().get(0),request.getParameters().get(1));
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

}
