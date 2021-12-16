package com.company.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        doTask6();
    }

    public static void doTask1() {
        int a = 1;
        int b = 2;
        int c = 3;
        int sub = a - 3;
        double divide = b / 2;
        double multiplay = sub * divide;
        double z = ((a - 3) * b / 2) + c;
        System.out.println("z " + (multiplay + c));
    }

    public static void doTask2() {
        double x = 5.5;
        double y = 2.5;
        double sinX = Math.sin(x);
        double cosY = Math.cos(y);
        double cosX = Math.cos(x);
        double sinY = Math.sin(y);
        double tgXy = Math.tan(x * y);
        double totalValue = ((sinX + cosY) / (cosX - sinY)) * tgXy;
        System.out.println(totalValue);
    }

    public static void doTask3() {
        int T = 124_123;
        int hours = T / 3600;
        int remainderSeconds = T - hours * 3600;
        int minutes = remainderSeconds / 60;
        int seconds = remainderSeconds % 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
    }

    public static void doTask4() {
        int angle1 = 45;
        int angle2 = 60;
        int angle3 = 180 - (angle1 + angle2);
        if (angle1 + angle2 < 180) {
            System.out.println("Треугольник существует ");
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Прямой треугольник");
            } else {
                System.out.println("Не прямой треугольник");
            }
        } else {
            System.out.println("Треугольник не существует");
        }
    }

    // - сгенерировать 4 случайных числа (a, b, c, d);
    // - найти минимальное число из a, b и из c, d;
    // - найти максимальное число из двух полученных чисел;
    // - вывести максимальное число.
    public static void doTask5() {
        // генерируем четыре случайных числа.
        int[] array1 = new int[4];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * (20 - 1) + 1);
        }
        // находим минимальное число из а, b и из c, d.
        int min1 = Math.min(array1[0], array1[1]);
        int min2 = Math.min(array1[2], array1[3]);
        // находим максимальное число из двух чисел.
        int maxNumber = Math.max(min1, min2);
        System.out.println(maxNumber);
    }

    public static void doTask6() {
        for (; ; ) {
            System.out.println("Введите любое целое положительное число");
            Scanner scanner = new Scanner(System.in);
            int anyPositiveInteger = -1;
            if (scanner.hasNextInt() && (anyPositiveInteger = scanner.nextInt()) > 0) {
                int sumNumber = 0;
                for (int i = 1; i <= anyPositiveInteger; i++) {
                    sumNumber = sumNumber + i;
                }
                System.out.println("Cумма чисел равна " + sumNumber);
            } else {
                System.out.println("Вводите только целые положительные числа ");
            }
        }
    }
}



