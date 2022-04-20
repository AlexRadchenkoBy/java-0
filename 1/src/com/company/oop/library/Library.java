package com.company.oop.library;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

// - прочитать текстовый файл построчно;
// - разделить строку по запятой;
// - парсить значеения разбитой строки в объект;
// - сохранить объект в Library в переменную users или books;
public class Library {
    private ArrayList<User> users;
    private ArrayList<Book> books;

    public Library() {
        this.users = new ArrayList<User>();
        this.books = new ArrayList<Book>();
    }

    public void createUser(boolean isAdmin, String name, String email) {
        User user = new User(isAdmin, name, email);
        users.add(user);
    }

    public ArrayList<String> readBooks(String pathToFile) throws Exception {
        ArrayList<String> rows = new ArrayList<>();
        FileReader file = new FileReader(pathToFile);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
           rows.add(scanner.nextLine());
        }
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 0; i < rows.size(); i++) {
            String[] fields = rows.get(i).split(", ");

        }
        return rows;
    }
}

