package com.company.car1;

import java.util.Scanner;

public class Automobile {
    // Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
    //менять колесо, вывести на консоль марку автомобиля.

    private String carModel;
    private Engine engine;
    private Wheel wheels;

    public Automobile(String carModel) {
        this.carModel = carModel;
        this.engine = new Engine("Двигатель работает!");
        this.wheels = new Wheel("летняя резина!");
    }

    public void drive() {
        System.out.println("Машина едет");
    }

    public void fillCar() {
        System.out.println("Кончилось топливо! Для заправки нажмити: 1");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Машина заправлена!" + " " + engine.getEngineCondition() + " " + "Едем дальше!");
        }
    }

    public void replaceWheel() {
        System.out.println("Пришла зима, а у вас стоит" + " " + wheels.getWheels() + " " + "Для замены нажмите 2!");
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
        if (number == 2) {
            System.out.println("Зимняя резина установлена!");
        }
    }

    public String toString() {
        return "carModel" + " " + carModel;
    }
}
