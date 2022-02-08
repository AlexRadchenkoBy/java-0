package com.company.oop;

import java.util.Calendar;

public class Train {
    // Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
    //Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
    //номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
    //Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
    //назначения должны быть упорядочены по времени отправления.

    private String destination;
    private int trainNumber;
    private Calendar departureTime;
    private int i;
    private int i1;

    public Train(String destination, int trainNumber, Calendar departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public Train(String destination, int trainNumber, int i, int i1) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.i = i;
        this.i1 = i1;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public Calendar getDepartureTime() {
        return departureTime;
    }

    public int getI() {
        return i;
    }

    public int getI1() {
        return i1;
    }

    public String toString() {
        return "destination" + " " + destination + " " + "trainNumber" + " " + trainNumber + " "
                + "departureTime" + " " + departureTime;
    }

}
