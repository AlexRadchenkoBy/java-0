package com.company.car1;

public class Automobile {
    // Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
    //менять колесо, вывести на консоль марку автомобиля.

    private String carModel = "Toyota RAV4";
    private Engine engine;
     private Wheel wheels;
    public Automobile() {
    this.engine = new Engine();
    this.wheels = new Wheel();
    }
}
