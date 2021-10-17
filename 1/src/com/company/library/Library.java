package com.company.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> bookList) {
        books = bookList;
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

}
