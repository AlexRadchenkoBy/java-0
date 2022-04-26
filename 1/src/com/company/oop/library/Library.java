package com.company.oop.library;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// - создать меню регистрации\входа;
// - если вход, то вводим пароль и email;
// - поиск по введенным данным пользователя;
// - если данные введены неверно ввести данные повторно;
// - аутентификация пользователя, записываем user  в переменную currentUser;
// - показать меню в зависимости от статуса пользователя;
// - если регистрация, вводит свои данные и придумывает пароль;
// - сохраняем пользователя в базу данных и записываем его в переменную currentUser;
// - покзать меню в зависимости от статуса пользователя;
// - если выйти из аккаунта  засетать currentUser в Null;
public class Library {
    private ArrayList<User> users;
    private ArrayList<Book> books;

    public Library() throws Exception {
        this.users = readUser("C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
                "company\\oop" + "\\library" + "\\resource\\user.txt");
        this.books = readBooks("C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
                "company\\oop" + "\\library" + "\\resource\\book.txt");
    }

    public void runInProgram() {
        System.out.println("1 - Войти" + "\n" + "2 - Зарегистрироваться");
    }

    public void createUser(boolean isAdmin, String name, String email) throws IOException {
        User user = new User(isAdmin, name, email);
        users.add(user);
        saveUser(user);
    }

    public void saveUser(User user) throws IOException {
        FileWriter file = new FileWriter("C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
                "company\\oop" + "\\library" + "\\resource\\user.txt", true);
        file.write("\n" + user.getId() + "," + user.getIsAdmin() + "," + user.getName() + "," + user.getEmail());
        file.flush();
    }

    public void createBook(String type, String title, String author, int yearOfPublishing) throws IOException {
        Book book = new Book(type, title, author, yearOfPublishing);
        books.add(book);
        saveBook(book);
    }

    public void saveBook(Book book) throws IOException {
        FileWriter file =  new FileWriter("C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
                "company\\oop" + "\\library" + "\\resource\\book.txt", true);
        file.write("\n" + book.getId() + "," + book.getType() + "," + book.getTitle() + "," + book.getAuthor() + ","
                + book.getYearOfPublishing());
        file.flush();
    }

    public ArrayList<Book> readBooks(String pathToFile) throws Exception {
        ArrayList<String> rows = new ArrayList<>();
        FileReader file = new FileReader(pathToFile);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
           rows.add(scanner.nextLine());
        }
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 1; i < rows.size(); i++) {
            String[] fields = rows.get(i).split(",");
            Book book = new Book(fields[0], fields[1], fields[2], fields[3], Integer.parseInt(fields[4]));
            books.add(book);
        }
        return books;
    }

    public ArrayList<User> readUser(String pathToFile) throws Exception {
        ArrayList<String> rows = new ArrayList<>();
        FileReader file = new FileReader(pathToFile);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            rows.add(scanner.nextLine());
        }
        ArrayList<User> users = new ArrayList<>();
        for (int i = 1; i < rows.size(); i++) {
            String[] fields = rows.get(i).split(",");
            User user = new User(fields[0], Boolean.parseBoolean(fields[1]), fields[2], fields[3]);
            users.add(user);
        }
        return users;
    }

    @Override
    public String toString() {
        return "Library{" +
                "users=" + users +
                ", books=" + books +
                '}';
    }
}

