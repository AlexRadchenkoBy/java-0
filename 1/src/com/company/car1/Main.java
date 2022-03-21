package com.company.car1;

public class Main {
    public static void main(String[] args) {
        chekAutomobile();
    }

    public static void chekAutomobile() {
        Automobile automobile = new Automobile("Toyota RAV4");
        automobile.drive();
        automobile.fillCar();
        automobile.replaceWheel();
        System.out.println(automobile);
    }
}
