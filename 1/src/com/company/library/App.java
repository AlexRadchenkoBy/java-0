package com.company.library;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] jgjkhgi) {
        Book book1 = new Book("title1", "authorName1", 400);
        Book book2 = new Book("title2", "authorName1", 300);
        Book book3 = new Book("title3klkk", "authorName1", 200);
        Book book4 = new Book("title4", "authorName2", 100);
        Book book5 = new Book("title5", "authorName2", 400);
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(book1, book2, book3, book4, book5));
        Library library = new Library(books);



//        ArrayList<Book> booksWherePagesMore300 = library.findBookWhereMorePageAmount(300);
//        for (int i = 0; i < booksWherePagesMore300.size(); i++) {
//            System.out.println(booksWherePagesMore300.get(i).getTitle());
//        }

        ArrayList<Book> booksByAuthorName = library.findBooksByAuthorName("authorName2");
        for (int i = 0; i < booksByAuthorName.size(); i++) {
            System.out.println(booksByAuthorName.get(i).getAuthorName());
        }

        ArrayList<Book> booksByTitle = library.findBooksByTitle("title3");
        for (int i = 0; i < booksByTitle.size(); i++) {
            System.out.println(booksByTitle.get(i).getTitle());
        }

    }

}
