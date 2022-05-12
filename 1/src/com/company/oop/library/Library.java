package com.company.oop.library;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

// - заменить добавить пользователя на сделать администратором другого пользователя;
// - хэшировать пароли (использвать sha-256);
// - создать класс в котором будут функции по отправке сообщения на email (класс не должен быть привязан к заданию);
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
        System.out.println("""
                0 - Выйти
                1 - Войти
                2 - Зарегистрироваться""");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            System.exit(0);
        } else if (number == 1) {
            while (true) {
                Scanner loginScanner = new Scanner(System.in);
                Scanner passwordScanner = new Scanner(System.in);
                System.out.println("Введите: ");
                System.out.print("Логин: ");
                String login = loginScanner.nextLine();
                System.out.print("Пароль: ");
                String password = passwordScanner.nextLine();
                loginAndPassword(login, password);
                if (currentUser != null) {
                    break;
                } else {
                    System.out.println("Неккоректный ввод данных! Введите данные повторно!");
                }
            }
            while (true) {
                if (currentUser.getIsAdmin()) {
                    System.out.println("""
                            0 - Выйти
                            1 - Добавить книгу
                            2 - Сделать администратором
                            3 - Поиск книг
                            4 - Просмотреть каталог книг
                            5 - Добавить описание""");
                    Scanner scanner1 = new Scanner(System.in);
                    int number1 = scanner1.nextInt();
                    if (number1 == 0) {
                        System.exit(0);
                    } else if (number1 == 1) {
                        System.out.println("Введите данные о книге: тип книги, название, автор, год издания, описание");
                        Scanner saveType = new Scanner(System.in);
                        Scanner saveTitle = new Scanner(System.in);
                        Scanner saveAuthor = new Scanner(System.in);
                        Scanner saveYearOfPublishing = new Scanner(System.in);
                        Scanner saveDescription = new Scanner(System.in);
                        createBook(saveType.nextLine(), saveTitle.nextLine(), saveAuthor.nextLine(),
                                saveYearOfPublishing.nextInt(), saveDescription.nextLine());
                    } else if (number1 == 2) {
                        Scanner emailScanner = new Scanner(System.in);
                        Scanner isAdminScanner = new Scanner(System.in);
                        System.out.print("Введите email пользователя: ");
                        String email = emailScanner.nextLine();
                        System.out.print("Введите true или false: ");
                        String isAdmin = isAdminScanner.nextLine();
                        makeAdministrator(email, isAdmin);
                    } else if (number1 == 3) {
                        Scanner title = new Scanner(System.in);
                        Scanner author = new Scanner(System.in);
                        System.out.println("Введите: ");
                        System.out.print("Название книги ");
                        String title1 = title.nextLine();
                        System.out.print("Автор: ");
                        String author1 = author.nextLine();
                        printBook(bookSearch(title1, author1));
                    } else if (number1 == 4) {
                        for (Book book : books) {
                            printBook(book);
                        }
                    } else if (number1 == 5) {
                        Scanner nameBook = new Scanner(System.in);
                        Scanner authorBook = new Scanner(System.in);
                        Scanner description = new Scanner(System.in);
                        System.out.println("Введите: ");
                        System.out.print("Название книги: ");
                        String name = nameBook.nextLine();
                        System.out.print("Автор книги: ");
                        String author = authorBook.nextLine();
                        System.out.print("Добавить описание: ");
                        String description1 = description.nextLine();
                        addDescription(bookSearch(name, author), description1);
                    }
                } else {
                    System.out.println("""
                            0 - Выйти
                            1 - Поиск книг
                            2 - Просмотреть каталог книг
                            3 - Предложить книгу""");
                    Scanner scanner2 = new Scanner(System.in);
                    int number2 = scanner2.nextInt();
                    if (number2 == 0) {
                        System.exit(0);
                    } else if (number2 == 1) {
                        Scanner title = new Scanner(System.in);
                        Scanner author = new Scanner(System.in);
                        System.out.println("Введите: ");
                        System.out.print("Название книги ");
                        String title1 = title.nextLine();
                        System.out.print("Автор: ");
                        String author1 = author.nextLine();
                        printBook(bookSearch(title1, author1));
                    } else if (number2 == 2) {
                        for (Book book : books) {
                            printBook(book);
                        }
                    }
                }
            }
        } else if (number == 2) {
            Scanner saveName = new Scanner(System.in);
            Scanner saveEmail = new Scanner(System.in);
            Scanner savePassword = new Scanner(System.in);
            System.out.println(" Введите данные пользователя: ");
            System.out.print("Имя: ");
            String name = saveName.nextLine();
            System.out.print("Email: ");
            String email = saveEmail.nextLine();
            System.out.print("Пароль: ");
            String password = savePassword.nextLine();
            createUser(name, email, password);
        }
    }

    public void loginAndPassword(String login, String password) {
        for (User user : users) {
            if (Objects.equals(login, user.getEmail()) && Objects.equals(password, user.getPassword())) {
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
        FileWriter fileWriter = new FileWriter("C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
                "company\\oop" + "\\library" + "\\resource\\user.txt", false);
        fileWriter.write("id,isAdmin,name,email,password");
        for (User user : users) {
            fileWriter.write("\n" + user.getId() + "," + user.getIsAdmin() + "," + user.getName() + ","
                    + user.getEmail() + "," + user.getPassword());
        }
        fileWriter.flush();
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
        for (Book book : books) {
            if (Objects.equals(author, book.getAuthor()) && Objects.equals(title, book.getTitle())) {
                return book;
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

