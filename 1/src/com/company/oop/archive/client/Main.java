package com.company.oop.archive.client;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Client client = new Client();
        client.startConnection("127.0.0.1", 8080);
        new Menu().runInProgram(client);
        client.stopConnection();
    }
}
