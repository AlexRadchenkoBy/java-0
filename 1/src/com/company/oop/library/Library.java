package com.company.oop.library;

import java.io.File;
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
                        2 - Добавить пользователя
                        3 - Поиск книг
                        4 - Просмотреть каталог книг
                        5 - Добавить описание""");
                Scanner scanner1 = new Scanner(System.in);
                int number1 = scanner1.nextInt();
                if (number1 == 1) {
                    System.out.println("Введите данные о книге: тип книги, название, автор, год издания, описание");
                    Scanner saveType = new Scanner(System.in);
                    Scanner saveTitle = new Scanner(System.in);
                    Scanner saveAuthor = new Scanner(System.in);
                    Scanner saveYearOfPublishing = new Scanner(System.in);
                    Scanner saveDescription = new Scanner(System.in);
                    createBook(saveType.nextLine(), saveTitle.nextLine(), saveAuthor.nextLine(),
                            saveYearOfPublishing.nextInt(), saveDescription.nextLine());
                } else if (number1 == 2) {
                    System.out.println("""
                            Введите данные пользователя
                            Имя:\s
                            email:\s
                            Пароль:\s""");
                    Scanner saveName = new Scanner(System.in);
                    Scanner saveEmail = new Scanner(System.in);
                    Scanner savePassword = new Scanner(System.in);
                    createUser(saveName.nextLine(), saveEmail.nextLine(), savePassword.nextLine());
                } else if (number1 == 3) {
                    System.out.println("""
                            Введите:\s
                            Название книги:\s
                            Автор:\s""");
                    Scanner title = new Scanner(System.in);
                    Scanner author = new Scanner(System.in);
                    printBook(bookSearch(title.nextLine(), author.nextLine()));
                } else if (number1 == 4) {
                    for (int i = 0; i < books.size(); i++) {
                        printBook(books.get(i));
                    }
                } else if (number1 == 5) {
                    System.out.println("Введите название и автора книги: " + "\n" + "Добавте описание: ");
                    Scanner nameBook = new Scanner(System.in);
                    Scanner authorBook = new Scanner(System.in);
                    Scanner description = new Scanner(System.in);
                    addDescription(bookSearch(nameBook.nextLine(), authorBook.nextLine()), description.nextLine());

                }
            } else {
                System.out.println("""
                        1 - Поиск книг
                        2 - Просмотреть каталог книг
                        3 - Предложить книгу""");
                Scanner scanner2 = new Scanner(System.in);
                int number2 = scanner2.nextInt();
                if (number2 == 1) {
                    System.out.println("""
                            Введите:\s
                            Название книги:\s
                            Автор:\s""");
                    Scanner title = new Scanner(System.in);
                    Scanner author = new Scanner(System.in);
                    printBook(bookSearch(title.nextLine(), author.nextLine()));
                } else if (number2 == 2) {
                    for (int i = 0; i < books.size(); i++) {
                        printBook(books.get(i));
                    }
                }
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

    public void createBook(String type, String title, String author, int yearOfPublishing,
                           String description) throws IOException {
        Book book = new Book(type, title, author, yearOfPublishing, description);
        books.add(book);
        saveBook(book, true);
    }

    public void saveBook(Book book, boolean append) throws IOException {
        FileWriter file = new FileWriter("C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
                "company\\oop" + "\\library" + "\\resource\\book.txt", append);
        file.write("\n" + book.getId() + "," + book.getType() + "," + book.getTitle() + "," + book.getAuthor() + ","
                + book.getYearOfPublishing() + "," + book.getDescription());
        file.flush();
    }
    // - найти книгу, передать ее в addDescription;
    // - добавить текст в поле description;
    // - перезаписать запись в текстовом файле;
    public void addDescription(Book book, String description) throws IOException {
        book.setDescription(description);
        saveAllBooks();
    }

    public void saveAllBooks() throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
                "company\\oop" + "\\library" + "\\resource\\book.txt", false);
        fileWriter.write("id,type,title,author,yearOfPublishing,description");
        for (Book book : books) {
            fileWriter.write("\n" + book.getId() + "," + book.getType() + "," + book.getTitle() + "," + book.getAuthor() + ","
                    + book.getYearOfPublishing() + "," + book.getDescription());
        }
        fileWriter.flush();
    }

    public Book bookSearch(String title, String author) {
        for (int i = 0; i < books.size(); i++) {
            if (Objects.equals(author, books.get(i).getAuthor()) && Objects.equals(title, books.get(i).getTitle())) {
                return books.get(i);
            }
        }
        return null;
    }

    public void printBook(Book book) {
        System.out.println("\n" + book.getId() + "," + book.getType() + "," + book.getTitle() + "," + book.getAuthor()
                + "," + book.getYearOfPublishing());
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
            Book book = new Book(fields[0], fields[1], fields[2], fields[3], Integer.parseInt(fields[4]), fields[5]);
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

