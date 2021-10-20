package com.company.library;

import java.util.ArrayList;
import java.util.UUID;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Visitor> visitors;

    public Library(ArrayList<Book> bookList) {
        books = bookList;
    }

    public void giveBook(Visitor visitor, Book book) {
        visitor.addBook(book);
        books.remove(book);
    }

    public void takeBook(Visitor visitor, Book book) {
        books.add(book);
        visitor.removeBook(book);
    }

    public void addVisitor(String name, String surname) {
        Visitor visitor = new Visitor(surname, name, UUID.randomUUID().toString());
        visitors.add(visitor);
    }

    public int getVisitorAmount() {
        return visitors.size();
    }

    public int getBookAmount() {
        return books.size();
    }

    public ArrayList<Book> findBookWhereMorePageAmount(int pageAmount) {
        ArrayList<Book> booksByPageAmount = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPages() > pageAmount) {
                booksByPageAmount.add(books.get(i));
            }
        }
        return booksByPageAmount;
    }

    public ArrayList<Book> findBooksByAuthorName(String authorName) {
        ArrayList<Book> booksByAuthorName = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthorName() == authorName) {
              booksByAuthorName.add(books.get(i));
            }
        }
        return booksByAuthorName;
    }

    public ArrayList<Book> findBooksByTitle(String title) {
        ArrayList<Book> booksByTitle = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().contains(title)) {
                booksByTitle.add(books.get(i));
            }
        }
        return booksByTitle;
    }

    public ArrayList<Book> findBooksWithMaxPages() {
        ArrayList<Book> booksWithMaxPages = new ArrayList<>();
        int maxPages = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPages() > maxPages) {
                maxPages = books.get(i).getPages();
            }
        }
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPages() == maxPages) {
                booksWithMaxPages.add(books.get(i));
            }
        }
        return booksWithMaxPages;
    }


}
