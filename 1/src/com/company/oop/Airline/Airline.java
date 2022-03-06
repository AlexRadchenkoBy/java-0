package com.company.oop.Airline;
import java.time.LocalTime;
import java.util.Arrays;

public class Airline {
    // Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
    //и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
    //методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
    //Найти и вывести:
    //a) список рейсов для заданного пункта назначения;
    //b) список рейсов для заданного дня недели;
    //c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

    public String destination;
    public int flightNumber;
    public String aircraftType;
    public LocalTime departureTime;
    public String[] daysOfWeek;

    public Airline(String destination, int flightNumber, String aircraftType, int hour, int minute,
                   String[] daysOfWeek) {
        LocalTime time = LocalTime.of(hour, minute);
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = time;
        this.daysOfWeek = daysOfWeek;

    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public String toString() {
        return "destination: " + destination + ", flightNumber: " + flightNumber + ", aircraftType: " + aircraftType +
                ", departureTime: " + departureTime + ", daysOfWeek: " + Arrays.toString(daysOfWeek);
    }
}
