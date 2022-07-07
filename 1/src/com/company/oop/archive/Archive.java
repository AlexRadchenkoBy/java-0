package com.company.oop.archive;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.util.ArrayList;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Archive {
    private ArrayList<File> files;
    private ArrayList<User> users;

    private static final String ARCHIVE_PATH = "C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\company\\oop\\archive\\archive.xml";

    public Archive() {

    }

    public void saveArchive() throws ParserConfigurationException, TransformerException {
       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       factory.setNamespaceAware(true);
       Document document = factory.newDocumentBuilder().newDocument();
       Element root = document.createElement("File");
       document.appendChild(root);

       Element id = document.createElement("Id");
       document.appendChild(id);

       Element name = document.createElement("name");
       document.appendChild(name);

       Element surname = document.createElement("surname");
       document.appendChild(surname);

       Element yearOfBirth = document.createElement("year of birth");
       document.appendChild(yearOfBirth);

       Element faculty = document.createElement("faculty");
       document.appendChild(faculty);

        File file = new File("C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\company\\oop\\archive\\archive.xml");
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(document), new StreamResult(String.valueOf(file)));
    }
}
