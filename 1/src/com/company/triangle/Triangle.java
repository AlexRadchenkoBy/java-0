package com.company.triangle;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a) {
        this.a = a;
        b = a;
        c = a;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getSides() {
        return String.format("Triangle's sides: %s, %s, %s", a, b, c);
    }

    public int getSum() {
        return a + b + c;
    }

    public boolean isEquilateral() {
        if (a == b && a == c) {
            return true;
        } else {
            return false;
        }
    }

}
