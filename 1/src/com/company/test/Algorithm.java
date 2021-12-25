package com.company.test;

public class Algorithm {

    public static void main(String[] args) {
        // - инициализировать число Z;
        // - создать массив случайных нецелых чисел;
        // - заменить значения массива, которые больше Z на это число;
        // - подсчитать количество замен;
        // - вывести результат в консоль.

        double counterElement = 0;
        double z = 16.3421573;
        double sum = 0;
        double[] array = new double[7];
        for (int i = 0; i < array.length; i++) {
            double randomnumber = (double) (Math.random() * (40.0 - 1.0) + 1.0);
            array[i] = randomnumber;
            if (array[i] > z) {
                counterElement++;
            }
                if (array[i] > z) {
                    array[i] = z;
                }
            System.out.print(array[i] + " ");
            System.out.println();
            if (array[i] > z) {
                counterElement++;
            }
        }
        System.out.println(counterElement + " ");
    }
}
