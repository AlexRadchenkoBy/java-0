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

    public String getCapital() {
        String capital = null;
        for (int i = 0; i < regions.size(); i++) {
            ArrayList<District> districts = regions.get(i).getDistricts();
            for (int j = 0; j < districts.size(); j++) {
                ArrayList<City> cities = districts.get(j).getCities();
                for (int k = 0; k < cities.size(); k++) {
                    if (cities.get(k).getIsCapital()) {
                        capital = cities.get(k).getNameCity();
                    }
                }
            }
        }
        return capital;
    }

    public int getRegionNumber() {
       return regions.size();
    }

    public int getArea() {
        return stateArea;
    }

    public ArrayList<String> getRegionalCenter() {
        ArrayList<String> regionalCenter = new ArrayList<String>();
        for (int i = 0; i < regions.size(); i++) {
            ArrayList<District> districts = regions.get(i).getDistricts();
            for (int j = 0; j < districts.size(); j++) {
                ArrayList<City> cities = districts.get(j).getCities();
                for (int k = 0; k < cities.size(); k++) {
                    if (cities.get(k).getIsRegionalCenter()) {
                        regionalCenter.add(cities.get(k).getNameCity());
                    }
                }
            }
        }
        return regionalCenter;
    }

}
