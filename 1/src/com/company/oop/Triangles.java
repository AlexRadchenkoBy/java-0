package com.company.oop;

public class Triangles {
    //  Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
    //площади, периметра и точки пересечения медиан.

    private double sideAb;
    private double sideBc;
    private double sideAc;

    public Triangles(double sideAb, double sideBc, double sideAc) {
        this.sideAb = sideAb;
        this.sideBc = sideBc;
        this.sideAc = sideAc;
    }

    public double trianglePerimeter() {
        return sideAb + sideBc + sideAc;

    }

    public double triangleArea() {
        double semiPerimeter = (sideAb + sideBc + sideAc) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideAb) *
                (semiPerimeter - sideBc) * (semiPerimeter - sideAc));
    }

    public String toString() {

        return "Периметр = " + " " + trianglePerimeter() + " " + "Площадь = " + " " + triangleArea();
    }

}
