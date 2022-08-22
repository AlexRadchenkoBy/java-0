package com.company.oop.archive.server;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        Server server = new Server();
        server.start(8080);
        server.stop();
    }

}
