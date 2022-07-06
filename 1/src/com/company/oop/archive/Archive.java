package com.company.oop.archive;

import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.ArrayList;

public class Archive {
    private ArrayList<File> files;
    private ArrayList<User> users;

    private static final String ARCHIVE_PATH = "C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\company\\oop\\archive\\archive.xml";

    public Archive() {

    }

    public void saveArchive(Archive archive) throws ParserConfigurationException {
       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       factory.setNamespaceAware(true);
       Document document = (Document) factory.newDocumentBuilder().newDocument();
       Element root = document.;
    }
}
