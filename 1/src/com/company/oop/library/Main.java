package com.company.oop.library;

public class Main {
    public static void main(String[] args) throws Exception {
        checkLibrary();
    }

    public static void checkLibrary() throws Exception {
        Library library = new Library();
        library.createUser(true, "Миша", "test@test");
        System.out.println(library.readBooks("C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
                "company\\oop" + "\\library" + "\\resource\\book.txt"));
    }
}
