package com.company.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
             System.out.println("""
                    Choose action:
                    1 - add
                    2 - subtract
                    3 - multiply
                    4 - divide""");

            int userChoice = 0;
            if (scanner.hasNextInt()) {
                userChoice = scanner.nextInt();

                if (userChoice > 4 || userChoice < 1) {
                    System.out.println("Выберите число от 1 до 4");
                } else {
                    System.out.println("Введите числа a и b: ");

                    while (!scanner.hasNextDouble()) {
                        System.out.println("Введите число");
                        scanner.next();
                    }
                    double a = scanner.nextDouble();

                    while (!scanner.hasNextDouble()) {
                        System.out.println("Введите число");
                        scanner.next();
                    }
                    double b = scanner.nextDouble();

                    double result = 0;
                    if (userChoice == 1) {
                        result = calculator.add(a, b);
                    }
                    if (userChoice == 2) {
                        result = calculator.subtract(a, b);
                    }
                    if (userChoice == 3) {
                        result = calculator.multiply(a, b);
                    }
                    if (userChoice == 4) {
                        result = calculator.divide(a, b);
                    }
                    System.out.println(result);
                }
            } else {
                scanner.next();
                System.out.println("Введите целое число.");
            }
        }
    }

}
