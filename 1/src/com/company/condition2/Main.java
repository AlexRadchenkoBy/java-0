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
            int a  = num % 2;
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
    }

    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }

}
