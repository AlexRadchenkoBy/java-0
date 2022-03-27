package com.company.oop.state;

import java.util.ArrayList;

public class Region {
    private ArrayList<District> districts;
    private String nameRegion;

    public Region(ArrayList<District> districts, String nameRegion) {
        this.districts = districts;
        this.nameRegion = nameRegion;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public String getNameRegion() {
        return nameRegion;
    }
}
