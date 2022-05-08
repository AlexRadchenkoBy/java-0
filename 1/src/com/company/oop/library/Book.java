package com.company.oop.library;

import java.util.UUID;

public class Book {
    private String id;
    private String type;
    private String title;
    private String author;
    private int yearOfPublishing;
    private String description;

    public Book(String type, String title, String author, int yearOfPublishing, String description) {
        this.id = UUID.randomUUID().toString();
        this.type = type;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.description = description;

    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Book(String id, String type, String title, String author, int yearOfPublishing, String description) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.description = description;
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
