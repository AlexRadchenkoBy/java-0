package com.company.oop;

import com.company.oop.animal.Animal;
import com.company.oop.animal.Cat;
import com.company.oop.animal.Dog;
import com.company.oop.transportation.Airplane;
import com.company.oop.transportation.Car;
import com.company.oop.transportation.Transportation;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setWeight(12);

        Dog dog = new Dog();
        dog.setWeight(16);

        Animal animal = new Dog();

        hello(cat);
        hello(dog);

        Car car =  new Car();
        car.setColor("black");
        car.setWeight(1500);

        Airplane airplane = new Airplane();
        airplane.setColor("white");
        airplane.setWeight(10000);

        Transportation transportation = new Car();

        move(car);
        move(airplane);
    }

    public static void move(Transportation transportation) {
        System.out.println("Move");
        transportation.move();

    }

    public static void hello(Animal animal) {
        System.out.println("Hello");
        animal.say();
    }

}
