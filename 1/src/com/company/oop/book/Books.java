package com.company.oop.book;

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

    public Book[] findByAuthor(String author) {
        int bookNumberByAuthor = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                bookNumberByAuthor++;
            }
        }
        Book[] filteredBooksByAuthor = new Book[bookNumberByAuthor];
        for (int i = 0, j = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                filteredBooksByAuthor[j] = books[i];
                j++;
            }
        }
        return filteredBooksByAuthor;
    }

    public Book[] findByPublisher(String publisher) {
        int bookNumberByPublisher = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishingHouse().equals(publisher)) {
                bookNumberByPublisher++;
            }
        }
        Book[] filteredBooksByPublisher = new Book[bookNumberByPublisher];
        for (int i = 0, j = 0; i < books.length; i++) {
            if (books[i].getPublishingHouse().equals(publisher)) {
                filteredBooksByPublisher[j] = books[i];
                j++;
            }
        }
        return filteredBooksByPublisher;
    }

    public Book[] findMoreYear(int year) {
        int bookNumberMoreYear = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYearOfPublishing() > year) {
                bookNumberMoreYear++;
            }
        }
        Book[] filteredBooksMoreYear = new Book[bookNumberMoreYear];
        for (int i = 0, j = 0; i < books.length; i++) {
            if (books[i].getYearOfPublishing() > year) {
                filteredBooksMoreYear[j] = books[i];
                j++;
            }
        }
        return filteredBooksMoreYear;
    }
}
