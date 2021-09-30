package com.company.car;

public class Main {

    public static void main(String[] args) {
        Car sedan = new Car("red");

        sedan.setColor("orange");
        System.out.println("Car: " + sedan.getColor());

        sedan.setColor("black");
        System.out.println("Car: " + sedan.getColor());

    }

}
