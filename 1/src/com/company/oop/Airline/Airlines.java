package com.company.oop.Airline;
//Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
// и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import java.time.LocalTime;
import java.util.Objects;

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

    public Airline[] findFlightByDayOfWeek(String dayOdWeek) {
        int flightNumberByDayOfWeek = 0;
        for (int i = 0; i < airlines.length; i++) {
            if (isInclude(airlines[i].getDaysOfWeek(), dayOdWeek)) {
                flightNumberByDayOfWeek++;
            }
        }
        Airline[] filteredFlightByDayOfWeek = new Airline[flightNumberByDayOfWeek];
        for (int i = 0, j = 0; i < airlines.length; i++) {
            if (isInclude(airlines[i].getDaysOfWeek(), dayOdWeek)) {
                filteredFlightByDayOfWeek[j] = airlines[i];
                j++;
            }
        }
        return filteredFlightByDayOfWeek;
    }

    public Airline[] findflightDayOfWeekAndDepatureTime(String dayOfWeek, LocalTime time) {
        int flightNumberByDayOfWeekDeparture = 0;
        for (int i = 0; i < airlines.length; i++) {
            if (isInclude(airlines[i].getDaysOfWeek(), dayOfWeek) && airlines[i].departureTime.isAfter(time)) {
                flightNumberByDayOfWeekDeparture++;
            }
        }
        Airline[] filteredFlightByDayOfWeekAndDepatureTime = new Airline[flightNumberByDayOfWeekDeparture];
        for (int i = 0, j = 0; i < airlines.length; i++) {
            if (isInclude(airlines[i].getDaysOfWeek(), dayOfWeek) && airlines[i].departureTime.isAfter(time)) {
                filteredFlightByDayOfWeekAndDepatureTime[j] = airlines[i];
                j++;
            }
        }
        return filteredFlightByDayOfWeekAndDepatureTime;
    }

    public boolean isInclude(String[] daysOfWeek, String day) {
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (Objects.equals(day, daysOfWeek[i])) {
                return true;
            }
        }
        return false;
    }


}
