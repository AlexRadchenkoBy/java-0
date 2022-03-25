package com.company.oop.state;

import java.util.Objects;

public class City {
    private boolean isCapital;
    private String nameCity;
    public City(boolean isCapital, String nameCity) {
        this.isCapital = isCapital;
        this.nameCity = nameCity;
    }

    public boolean getIsCapital() {
        return isCapital;
    }

    public String getNameCity() {
        return nameCity;
    }
}
