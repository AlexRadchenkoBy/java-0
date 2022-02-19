package com.company.oop;

public class Time {
    // 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
    //изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
    //недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
    //заданное количество часов, минут и секунд.

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23) {
            this.hours = 0;
        } else {
            this.hours = hours;
        }

        if (minutes < 0 || minutes > 59) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }

        if (seconds < 0 || seconds > 59) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }

    public void changeTime(int hours, int minutes, int seconds) {
        this.seconds += seconds;
        this.minutes += this.seconds / 60;
        this.seconds = this.seconds % 60;

        this.minutes = this.minutes + minutes;
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;

        this.hours = this.hours + hours;
        this.hours = this.hours % 24;
    }
}
