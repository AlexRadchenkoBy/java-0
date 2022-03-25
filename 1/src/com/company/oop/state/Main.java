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
        District districtBrest = new District( brest, "Брестский район");
        districts.add(districtBrest);
        District districtVitebsk = new District(vitebsk, "Витебский район");
        districts.add(districtVitebsk);
        District districtHomel = new District(homel, "Гомельский район");
        districts.add(districtHomel);
        District districtHrodno = new District(hrodno, "Гродненский район");
        districts.add(districtHrodno);
        District districtMinsk = new District(minsk, "Минский район");
        districts.add(districtMinsk);
        District districtMogilev = new District(mogilev, "Могилевский район");
        districts.add(districtMogilev);

        ArrayList<Region> regions = new ArrayList<Region>();
        Region regionBrest = new Region(districtBrest, "Брестская область");
        regions.add(regionBrest);
        Region regionVitebsk = new Region(districtVitebsk, "Витебская область");
        regions.add(regionVitebsk);
        Region regionHomel = new Region(districtHomel, "Гомельская область");
        regions.add(regionHomel);
        Region regionHrodno = new Region(districtHrodno, "Гродненская область");
        regions.add(regionHrodno);
        Region regionMinsk = new Region(districtMinsk, "Минская область");
        regions.add(regionMinsk);
        Region regionMogilev = new Region(districtMogilev, "Могилевская область");
        regions.add(regionMogilev);
        State state = new State("Беларусь", 207600, regions);

    }
}
