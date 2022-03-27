package com.company.oop.state;

public class City {
    private boolean isRegionalCenter;
    private boolean isCapital;
    private String nameCity;

    public City(boolean isRegionalCenter, boolean isCapital, String nameCity) {
        this.isRegionalCenter = isRegionalCenter;
        this.isCapital = isCapital;
        this.nameCity = nameCity;
    }

    public boolean getIsRegionalCenter() {
        return isRegionalCenter;
    }

    public boolean getIsCapital() {
        return isCapital;
    }

    public String getNameCity() {
        return nameCity;
    }
}
