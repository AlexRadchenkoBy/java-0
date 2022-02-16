package com.company.oop;

public class Counter {
    // Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
    //на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
    //произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
    //позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

    private int min;
    private int max;
    private int current;

    public Counter(int min, int max, int current) {
        this.min = min;
        this.max = max;
        this.current = current;

        if (max < min) {
            int temp = max;
            max = min;
            min = max;
        }

        if (current < min) {
            current = min;
        }

        if (current > max) {
            this.current = max;
        }
    }

    public Counter() {
        min = 1;
        max = 10;
        current = 5;
    }


    public int increment() {
        current++;
        if (current > max) {
            current = min;
        }
        return current;
    }

    public int decrement() {
        current--;
        if (current < min) {
            current = max;
        }
        return current;
    }

    public int getCurrent() {
        return this.current;
    }
}
