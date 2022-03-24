package com.company.oop.state;

import java.util.ArrayList;

public class State {
    //Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
    //столицу, количество областей, площадь, областные центры.

    private int stateArea;
    private Region regions;
    private District districts;
    private City city;

    public State (int stateArea, Region regions, District districts, City city) {
        this.stateArea = stateArea;
        this.regions = regions;
        this.districts = districts;
        this.city = city;
    }

}
