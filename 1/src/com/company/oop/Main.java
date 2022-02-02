package com.company.oop;

import com.company.oop.animal.Animal;
import com.company.oop.animal.Cat;
import com.company.oop.animal.Dog;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setWeight(12);

        Dog dog = new Dog();
        dog.setWeight(16);

        Animal animal = new Dog();

        hello(cat);
        hello(dog);
    }

    public static void hello(Animal animal) {
        System.out.println("Hello");
        animal.say();
    }

}
