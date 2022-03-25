package com.company.oop.state;

import java.util.ArrayList;

public class State {
    //Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
    //столицу, количество областей, площадь, областные центры.
    private String stateName;
    private int stateArea;
    private ArrayList<Region> regions;


    public State (String stateName, int stateArea, ArrayList<Region> regions) {
        this.stateName = stateName;
        this.stateArea = stateArea;
        this.regions = regions;
    }

    public void showСapital() {
        for (int i = 0; i < regions.size(); i++) {
            if (regions.get(i).)
        }
    }
}
