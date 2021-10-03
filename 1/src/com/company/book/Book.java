package com.company.book;

// Класс книга. В классе описана информация о названи книги, авторе книги,
// количестве страниц, количестве прочитанных страниц, есть ли картинки в книги, имени владельца книги.
//
// Конструктор без параметров, конструктор с параметрами, сеттеры, геттеры.
//
// Действия: прочитать одну страницу,
//           прочитать все страницы,
//           прочитать заданное количество страниц,
//           узнать прочитана ли книга или нет,
//           узнать является ли владельцем книги по имени
//           !!! вырвать страницу.
public class Book {
    private String name;
    private String authorName;
    private int pageNumber;
    private int pageRead;
    private boolean isWithPictures;
    private String ownerName;

    public Book() {
    }

    public Book(String name, String authorName, int pageNumber, boolean isWithPictures, String ownerName) {
        this.name = name;
        this.authorName = authorName;
        this.pageNumber = pageNumber;
        this.pageRead = 0;
        this.isWithPictures = isWithPictures;
        this.ownerName = ownerName;
    }

    public void readOnePage() {
        pageRead = pageRead + 1;
    }

    public void readAllPage() {
        pageRead = pageNumber;
    }

    public void readPage(int pages) {
        pageRead = pageRead + pages;
    }

    public boolean isFinished() {
        if (pageRead == pageNumber) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOwner(String name) {
        if (ownerName == name) {
            return true;
        } else {
            return false;
        }
    }

}
