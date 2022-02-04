package com.company.oop;

public class Test1 {
//    Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//    переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//    наибольшее значение из этих двух переменных.
    int number1;
    int number2;

    public Test1(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int sumNumbers() {
        return number1 + number2;
    }

    public int max() {
        return Math.max(number1, number2);
    }

    public void println() {
        System.out.println(number1 + " " + number2);
    }
}
