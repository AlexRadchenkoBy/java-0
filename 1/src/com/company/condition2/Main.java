package com.company.condition2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //1 вывести, является ли переменая num четной или нечетной
        //int a = 3 % 2; - узнать остаток = 1
        //int a = 4 % 2; - узнать остаток = 0
        {
            int num = getRandomInt(0, 100);
            System.out.printf("#1: %s%n", num);
            int a = num % 2;
            if (a == 0) {
                System.out.println("четное число");
            } else {
                System.out.println("нечетное число");
            }
        }
        //2 если переменная one равна 1, то вывести это число
        {
            int one = 1;
            System.out.printf("#2: %s%n", one);
            if (one == 1) {
                System.out.println(one);
            }
        }
        //3 если переменная n меньше 10, то вывести это число, иначе вывести что "число больше 10"
        {
            int n = getRandomInt(0, 100);
            System.out.printf("#3: %s%n", n);
            if (n < 10) {
                System.out.println(n);
            } else {
                System.out.println("число больше 10");
            }
        }
        //4 если переменная n2 больше 0, то вывести "+", иначе вывести "-"
        {
            int n2 = getRandomInt(-100, 100);
            System.out.printf("#4: %s%n", n2);
            if (n2 > 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
        //5 если переменная a больше b, то вывести "a больше b", иначе вывести "b больше a"
        {
            int a = getRandomInt(0, 100);
            int b = getRandomInt(0, 100);
            System.out.printf("#5: %s, %s%n", a, b);
            if (a > b) {
                System.out.println("a больше b");
            } else {
                System.out.println("b больше а");
            }
        }
        //6 есть переменные a, b вывести наибольшую переменую
        {
            int a = getRandomInt(0, 100);
            int b = getRandomInt(0, 100);
            System.out.printf("#6: %s, %s%n", a, b);
            if (a > b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
        //7 есть переменные a, b, c вывести наибольшую переменую
        {
            int a = getRandomInt(0, 100);
            int b = getRandomInt(0, 100);
            int c = getRandomInt(0, 100);
            System.out.printf("#7: %s, %s, %s%n", a, b, c);
            if (a > b && a > c) {
                System.out.println(a);
            } else if (b > a && b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
        //8 Вывести в консоль большую переменную
        {
            int a = getRandomInt(0, 100);
            int b = getRandomInt(0, 100);
            System.out.printf("#8: %s, %s%n", a, b);
            if (a > b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
        //9 Определить равны ли переменный a и b и вести ответ "yes" если равны, или "no" если не равны
        {
            int a = getRandomInt(0, 1);
            int b = getRandomInt(0, 1);
            System.out.printf("#9: %s, %s%n", a, b);
            if (a == b) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        //10 Определить a является однозначным(1), или двухзначным(2), или трехзначным(3). Вывести, то что в скобках
        {
            int a = getRandomInt(0, 999);
            System.out.printf("#10: %s%n", a);
            if (a < 10) {
                System.out.println(1);
            } else if (a < 100) {
                System.out.println(2);
            } else if (a < 1000) {
                System.out.println(3);
            }
        }
        //11 Определить a делится на 3 нацело или нет. Если да, то вывести "Yes"
        {
            int a = getRandomInt(0, 999);
            System.out.printf("#11: %s%n", a);
            int num = a % 3;
            if (num == 0) {
                System.out.println("Yes");
            }
        }
        //12 Определить a делится на 5 нацело или нет. Если нет, то вывести "No"
        {
            int a = getRandomInt(0, 999);
            System.out.printf("#12: %s%n", a);
            int num = a % 5;
            if (num != 0) {
                System.out.println("No");
            }
        }
        //13 Вывести на экран ответ "Yes", если год является високосным.
        //   Обычно каждый год, который делится на 4, - это високосный год, кроме лет столетий (делящихся на 100).
        //   Но среди последних год, делящихся на 400, также считается високосным.
        {
            int year = getRandomInt(0, 2110);
            System.out.printf("#13: %s%n", year);
            int num1 = year % 4;
            int num2 = year % 100;
            int num3 = year % 400;
            if ((num1 == 0 || num3 == 0) && num2 != 0) {
                System.out.println("Yes");
            }
        }
        //14 Если a меньше b, то вывести их сумму, иначе - разность первого и второго
        {
            int a = getRandomInt(0, 100);
            int b = getRandomInt(0, 100);
            System.out.printf("#14: %s, %s%n", a, b);
            if (a < b) {
                System.out.println(a + b);
            } else {
                System.out.println(a - b);
            }
        }
        //15 есть число a.
        //Программа должна ответить, четным или нечетным является это число, делится ли оно на 3 и делится ли оно на 6.
        {
            int a = getRandomInt(0, 100);
            System.out.printf("#15: %s%n", a);
            int num = a % 2;
            int subtraction1 = a % 3;
            int subtraction2 = a % 6;
            if (num == 0) {
                System.out.println("четное");
            } else {
                System.out.println("нечетное");
            }
            if (subtraction1 == 0) {
                System.out.println("число а делится на 3");
            }
            if (subtraction2 == 0) {
                System.out.println("число а делится на 6");
            }
        }
        //16 Угадать название числа. Необходимо показать его название на экран. (рандомное число  от 1 до 5)
        {
            int a = getRandomInt(1, 5);
            System.out.printf("#16: %s%n", a);
            if (a == 1) {
                System.out.println("one");
            }
            if (a == 2) {
                System.out.println("two");
            }
            if (a == 3) {
                System.out.println("three");
            }
            if (a == 4) {
                System.out.println("four");
            }
            if (a == 5) {
                System.out.println("five");
            }
            switch (a) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
            }
        }
        //17 Если переменная a больше 2-х и меньше 11-ти, или переменная b больше или равна 6-ти и меньше 14-ти,
        // то выведите "Yes", в противном случае выведите "No".  (a  от 0 до 15, b от 0 до 20)
        {
            int a = getRandomInt(0, 15);
            int b = getRandomInt(0, 20);
            System.out.printf("#17: %s, %s%n", a, b);
            if ((a > 2 && a < 11) || (b >= 6 && b < 14)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }




    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }

}
