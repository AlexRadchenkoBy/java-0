package com.company.library;

public class Book {
    private String title;
    private String authorName;
    private int pages;

    public Book(String title, String authorName, int pages) {
        this.title = title;
        this.authorName = authorName;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }
}
