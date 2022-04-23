package com.company.oop.library;

public class Main {
    public static void main(String[] args) throws Exception {
        checkLibrary();
    }

    public static void checkLibrary() throws Exception {
        Library library = new Library();
        library.createUser(true, "Миша", "test@test");
        library.createUser(false, "Владимр", "vladimir.com");
        System.out.println(library.toString());
    }
}
