package com.company.car1;
import java.util.Scanner;
public class Automobile {
    // Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
    //менять колесо, вывести на консоль марку автомобиля.

    private String carModel = "Toyota RAV4";
    private Engine engine;
     private Wheel wheels;
    public Automobile() {
    this.engine = new Engine("Двигатель работает!", 0);
    this.wheels = new Wheel("Летняя резина");
    }

    public void drive() {
        System.out.println("Машина едет");
    }

    public void fillCar() {
        System.out.println("Кончилось топливо! Для заправки нажмити: 1");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Машина заправлена!"+ " " + engine.getEngineCondition() + " " + "Едем дальше!");
        }
    }

    public void replaceWheel() {

    }

    public String toString() {
        return "carModel" + carModel + "engine" + engine.toString() + "wheels" + wheels;
    }

}
