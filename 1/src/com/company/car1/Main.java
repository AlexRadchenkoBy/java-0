package com.company.car1;

import com.company.oop.composition.text.Word;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        chekAutomobile();
    }

    public static void chekAutomobile() {
    Automobile automobile = new Automobile();
    automobile.drive();
    automobile.fillCar();
    }
}
