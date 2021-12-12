package com.company.test;

public class Test {
    public static void main(String[] args) {
        doTask4();
    }

    public static void doTask1() {
        int a = 1;
        int b = 2;
        int c = 3;
        int sub = a - 3;
        double divide = b / 2;
        double multiplay = sub * divide;
        double z = ((a - 3) * b / 2) + c;
        System.out.println("z " + (multiplay + c));
    }

    public static void doTask2() {
        double x = 5.5;
        double y = 2.5;
        double sinX = Math.sin(x);
        double cosY = Math.cos(y);
        double cosX = Math.cos(x);
        double sinY = Math.sin(y);
        double tgXy = Math.tan(x * y);
        double totalValue = ((sinX + cosY) / (cosX - sinY)) * tgXy;
        System.out.println(totalValue);
    }

    public static void doTask3() {
        int T = 124_123;
        int hours = T / 3600;
        int remainderSeconds = T - hours * 3600;
        int minutes = remainderSeconds / 60;
        int seconds = remainderSeconds % 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
    }

    public static void doTask4() {
        int angle1 = 45;
        int angle2 = 100;
        int angle3 = 180 - (angle1 + angle2);
        if (angle1 + angle2 < 180 && angle1 == 90 || angle2 == 90 || angle3 == 90) {
            System.out.println("Треугольник существует " + "Прямой треугольник");
        } else {
            System.out.println("Треугольник существует " + "Не прямой треугольник");
            }
        }
    }


