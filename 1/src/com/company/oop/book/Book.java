package com.company.oop.book;

public class Book {
    // Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
    //метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
    //методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
    //Найти и вывести:
    //a) список книг заданного автора;
    //b) список книг, выпущенных заданным издательством;
    //c) список книг, выпущенных после заданного года.

    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
    private String price;
    private String bindingType;

    public Book(int id, String title, String author, String publishingHouse, int yearOfPublishing, int numberOfPages,
                String price, String bindingType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor() {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String toString() {
        return "id: " + id + ", title: " + title + ", author: " + author + ", publishingHouse: " + publishingHouse
                + ", yearOfPublishing: " + yearOfPublishing + ", numberOfPages: " + numberOfPages
                + ", price: " + price + ", bindingType" + bindingType;
    }


}
