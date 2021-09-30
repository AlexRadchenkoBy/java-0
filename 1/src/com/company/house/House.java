package com.company.house;

public class House {
    private String color1;
    private String color2;
    private String color3;

    public House(String anyColor1, String anyColor2, String anyColor3) {
        color1 = anyColor1;
        color2 = anyColor2;
        color3 = anyColor3;
    }

    public String getColor1() {
        return color1;
    }

    public String getColor2() {
        return color2;
    }

    public String getColor3() {
        return color3;
    }

    public void setColor1(String anyColor) {
        color1 = anyColor;
    }

    public void setColor2(String anyColor) {
        color2 = anyColor;
    }

    public void setColor3(String anyColor) {
        color3 = anyColor;
    }

}
