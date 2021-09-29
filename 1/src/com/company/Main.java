package com.company;

public class Main {

    public static void main(String[] args) {
        Car sedan = new com.company.Car("red");

        sedan.setColor("orange");
        System.out.println("Car: " + sedan.getColor());

        sedan.setColor("black");
        System.out.println("Car: " + sedan.getColor());

    }

}
