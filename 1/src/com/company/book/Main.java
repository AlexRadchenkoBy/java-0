package com.company.book;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(
                "War and Peace", "Tolstoy", 300,
                false, "Aleksandr"
        );

        System.out.println(book1.getPageRead());
        book1.readAllPage();
        System.out.println(book1.getPageRead());
        book1.readOnePage();
        System.out.println(book1.getPageRead());

    }


}
