package com.company.oop.library;

import java.util.ArrayList;

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

    public void readBooks() {

    }
}
