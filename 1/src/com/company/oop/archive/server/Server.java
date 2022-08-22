package com.company.oop.archive.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter output;
    private BufferedReader input;
    private DispatcherController dispatcherController;

    public Server() {
        dispatcherController = new DispatcherController();
    }

    public void start(int port) {
        try {
            serverSocket = new ServerSocket(port);
            while (true) {
                clientSocket = serverSocket.accept();
                handleClientConnection();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void handleClientConnection() {
        try {
            output = new PrintWriter(clientSocket.getOutputStream(), true);
            input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String inputLine;
            while ((inputLine = input.readLine()) != null) {
//                if (".".equals(inputLine)) {
//                    output.println("good bye");
//                    break;
//                }
                System.out.println(inputLine);
                System.out.println("==========");
                output.println(dispatcherController.handle(inputLine));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void stop() {
        try {
            input.close();
            output.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
