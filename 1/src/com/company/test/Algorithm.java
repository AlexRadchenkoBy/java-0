package com.company.test;

public class Algorithm {

    public static void main(String[] args) {
        doTask3();
    }

    public static void doTask1() {
        // - инициализировать число Z;
        // - создать массив случайных нецелых чисел;
        // - заменить значения массива, которые больше Z на это число;
        // - подсчитать количество замен;
        // - вывести результат в консоль.

        int counterElement = 0;
        double z = 16.3421573;
        double[] array = new double[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * (40.0 - 1.0) + 1.0;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                counterElement++;
                array[i] = z;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(counterElement + " ");
    }

    public static void doTask2() {
        // создать массив содержащий нецелые числа;
        // заполнить массив случайными числами;
        // подсчитать количество положительных, отрицатильных и нулевых элементов;
        // вывести результат в консоль.

        double[] array = new double[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 201) - 100;
        }
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveCounter++;
            } else if (array[i] < 0) {
                negativeCounter++;
            } else if (array[i] == 0) {
                zeroCounter++;
            }
        }
        System.out.print(positiveCounter + " " + negativeCounter + " " + zeroCounter);
        System.out.println();
    }

    public static void doTask3() {
        // - создать массив случайных нецелых чисел;
        // - определить наименьшее и наибольшее число в данном массиве;
        // - поменять их местами;
        // - вывести результат в консоль.

        double[] array = new double[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 21) - 10;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        double temp;
        double maxElement = array[0];
        double minElement = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxIndex = i;
                maxElement = array[i];
            } else if (array[i] < minElement) {
                minIndex = i;
                minElement = array[i];
            }
                temp = array[minIndex];
                array[minIndex] = array[maxIndex];
                array[maxIndex] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}





