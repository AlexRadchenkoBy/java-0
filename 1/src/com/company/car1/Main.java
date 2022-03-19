package com.company.car1;

import com.company.oop.composition.text.Word;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        chekAutomobile();
    }

    public static void chekAutomobile() {
        ArrayList<String> engineCondition = new ArrayList<String>();
        String condition1 = new String("Двигатель не работает");
        String condition2 = new String("Двигатель работает");
        engineCondition.add(condition1);
        engineCondition.add(condition2);
        Automobile automobile = new Automobile();
    }
}
