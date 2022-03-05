package com.company.oop.Airline;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
    public Calendar departureTime;
    public String dayOfWeek;

    public Airline(String destination, int flightNumber, String aircraftType, int hour, int minute,
                   int day, int month, String dayOfWeek) {
        Calendar calendarTime = new GregorianCalendar();
        calendarTime.set(Calendar.HOUR_OF_DAY, hour);
        calendarTime.set(Calendar.MINUTE, minute);
        calendarTime.set(Calendar.DAY_OF_MONTH, day);
        calendarTime.set(Calendar.MONTH, month);
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = calendarTime;
        this.dayOfWeek = dayOfWeek;

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

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String toString() {
        return "destination: " + destination + ", flightNumber: " + flightNumber + ", aircraftType: " + aircraftType +
                ", departureTime: " + departureTime.getTime() + ", dayOfWeek:" + dayOfWeek;
    }
}
