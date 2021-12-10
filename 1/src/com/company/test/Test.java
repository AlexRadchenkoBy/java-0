package com.company.test;

public class Test {
    public static void main(String[] args)  {
      doTask3();
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
        int remainderSeconds =  T - hours * 3600;
        int minutes = remainderSeconds / 60;
        int seconds = remainderSeconds % 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
    }
}
