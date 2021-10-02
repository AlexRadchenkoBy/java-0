package com.company.triangle;

public class Main {

    public static void main(String[] args) {
        Triangle abc = new Triangle(1, 2, 3);
        Triangle equilateral = new Triangle(2);

        System.out.println(abc.getSides());
        System.out.println(equilateral.getSides());

        System.out.println("abc's sum: " + abc.getSum());
        System.out.println("equilateral's sum: " + equilateral.getSum());

        System.out.println(abc.isEquilateral());
        System.out.println(equilateral.isEquilateral());
    }

}
