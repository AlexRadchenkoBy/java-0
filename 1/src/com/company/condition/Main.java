package com.company.condition;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 2;

        System.out.println(a == b && a == c); // true и false = false
        System.out.println(a == b || a == c); // true или false = true

        int z = 3;
        int x = 1;

        System.out.println(z == x); // false
        System.out.println(z != x); // true
        System.out.println(z == x && z != x); // true && false = false
        System.out.println(z == x || z != x); // true && false = true

        String color = "black";
        System.out.println("green" == color); // false

        color = "Green";
        System.out.println("green" == color); // false

        System.out.println(isColorGreen("Black")); // false

        a = 0;
        b = 1;
        if (a == b) {
            System.out.println("равно");
        } else {
            System.out.println("неравно");
        }

    }

    public static boolean isColorGreen(String color) {
        return "green" == color;
    }

}
