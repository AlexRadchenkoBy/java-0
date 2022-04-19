package com.company.oop.library;

public class Main {
    public static void main(String[] args) {
        checkLibrary();
    }

    public static void checkLibrary() {
        Library library = new Library();
        library.createUser(true, "Миша", "test@test");
    }
}
