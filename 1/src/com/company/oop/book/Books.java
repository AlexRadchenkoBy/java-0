package com.company.oop.book;

import com.company.oop.customer.Customer;

public class Books {
    // Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
    //метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
    //методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
    //Найти и вывести:
    //a) список книг заданного автора;
    //b) список книг, выпущенных заданным издательством;
    //c) список книг, выпущенных после заданного года.

    Book[] books;

    public Books(Book[] books) {
        this.books = books;
    }

    public Book[] findListBooksAuthors(String author) {
        int filteredAuthors = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor() == author) {
                filteredAuthors++;
            }
        }
        Book[] filteredAuthorBooks = new Book[filteredAuthors];
        for (int i = 0, j = 0; i < books.length; i++) {
            if (books[i].getAuthor() == author) {
                filteredAuthorBooks[j] = books[i];
                j++;
            }
        }
        return filteredAuthorBooks;
    }

    public Book[] findPublishingListOfHouse(String publisher) {
        int filteredPublisher = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishingHouse() == publisher) {
                filteredPublisher++;
            }
        }
        Book[] filteredPublishingHouse = new Book[filteredPublisher];
        for (int i = 0, j = 0; i < books.length; i++) {
            if (books[i].getPublishingHouse() == publisher) {
                filteredPublishingHouse[j] = books[i];
                j++;
            }
        }
        return filteredPublishingHouse;
    }

    public Book[] findYearOfPublishing(int year) {
        int filteredYearPublishing = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYearOfPublishing() > year) {
                filteredYearPublishing++;
            }
        }
        Book[] filteredYearOfPublishing = new Book[filteredYearPublishing];
        for (int i = 0, j = 0; i < books.length; i++) {
            if (books[i].getYearOfPublishing() > year) {
                filteredYearOfPublishing[j] = books[i];
                j++;
            }
        }
        return filteredYearOfPublishing;
    }
}
