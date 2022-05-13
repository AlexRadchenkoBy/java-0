package com.company.oop.library;

import java.util.Properties;

public class Mailer {
    public void send(String email, String text) {
        String from = email;
        String to = "test@test";
        String host = "127.0.0.1";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
    }
}
