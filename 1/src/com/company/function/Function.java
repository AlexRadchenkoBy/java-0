package com.company.function;

public class Function {

    public static void main(String[] args) {
       Helper helper = new Helper();
       int[] array = {1, 3, 5, 7, 9};
       double square = helper.getHexagonSquare(4);
       System.out.println(square);

       int a = (int) (Math.random() * (20 - 1) + 1);
       int b = (int) (Math.random() * (20 - 1) + 1);
       int c = (int) (Math.random() * (20 - 1) + 1);
       boolean coprime = helper.areСoprime(25, 5, 3);
       System.out.println(coprime);

       int Nod = helper.getNod(25, 14);
        System.out.println(Nod);

        int sumFactorial = helper.getSumFactorial(array);
        System.out.println(sumFactorial);

        System.out.println(helper.getFactorial(3));

        String repeatStr = helper.getRepeatStr("Hello", 5);
        System.out.print(repeatStr);
        System.out.println();

        double squareQuadrangle = helper.getSquareQuadrangle(4, 4, 5, 5);
        System.out.println(squareQuadrangle);


        int arrayOfNumber = helper.getArrayOfNumbers(12);
        System.out.print(arrayOfNumber + " ");
    }
}