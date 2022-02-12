package com.company.oop;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Comparator;

public class Train implements Comparable {
    // Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
    //Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
    //номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
    //Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
    //назначения должны быть упорядочены по времени отправления.

    private String destination;
    private int trainNumber;
    private Calendar departureTime;

    public Train(String destination, int trainNumber, int hour, int minute) {
        Calendar calendarTime = new GregorianCalendar();
        calendarTime.set(Calendar.HOUR_OF_DAY, hour);
        calendarTime.set(Calendar.MINUTE, minute);
        this.departureTime = calendarTime;
        this.destination = destination;
        this.trainNumber = trainNumber;
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


    public String toString() {
        return "destination" + " " + destination + " " + "trainNumber" + " " + trainNumber + " "
                + "departureTime" + " " + departureTime.getTime();
    }

    public void setDepartureTime(Calendar departureTime) {

        this.departureTime = departureTime;
    }

    @Override
    public int compareTo(Train trains) {
        Train tmp = (Train) trains;
        if(this.destination < tmp.destination)
        {
            return -1;
        }
        else if(this.destination > tmp.destination)
        {
            return 1;
        }
        return 0;
    }

}
}
