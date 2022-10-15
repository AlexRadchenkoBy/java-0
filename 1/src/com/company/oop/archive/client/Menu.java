package com.company.oop.archive.client;

import com.company.oop.archive.Case;
import com.company.oop.archive.Hash;
import com.company.oop.archive.User;

import java.util.Scanner;

public class Menu {

    private User currentUser;
    private Case currentCase;

    public void runInProgram(Client client) {
        System.out.println("""
                0 - Выйти
                1 - Войти
                2 - Зарегистрироваться""");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0) {
            System.exit(0);
        } else if (number == 1) {
            while (true) {
                System.out.println("Введите: ");
                System.out.print("Логин: ");
                String login = scanner.nextLine();
                System.out.print("Пароль: ");
                String password = scanner.nextLine();

                currentUser = ApiService.login(client, login, password);

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
                            1 - Добавить личное дело
                            2 - Изменить личное дело
                            3 - Просмотр личных дел
                            4 - Поиск личного дела
                            """);
                    int number1 = Integer.parseInt(scanner.nextLine());
                    if (number1 == 0) {
                        System.exit(0);
                    } else if (number1 == 1) {
                        System.out.println("Введите: ");
                        System.out.print("Имя: ");
                        String name = scanner.nextLine();
                        System.out.print("Фамилия: ");
                        String surname = scanner.nextLine();
                        System.out.print("Год рождения: ");
                        int yearOfBirth = Integer.parseInt(scanner.nextLine());
                        System.out.print("Факультет: ");
                        String faculty = scanner.nextLine();

                        currentCase = ApiService.aCase(client, name, surname, String.valueOf(yearOfBirth), faculty);
//
                    } else if (number1 == 2) {
//                        System.out.println("Введите: ");
//                        System.out.print("Имя: ");
//                        String name = scanner.nextLine();
//                        System.out.print("Фамилия: ");
//                        String surname = scanner.nextLine();
//                        System.out.print("Год рождения: ");
//                        int yearOfBirth = Integer.parseInt(scanner.nextLine());
//                        printCase(searchCase(name, surname, yearOfBirth));
//                        System.out.print("Изменить факультет: ");
//                        String faculty = scanner.nextLine();
//                        changeTheCase(faculty, searchCase(name, surname, yearOfBirth));
                    } else if (number1 == 3) {
//                        for (Case caseElement : cases) {
//                            printCase(caseElement);
//                            System.out.println("____________________");
//                        }
                    } else if (number1 == 4) {
//                        caseSearch();
                    }
                } else {
//                    System.out.println("""
//                            0 - Выйти
//                            1 - Поиск личного дела
//                            """);
//                    int number2 = Integer.parseInt(scanner.nextLine());
//                    if (number2 == 0) {
//                        System.exit(0);
//                    } else if (number2 == 1) {
//                        caseSearch();
//                    }
                }
            }
        } else if (number == 2) {
            System.out.println("Введите: ");
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Пароль: ");
            String password = scanner.nextLine();

            currentUser = ApiService.user(client, email, Hash.hashPassword(password));
        }
    }

}
