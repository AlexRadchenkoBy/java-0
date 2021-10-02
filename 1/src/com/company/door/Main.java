package com.company.door;

public class Main {

    public static void main(String[] args) {
        Door door1 = new Door(2);
        Door door2 = new Door(3);

        System.out.println(door1.getHeight() > door2.getHeight());
        System.out.println(door2.isBig());

        if (door2.isBig()) {
            System.out.println("big");
        } else {
            System.out.println("small");
        }

        System.out.println(door2.isBigger(door1));


    }


}
