package com.company.iteration;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //1 вывести в консоль элементы массива (один элемент одна страка) используя for
        {
            System.out.println("#1");
            int[] array = getRandomArray();
            for (int i = 0; i < array.length; i++) {
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
            for (int i = 0; i < array.length; i++) {
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
            for (int i = 0; i < array.length; i++) {
                int divide = array[i] % 2;
                if (divide != 0) {
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
        }
        //9 вывести в консоль четные элементы массива (одна страка все элементы массива) используя while
        {
            System.out.println("#9");
            int[] array = getRandomArray();
            int i = 0;
            while (i < array.length) {
                int divide = array[i] % 2;
                if (divide == 0) {
                    System.out.print(array[i] + " ");
                }
                i++;
            }
            System.out.println();
        }
        //10 вывести в консоль элементы массива под четным индексам (одна страка все элементы массива) используя for
        {
            System.out.println("#10");
            int[] array = getRandomArray();
            for (int i = 0; i < array.length; i = i + 2) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        //11 вывести в консоль элементы массива под нечетным индексам (одна страка все элементы массива) используя while
        {
            System.out.println("#11");
            int[] array = getRandomArray();
            int i = 1;
            while (i < array.length) {
                System.out.print(array[i] + " ");
                i = i + 2;
            }
            System.out.println();
        }
        //12 вывести в консоль элементы массива в обратном порядке (одна страка все элементы массива) используя for
        {
            System.out.println("#12");
            int[] array = getRandomArray();
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        //13 вывести в консоль числа от 2 до 6 используя for
        {
            System.out.println("#13");
            for (int i = 2; i <= 6; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //14 вывести в консоль числа от 6 до 1 используя while
        {
            System.out.println("#14");
            int i = 6;
            while (i >= 1) {
                System.out.print(i + " ");
                i--;
            }
            System.out.println();
        }
        //15 Необходимо вывести на экран таблицу умножения на 3
        // пример вывода:
        // 3*1=3
        // 3*2=6
        // .... и так дальше
        {
            System.out.println("#15");
            for (int i = 1; i <= 9; i++) {
                System.out.println("3*" + i + "=" + i * 3);
            }
        }
        //16 Необходимо, чтоб программа выводила на экран вот такую последовательность используя for:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        {
            System.out.println("#16");
            for (int i = 7; i <= 98; i = i + 7) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //17 Необходимо вывести на консоль такую последовательность чисел используя while:
        //1 2 4 8 16 32 64 128 256 512
        {
            System.out.println("#17");
            int i = 1;
            while (i <= 512) {
                System.out.print(i + " ");
                i = i * 2;
            }
            System.out.println();
        }
        //18 Необходимо написать программу, которая бы вывела в консоль звездочки как на картинке ниже
        // * * * *
        // * * * *
        // * * * *
        {
            System.out.println("#18");
            for (int i = 0; i < 3; i++) {
                System.out.println("* * * *");
            }
        }

        //19 Необходимо написать программу, которая бы вывела в консоль звездочки как на картинке ниже
        // * * * *
        // * * *
        // * *
        // *
        {
            System.out.println("#19");
            for (int i = 0; i < 4; i++) {
                for (int j = 4; j > i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        //20 Необходимо написать программу, которая бы вывела в консоль звездочки как на картинке ниже
        // * * * * *
        // *       *
        // *       *
        // * * * * *
        {
            System.out.println("#20");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    if ((i == 0 || i == 3) || (j == 0 || j == 4)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        //21 Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что:
        // первый и второй члены последовательности равны единицам
        // а каждый следующий — сумме двух предыдущих
        // То есть числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.
        {
            System.out.println("#21");
            int a = 1;
            int b = 1;
            int c = 0;
            System.out.print(a + " " + b + " ");
            for (int i = 3; i <= 11; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }
        //22 вывести в консоль элементы массива используя foreach(почитать в интернете про это)
        {
            System.out.println("#22");
            int[] array = getRandomArray();
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //23 заменить все отрицательные элементы массива на положительные и вывести в консоль элементы массива
        {
            System.out.println("#23");
            int[] array = getRandomArray();
            for (int i = 0; i < array.length; i++) {
                int a = Math.abs(array[i]);
                System.out.print(a + " ");
            }
            System.out.println();
        }
        //24 вывести в консоль первую половину массива
        {
            System.out.println("#24");
            int[] array = getRandomArray();
            for (int i = 0; i < array.length / 2; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        //25 Необходимо написать программу, которая бы вывела в консоль звездочки как на картинке ниже
        // * * * * *
        // *   *   *
        // *   *   *
        // * * * * *
        {
            System.out.println("#25");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    if ((i == 0 || i == 3) || (j == 0 || j == 2 || j == 4)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }
                System.out.println();
            }
        }
        //26 вывести в консоль наибольший элемент массива используя while
        {
            System.out.println("#26");
            int[] array = getRandomArray();
            int i = 0;
            int max = array[i];
            while (i < array.length) {
                if (array[i] > max) {
                    max = array[i];
                }
                i++;
            }
            System.out.println(max);
        }
        //27 вывести в консоль наименший элемент массива используя for
        {
            System.out.println("#27");
            int[] array = getRandomArray();
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println(min);
        }
        //28 вывести в консоль сумму всех элементов массива
        {
            System.out.println("#28");
            int[] array = getRandomArray();
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println(sum);
        }
        //29 вывести в консоль сумму отрицательных элементов массива
        {
            System.out.println("#29");
            int[] array = getRandomArray();
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    sum = sum + array[i];
                }
            }
            System.out.println(sum);
        }
        //30 вывести в консоль только первый положительный элемент массива используя while
        {
            System.out.println("30");
            int[] array = getRandomArray();
            int i = 0;
            while (i < array.length) {
                if (array[i] > 0) {
                    System.out.println(array[i]);
                    break;
                }
                i++;
            }
        }
        //31 вывести в консоль только паследний положительный элемент массива используя for
        {
            System.out.println("31");
            int[] array = getRandomArray();
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] > 0) {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
        //32 вывести в консоль только первый отрицательный элемент массива используя foreach
        {
            System.out.println("32");
            int[] array = getRandomArray();
            for (int i : array) {
                if (i < 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
        //33 Отсартировать массив по убыванию при помощи пузырьковой сортировки
        {
            System.out.println("33");
            int[] array = getRandomArray();
            boolean isSorted = false;
            int temp;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] < array[i + 1]) {
                        isSorted = false;
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        //34 Отсартировать массив по возростанию при помощи пузырьковой сортировки и использовать только циклы while
        {
            System.out.println("34");
            int[] array = getRandomArray();
            boolean isSorted = false;
            int temp;
            while (!isSorted) {
                isSorted = true;
                int i = 0;
                while (i < array.length - 1) {
                    if (array[i] > array[i + 1]) {
                        isSorted = false;
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                    i++;
                }
            }
            int i = 0;
            while (i < array.length) {
                System.out.print(array[i] + " ");
                i++;
            }
            System.out.println();
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
