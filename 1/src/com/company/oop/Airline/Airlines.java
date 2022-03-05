package com.company.oop.Airline;
//Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
// и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import java.util.Calendar;

public class Airlines {

    Airline[] airlines;

    public Airlines(Airline[] airlines) {

        this.airlines = airlines;
    }

    public Airline[] findFlightByDestination(String destination) {
        int flightNumberByDestination = 0;
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDestination().equals(destination)) {
                flightNumberByDestination++;
            }
        }
        Airline[] filteredFlightByDestination = new Airline[flightNumberByDestination];
        for (int i = 0, j = 0; i < airlines.length; i++) {
            if (airlines[i].getDestination().equals(destination)) {
                filteredFlightByDestination[j] = airlines[i];
                j++;
            }
        }
        return filteredFlightByDestination;
    }

    public Airline[] findFlightByDayOfWeek(String week) {
        int flightNumberByDayOfWeek = 0;
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDayOfWeek().equals(week)) {
                flightNumberByDayOfWeek++;
            }
        }
        Airline[] filteredFlightByDayOfWeek = new Airline[flightNumberByDayOfWeek];
        for (int i = 0, j = 0; i < airlines.length; i++) {
            if (airlines[i].getDayOfWeek().equals(week)) {
                filteredFlightByDayOfWeek[j] = airlines[i];
                j++;
            }
        }
        return filteredFlightByDayOfWeek;
    }

    public Airline[] findflightDayOfWeekAndDepatureTime(String dayOfWeek, int hour, int minute) {
        int flightNumberByDayOfWeekDeparture = 0;
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDayOfWeek().equals(dayOfWeek) && airlines[i].departureTime == hour
                    && airlines[i].departureTime == minute) {
                flightNumberByDayOfWeekDeparture++;
            }
        }
        Airline[] filteredFlightByDayOfWeekAndDepatureTime = new Airline[flightNumberByDayOfWeekDeparture];
        for (int i = 0, j = 0; i < airlines.length; i++) {
            if (airlines[i].getDayOfWeek().equals(dayOfWeek) && airlines[i].departureTime == hour
                    && airlines[i].departureTime == minute) {
                filteredFlightByDayOfWeekAndDepatureTime[j] = airlines[i];
                j++;
            }
        }
        return filteredFlightByDayOfWeekAndDepatureTime;
    }
}
