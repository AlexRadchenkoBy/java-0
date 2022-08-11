package com.company.oop.archive;

import java.net.*;
import java.io.*;

public class Server {
    private Archive archive;
    private static Socket clientSoket;
    private static ServerSocket server;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) throws IOException {
        try {
            try {
                server = new ServerSocket(8000);
                System.out.println("Сервер запущен!");
                clientSoket = server.accept();
                try {
                    in = new BufferedReader(new InputStreamReader(clientSoket.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(clientSoket.getOutputStream()));
                    String word = in.readLine();
                    System.out.println(word);
                    out.write();
                    out.flush();
                }
            }
        }

    }
}
