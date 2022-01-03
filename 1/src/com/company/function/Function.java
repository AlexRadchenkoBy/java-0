package com.company.function;

public class Function {

    public static void main(String[] args) {
       Helper helper = new Helper();
       double square = helper.getHexagonSquare(4);
       System.out.println(square);

       int a = (int) (Math.random() * (20 - 1) + 1);
       int b = (int) (Math.random() * (20 - 1) + 1);
       int c = (int) (Math.random() * (20 - 1) + 1);
       boolean coprime = helper.areСoprime(25, 5, 3);
       System.out.println(coprime);

       int Nod = helper.getNod(25, 14);
        System.out.println(Nod);
    }
}