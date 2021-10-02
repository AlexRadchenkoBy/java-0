package com.company.house;

public class Main {

    public static void main(String[] args) {
        House myHouse = new House("black", "white", "orange");
        House yourHouse = new House("black");

        myHouse.setColor1("green");
        myHouse.setColor2("yellow");
        myHouse.setColor3("blue");

        System.out.println("House: " + myHouse.getColor1() + ", " + myHouse.getColor2() + ", " + myHouse.getColor3());
    }

}
