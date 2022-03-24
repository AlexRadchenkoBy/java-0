package com.company.oop.state;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        chekState();
    }

    public static void chekState() {
        ArrayList<City> brest = new ArrayList<City>();
        City city1 = new City(false, "Брест");
        brest.add(city1);
        ArrayList<City> vitebsk = new ArrayList<City>();
        City city2 = new City(false, "Витебск");
        vitebsk.add(city2);
        ArrayList<City> homel = new ArrayList<City>();
        City city3 = new City(false, "Гомель");
        homel.add(city3);
        ArrayList<City> hrodno = new ArrayList<City>();
        City city4 = new City(false, "Гродно");
        hrodno.add(city4);
        ArrayList<City> minsk = new ArrayList<City>();
        City city5 = new City(true, "Минск");
        minsk.add(city5);
        ArrayList<City> mogilev = new ArrayList<City>();
        City city6 = new City(false, "Могилев");
        mogilev.add(city6);

        ArrayList<District> districts = new ArrayList<District>();
        District districtBrest = new District(brest);
        District districtVitebsk = new District(vitebsk);
        District districtHomel = new District(homel);
        District districtHrodno = new District(hrodno);
        District districtMinsk = new District(minsk);
        District districtMogilev = new District(mogilev);

        State state = new State(207600, districts, );

    }
}
