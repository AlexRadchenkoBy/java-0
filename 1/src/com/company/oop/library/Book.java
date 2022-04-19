package com.company.oop.library;

import java.util.UUID;

public class Book {
    private String type;
    private String title;
    private String author;
    private int yearOfPublishing;
    private String id;

    public Book(String type, String title, String author, int yearOfPublishing) {
        this.type = type;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.id = UUID.randomUUID().toString();
    }
}
