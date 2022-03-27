package com.company.oop.state;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        chekState();
    }

    public static void chekState() {
        ArrayList<City> brest = new ArrayList<City>();
        City city1 = new City(true, false, "Брест");
        brest.add(city1);
        ArrayList<City> vitebsk = new ArrayList<City>();
        City city2 = new City(true, false,"Витебск");
        vitebsk.add(city2);
        ArrayList<City> homel = new ArrayList<City>();
        City city3 = new City(true, false,"Гомель");
        homel.add(city3);
        ArrayList<City> hrodno = new ArrayList<City>();
        City city4 = new City(true, false, "Гродно");
        hrodno.add(city4);
        ArrayList<City> minsk = new ArrayList<City>();
        City city5 = new City(true, true,"Минск");
        City city7 = new City(false, false, "Осиповичи");
        minsk.add(city5);
        minsk.add(city7);
        ArrayList<City> mogilev = new ArrayList<City>();
        City city6 = new City(true, false, "Могилев");
        mogilev.add(city6);

        ArrayList<District> districtsBrest = new ArrayList<District>();
        District districtBrest = new District(brest, "Брестский район");
        districtsBrest.add(districtBrest);
        ArrayList<District> districtsVitebsk = new ArrayList<District>();
        District districtVitebsk = new District(vitebsk, "Витебский район");
        districtsVitebsk.add(districtVitebsk);
        ArrayList<District> districtsHomel = new ArrayList<District>();
        District districtHomel = new District(homel, "Гомельский район");
        districtsHomel.add(districtHomel);
        ArrayList<District> districtsHrodno = new ArrayList<District>();
        District districtHrodno = new District(hrodno, "Гродненский район");
        districtsHomel.add(districtHrodno);
        ArrayList<District> districtsMinsk = new ArrayList<District>();
        District districtMinsk = new District(minsk,  "Минский район");
        districtsMinsk.add(districtMinsk);
        ArrayList<District> districtsMogilev = new ArrayList<District>();
        District districtMogilev = new District(mogilev, "Могилевский район");
        districtsMogilev.add(districtMogilev);

        ArrayList<Region> regions = new ArrayList<Region>();
        Region regionBrest = new Region(districtsBrest, "Брестская область");
        regions.add(regionBrest);
        Region regionVitebsk = new Region(districtsVitebsk, "Витебская область");
        regions.add(regionVitebsk);
        Region regionHomel = new Region(districtsHomel, "Гомельская область");
        regions.add(regionHomel);
        Region regionHrodno = new Region(districtsHrodno, "Гродненская область");
        regions.add(regionHrodno);
        Region regionMinsk = new Region(districtsMinsk, "Минская область");
        regions.add(regionMinsk);
        Region regionMogilev = new Region(districtsMogilev, "Могилевская область");
        regions.add(regionMogilev);
        State state = new State("Беларусь", 207600, regions);

        System.out.println(state.getCapital());
        System.out.println(state.getRegionNumber());
        System.out.println(state.getArea());
        System.out.println(state.getRegionalCenter());
    }
}
