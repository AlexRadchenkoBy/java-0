package com.company.oop.library;

public class Main {
    public static void main(String[] args) throws Exception {
        checkLibrary();
    }

    public static void checkLibrary() throws Exception {
        Library library = new Library();
        library.createUser(true, "Миша", "test@test");
        library.createUser(false, "Владимр", "vladimir.com");
        library.createBook("печатный вариант", "Пагоня на Грюнвальд", "Тарасов К.", 2013);
        System.out.println(library.toString());
    }
}
