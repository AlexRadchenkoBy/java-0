package com.company.oop;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {
    // 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
    //изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
    //недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
    //заданное количество часов, минут и секунд.

    private int hour;
    private int minute;
    private int seconds;


    public Time(int hour, int minute, int seconds) {

        if (hour < 0 || hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }

        if (minute < 0 || minute > 59) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }

        if (seconds < 0 || seconds > 59 ) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }


    public String toString() {
        return "time" + " " + null;
    }
}
