package com.company.test;

public class Algorithm {

    public static void main(String[] args) {
        doTask2();
    }
    public static void doTask1() {
        // - инициализировать число Z;
        // - создать массив случайных нецелых чисел;
        // - заменить значения массива, которые больше Z на это число;
        // - подсчитать количество замен;
        // - вывести результат в консоль.

        double counterElement = 0;
        double z = 16.3421573;
        double[] array = new double[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = (double) (Math.random() * (40.0 - 1.0) + 1.0);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                counterElement++;
            }
            if (array[i] > z) {
                array[i] = z;
            }
            System.out.print(array[i] + " ");
            if (array[i] > z) {
                counterElement++;
            }
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
            array[i] = ((double) (Math.random() * 201) - 100);
        }
        double positiveCounter = 0;
        double negativeCounter = 0;
        double zeroCounter = 0;
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
}

