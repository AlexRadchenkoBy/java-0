package com.company.oop.library;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Library {
    private User currentUser;
    private ArrayList<User> users;
    private ArrayList<Book> books;

    private static final String USER_PATH = "C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
            "company\\oop" + "\\library" + "\\resource\\user.txt";

    private static final String BOOK_PATH = "C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
            "company\\oop" + "\\library" + "\\resource\\book.txt";

    public Library() throws Exception {
        this.users = readUser(USER_PATH);
        this.books = readBooks(BOOK_PATH);
    }

    public void runInProgram() throws Exception {
        System.out.println("""
                0 - Выйти
                1 - Войти
                2 - Зарегистрироваться""");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0) {
            System.exit(0);
        } else if (number == 1) {
            enterProgram();
            while (true) {
                if (currentUser.getIsAdmin()) {
                    System.out.println("""
                            0 - Выйти
                            1 - Добавить книгу
                            2 - Сделать администратором
                            3 - Поиск книг
                            4 - Просмотреть каталог книг
                            5 - Добавить описание""");
                    int number1 = Integer.parseInt(scanner.nextLine());
                    if (number1 == 0) {
                        System.exit(0);
                    } else if (number1 == 1) {
                        addBook();
                    } else if (number1 == 2) {
                        installAdmin();
                    } else if (number1 == 3) {
                        executeBookSearch();
                    } else if (number1 == 4) {
                        viewCatalog();
                    } else if (number1 == 5) {
                        changeDescription();
                    }
                } else {
                    System.out.println("""
                            0 - Выйти
                            1 - Поиск книг
                            2 - Просмотреть каталог книг
                            3 - Предложить книгу""");
                    int number2 = Integer.parseInt(scanner.nextLine());
                    if (number2 == 0) {
                        System.exit(0);
                    } else if (number2 == 1) {
                        executeBookSearch();
                    } else if (number2 == 2) {
                        for (Book book : books) {
                            printBook(book);
                        }
                    } else if (number2 == 3) {
                       suggestBook();
                    }
                }
            }
        } else if (number == 2) {
            registerInLibrary();
        }
    }

    public void enterProgram() throws NoSuchAlgorithmException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите: ");
            System.out.print("Логин: ");
            String login = scanner.nextLine();
            System.out.print("Пароль: ");
            String password = scanner.nextLine();
            loginAndPassword(login, Hash.hashPassword(password));
            if (currentUser != null) {
                break;
            } else {
                System.out.println("Неккоректный ввод данных! Введите данные повторно!");
            }
        }
    }

    public void registerInLibrary() throws NoSuchAlgorithmException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите данные пользователя: ");
        System.out.print("Имя: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Пароль: ");
        String password = scanner.nextLine();
        createUser(name, email, Hash.hashPassword(password));
    }

    public void executeBookSearch() {
        Scanner title = new Scanner(System.in);
        Scanner author = new Scanner(System.in);
        System.out.println("Введите: ");
        System.out.print("Название книги ");
        String title1 = title.nextLine();
        System.out.print("Автор: ");
        String author1 = author.nextLine();
        printBook(bookSearch(title1, author1));
    }
    public void addBook() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные о книге: ");
        System.out.print("Тип книги: ");
        String type = scanner.nextLine();
        System.out.print("Название: ");
        String title = scanner.nextLine();
        System.out.print("Автор: ");
        String author = scanner.nextLine();
        System.out.print("Год издания: ");
        String year = scanner.nextLine();
        System.out.print("Описание: ");
        String description = scanner.nextLine();
        createBook(type, title, author, Integer.parseInt(year), description);
    }

    public void installAdmin() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите email пользователя: ");
        String email = scanner.nextLine();
        System.out.print("Введите true или false: ");
        String isAdmin = scanner.nextLine();
        makeAdministrator(email, isAdmin);
    }

    public void viewCatalog() {
        for (int i = 0; i < 2; i++) {
            printBook(books.get(i));
        }
        int pageNumber = 1;
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Для возврата в меню введите - 0 ");
            System.out.print("Страница: " + pageNumber + "/" + countNumberOfPages() + " " +
                    "Введите номер страницы: ");
            pageNumber = scanner.nextInt();
            if (pageNumber == 0) {
                break;
            }
            goToNextPage(pageNumber);
        }
    }

    public void changeDescription() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите: ");
        System.out.print("Название книги: ");
        String name = scanner.nextLine();
        System.out.print("Автор книги: ");
        String author = scanner.nextLine();
        System.out.print("Добавить описание: ");
        String description1 = scanner.nextLine();
        addDescription(bookSearch(name, author), description1);
        System.out.println("Введите: ");
        System.out.print("Текст: ");
        String textEmail = scanner.nextLine();
        for (User user : users) {
            Mailer.send(user.getEmail(), textEmail);
        }
    }

    public void suggestBook() {
        Scanner text = new Scanner(System.in);
        System.out.println("Введите вариант книги, название книги, автора, год издания, описание");
        Mailer.send(text.nextLine());
    }

    public void loginAndPassword(String login, String password) {
        for (User user : users) {
            if (Objects.equals(login, user.getEmail()) && Objects.equals(password, user.getPasswordHash())) {
                currentUser = user;
            }
        }
    }

    public void makeAdministrator(String email, String isAdmin) throws IOException {
        for (User user : users) {
            if (Objects.equals(email, user.getName())) {
                user.setIsAdmin(Boolean.parseBoolean(isAdmin));
            }
        }
        saveAllUsers();
    }

    public void saveAllUsers() throws IOException {
        FileWriter fileWriter = new FileWriter(USER_PATH, false);
        fileWriter.write("id,isAdmin,name,email,password");
        for (User user : users) {
            fileWriter.write("\n" + user.getId() + "," + user.getIsAdmin() + "," + user.getName() + ","
                    + user.getEmail() + "," + user.getPasswordHash());
        }
        fileWriter.flush();
    }

    public void createUser(String name, String email, String password) throws IOException {
        User user = new User(name, email, password);
        users.add(user);
        saveUser(user);
    }

    public void saveUser(User user) throws IOException {
        FileWriter file = new FileWriter(USER_PATH, true);
        file.write("\n" + user.getId() + "," + user.getIsAdmin() + "," + user.getName() + "," + user.getEmail() +
                "," + user.getPasswordHash());
        file.flush();
    }

    public void createBook(String type, String title, String author, int yearOfPublishing,
                           String description) throws IOException {
        Book book = new Book(type, title, author, yearOfPublishing, description);
        books.add(book);
        saveBook(book, true);
    }

    public void saveBook(Book book, boolean append) throws IOException {
        FileWriter file = new FileWriter(BOOK_PATH, append);
        file.write("\n" + book.getId() + "," + book.getType() + "," + book.getTitle() + "," + book.getAuthor() + ","
                + book.getYearOfPublishing() + "," + book.getDescription());
        file.flush();
    }

    public void addDescription(Book book, String description) throws IOException {
        book.setDescription(description);
        saveAllBooks();
    }

    public void saveAllBooks() throws IOException {
        FileWriter fileWriter = new FileWriter(BOOK_PATH, false);
        fileWriter.write("id,type,title,author,yearOfPublishing,description");
        for (Book book : books) {
            fileWriter.write("\n" + book.getId() + "," + book.getType() + "," + book.getTitle() + "," + book.getAuthor() + ","
                    + book.getYearOfPublishing() + "," + book.getDescription());
        }
        fileWriter.flush();
    }

    public Book bookSearch(String title, String author) {
        for (Book book : books) {
            if (Objects.equals(author, book.getAuthor()) && Objects.equals(title, book.getTitle())) {
                return book;
            }
        }
        return null;
    }

    public void printBook(Book book) {
        System.out.println(book.getId() + "," + book.getType() + "," + book.getTitle() + "," + book.getAuthor()
                + "," + book.getYearOfPublishing());
    }

    public int countNumberOfPages() {
        return (int) Math.ceil(books.size() / 2.0);
    }

    public void goToNextPage(int pageNumber) {
        int numberOfLines = 2;
        int from = (pageNumber - 1) * numberOfLines;
        int to = from + numberOfLines;
        if (pageNumber == countNumberOfPages()) {
            to = from + (books.size() - (numberOfLines * (countNumberOfPages() - 1)));
        }
        for (int i = from; i < to; i++) {
            printBook(books.get(i));
        }
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

