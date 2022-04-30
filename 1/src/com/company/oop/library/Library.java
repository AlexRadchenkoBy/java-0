package com.company.oop.library;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

// - создать меню регистрации\входа;
// - если вход, то вводим пароль и email;
// - поиск по введенным данным пользователя;
// - аутентификация пользователя, записываем user  в переменную currentUser;
// - показать меню в зависимости от статуса пользователя;
// - если данные введены неверно ввести данные повторно;
// - если регистрация, вводит свои данные и придумывает пароль;
// - сохраняем пользователя в базу данных и записываем его в переменную currentUser;
// - покзать меню в зависимости от статуса пользователя;
// - если выйти из аккаунта  засетать currentUser в Null;
public class Library {
    private User currentUser;
    private ArrayList<User> users;
    private ArrayList<Book> books;

    public Library() throws Exception {
        this.users = readUser("C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
                "company\\oop" + "\\library" + "\\resource\\user.txt");
        this.books = readBooks("C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
                "company\\oop" + "\\library" + "\\resource\\book.txt");
    }

    public void runInProgram() throws Exception {
        System.out.println("1 - Войти" + "\n" + "2 - Зарегистрироваться");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("""
                    Введите:\s
                    Логин:\s
                    Пороль:""");
            while (true) {
                Scanner loginScanner = new Scanner(System.in);
                Scanner passwordScanner = new Scanner(System.in);
                loginAndPassword(loginScanner.nextLine(), passwordScanner.nextLine());
                if (currentUser != null) {
                    break;
                } else {
                    System.out.println("Неккоректный ввод данных! Введите данные повторно!");
                }
            }
            if (currentUser.getIsAdmin()) {
                System.out.println("""
                        1 - Добавить книгу
                        2 - Добавить клиента
                        3 - Поиск книг
                        4 - Добавить описание""");
            } else {
                System.out.println("1 - Поиск книг");
            }
        } else if (number == 2) {
            System.out.println("""
                    Введите ваши данные
                    Имя:\s
                    email:\s
                    Пароль:""");
            Scanner saveName = new Scanner(System.in);
            Scanner saveEmail = new Scanner(System.in);
            Scanner savePassword = new Scanner(System.in);
            createUser(saveName.nextLine(), saveEmail.nextLine(), savePassword.nextLine());
        }
    }


    public void loginAndPassword(String login, String password) {
        for (int i = 0; i < users.size(); i++) {
            if (Objects.equals(login, users.get(i).getEmail()) && Objects.equals(password, users.get(i).getPassword())) {
                currentUser = users.get(i);
            }
        }
    }

    public void createUser(String name, String email, String password) throws IOException {
        User user = new User(name, email, password);
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
        FileWriter file = new FileWriter("C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
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
            User user = new User(fields[0], Boolean.parseBoolean(fields[1]), fields[2], fields[3], fields[4]);
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

