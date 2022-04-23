package com.company.oop.library;

import java.util.UUID;

public class Book {
    private String id;
    private String type;
    private String title;
    private String author;
    private int yearOfPublishing;

    public Book(String type, String title, String author, int yearOfPublishing) {
        this.id = UUID.randomUUID().toString();
        this.type = type;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book(String id, String type, String title, String author, int yearOfPublishing) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }
}
