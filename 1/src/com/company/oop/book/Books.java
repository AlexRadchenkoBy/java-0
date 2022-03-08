package com.company.oop.book;

import java.util.ArrayList;

public class Books {
    // Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
    //метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
    //методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
    //Найти и вывести:
    //a) список книг заданного автора;
    //b) список книг, выпущенных заданным издательством;
    //c) список книг, выпущенных после заданного года.

     ArrayList<Book> books;

    public Books(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> findByAuthor(String author) {
        ArrayList<Book> filteredBooksByAuthor = new ArrayList<Book>();
        for (int i = 0, j = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) {
                filteredBooksByAuthor.add(j, books.get(i));
                j++;
            }
        }
        return filteredBooksByAuthor;
    }

    public ArrayList<Book> findByPublisher(String publisher) {
        ArrayList<Book> filteredBooksByPublisher = new ArrayList<Book>();
        for (int i = 0, j = 0; i < books.size(); i++) {
            if (books.get(i).getPublishingHouse().equals(publisher)) {
                filteredBooksByPublisher.add(j, books.get(i));
                j++;
            }
        }
        return filteredBooksByPublisher;
    }

    public ArrayList<Book> findMoreYear(int year) {
        ArrayList<Book> filteredBooksMoreYear = new ArrayList<Book>();
        for (int i = 0, j = 0; i < books.size(); i++) {
            if (books.get(i).getYearOfPublishing() > year) {
                filteredBooksMoreYear.add(j, books.get(i));
                j++;
            }
        }
        return filteredBooksMoreYear;
    }
}
