package com.company.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
                    System.out.println(calculate(scanner, userChoice));
                }
            } else {
                scanner.next();
                System.out.println("Введите целое число.");
            }
        }
    }

    private static double calculate(Scanner scanner, int userChoice) {
        return chooseAction(userChoice, getNumber(scanner), getNumber(scanner));
    }

    private static double getNumber(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Введите число");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static double chooseAction(int userChoice, double a, double b) {
        return switch(userChoice) {
            case 1 -> Calculator.add(a, b);
            case 2 -> Calculator.subtract(a, b);
            case 3 -> Calculator.multiply(a, b);
            case 4 -> Calculator.divide(a, b);
            default -> 0;
        };
    }

}
