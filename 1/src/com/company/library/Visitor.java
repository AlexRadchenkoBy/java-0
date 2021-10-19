package com.company.library;

import java.util.ArrayList;

public class Visitor {
    private String surname;
    private String name;
    private String id;
    private ArrayList<Book> books;

    public Visitor(String surname, String name, String id) {
        this.surname = surname;
        this.name = name;
        this.id = id;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
