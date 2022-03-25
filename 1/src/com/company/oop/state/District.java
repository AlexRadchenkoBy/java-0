package com.company.oop.state;

import java.util.ArrayList;

public class District {
    private ArrayList<City> cities;
    private String nameDistrict;

    public District(ArrayList<City> cities, String nameDistrict) {
        this.cities = cities;
        this.nameDistrict = nameDistrict;
    }

    public ArrayList<City> getCities() {
        return cities;
    }
}
