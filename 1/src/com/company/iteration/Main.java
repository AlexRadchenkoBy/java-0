package com.company.iteration;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //1 вывести в консоль элементы массива (один элемент одна страка) используя for
        {
            System.out.println("#1");
            int[] array = getRandomArray();
            for (int i =  0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
        //2 тоже самое, что и в #1 используя while
        {
            System.out.println("#2");
            int[] array = getRandomArray();
            int i = 0;
            while (i < array.length) {
                System.out.println(array[i]);
                i++;
            }
        }
        //3 вывести в консоль элементы массива (одна страка все элементы массива) используя for
        {
            System.out.println("#3");
            int[] array = getRandomArray();
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        //4 вывести в консоль только отрицательные элементы массива (одна страка все элементы массивы) используя for
        {
            System.out.println("#4");
            int[] array = getRandomArray();
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
        }
        //5 вывести в консоль только положительный элементы массива (одна страка все элементы массивы) используя while
        {
            System.out.println("#5");
            int[] array = getRandomArray();
            int i = 0;
            while (i < array.length) {
                if (array[i] > 0) {
                    System.out.print(array[i] + " ");
                }
                i++;
            }
            System.out.println();
        }
        //6 удвоить все элементы массива и вывести в консоль элементы (одна страка все элементы массивы) используя for
        {
            System.out.println("#6");
            int[] array = getRandomArray();
            for (int i = 0; i  < array.length; i++) {
                int multiply = array[i] * 2;
                System.out.print(multiply + " ");
            }
            System.out.println();
        }
        //7 утроить все элементы массива и вывести в консоль элементы (одна страка все элементы массивы) используя while
        {
            System.out.println("#7");
            int[] array = getRandomArray();
            int i = 0;
            while (i < array.length) {
                int multiply = array[i] * 3;
                System.out.print(multiply + " ");
                i++;
            }
            System.out.println();
        }
        //8 вывести в консоль нечетные элементы массива (одна страка все элементы массива) используя for
        {
            System.out.println("#8");
            int[] array = getRandomArray();
        }
        //9 вывести в консоль четные элементы массива (одна страка все элементы массива) используя while
        {
            System.out.println("#9");
            int[] array = getRandomArray();
        }
        //10 вывести в консоль элементы массива под четным индексам (одна страка все элементы массива) используя for
        {
            System.out.println("#10");
            int[] array = getRandomArray();
        }
        //11 вывести в консоль элементы массива под нечетным индексам (одна страка все элементы массива) используя while
        {
            System.out.println("#11");
            int[] array = getRandomArray();
        }
        //12 вывести в консоль элементы массива в обрадном порядке (одна страка все элементы массива) используя for
        {
            System.out.println("#12");
            int[] array = getRandomArray();
        }
        //13 вывести в консоль числа от 2 до 6 используя for
        {
            System.out.println("#13");
        }
        //14 вывести в консоль числа от 6 до 1 используя while
        {
            System.out.println("#14");
        }
        //15 Необходимо вывести на экран таблицу умножения на 3
        // пример вывода:
        // 3*1=3
        // 3*2=6
        // .... и так дальше
        {
            System.out.println("#15");
        }
        //16 Необходимо, чтоб программа выводила на экран вот такую последовательность используя for:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        {
            System.out.println("#16");
        }
        //17 Необходимо вывести на консоль такую последовательность чисел используя while:
        //1 2 4 8 16 32 64 128 256 512
        {
            System.out.println("#17");
        }
        //18 Необходимо написать программу, которая бы вывела в консоль звездочки как на картинке ниже
        // * * * *
        // * * * *
        // * * * *
        {
            System.out.println("#18");
        }
        //19 Необходимо написать программу, которая бы вывела в консоль звездочки как на картинке ниже
        // * * * *
        // * * *
        // * *
        // *
        {
            System.out.println("#19");
        }
        //20 Необходимо написать программу, которая бы вывела в консоль звездочки как на картинке ниже
        // * * * * *
        // *       *
        // *       *
        // * * * * *
        {
            System.out.println("#20");
        }
        //21 Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что:
        // первый и второй члены последовательности равны единицам
        // а каждый следующий — сумме двух предыдущих
        // То есть числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.
        {
            System.out.println("#21");
        }
    }

    public static int[] getRandomArray() {
        int[] array = new int[getRandomInt(5, 10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInt(-100, 100);
        }
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));
        return array;
    }


    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst().orElse(0);
    }

}
