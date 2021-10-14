package com.company.library;

public class App {

    public static void main(String[] jgjkhgi) {
        Book book1 = new Book ("title1", "authorName1", 400);
        Book book2 = new Book ("title2", "authorName1", 300);
        Book book3 = new Book ("title3", "authorName1", 200);
        Book book4 = new Book ("title4", "authorName2", 100);
        Book book5 = new Book ("title5", "authorName2", 400);
        Book[] books = new Book[] {book1, book2, book3, book4, book5};

        Book[] booksWherePagesMore300 = new Book[5];
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPages() >= 300) {
//                booksWherePagesMore300 = new Book[];
                booksWherePagesMore300[i] = books[i];
            }
        }

        System.out.println(booksWherePagesMore300);

    }

}
