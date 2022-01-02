package com.company.function;

public class Function {

    public static void main(String[] args) {
       Helper helper = new Helper();
       double square = helper.getsHexagon(4);
       System.out.println(square);

       int a = (int) (Math.random() * (20 - 1) + 1);
       int b = (int) (Math.random() * (20 - 1) + 1);
       int c = (int) (Math.random() * (20 - 1) + 1);
       boolean primes = helper.getsPrimeNumbers(a, b, c);
    }
}