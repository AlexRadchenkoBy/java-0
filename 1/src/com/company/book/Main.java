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
        book1.removeOnePage();
        System.out.println(book1.getPageRead());

        Book book2 = new Book("Crazy", "Jek", 246, true, "David");
        Book book3 = new Book();

        book1.readAllPage();
        book2.readAllPage();
        book3.readAllPage();

        Book[] books = new Book[3];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;

        for (int i = 0; i < 3; i++) {
            books[i].readAllPage(); //books[0].readAllPage(); books[1].readAllPage(); books[2].readAllPage();
        }

        for (int i = 2; i > -1; i--) {
            books[i].removeOnePage();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(books[i].getPageRead());
        }


//        for (int i = 0; i < 3; i++) {
//            Book book = new Book(
//                    bd[i].name, bd[i].authoName, bd[i].pageNumber,
//                    bd[i].isWitchPircture, bd[i].ownerName
//            );
//            books[i] = book;
//        }
    }

// i++ ???
}
