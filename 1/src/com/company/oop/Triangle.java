package com.company.oop;

public class Triangle {
    //  Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
    //площади, периметра и точки пересечения медиан.

    private double sideAb;
    private double sideBc;
    private double sideAc;
    private Point point1;
    private Point point2;
    private Point point3;


    public Triangle(Point point1, Point point2, Point point3) {
        this.sideAb = Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
        this.sideBc = Math.sqrt(Math.pow(point3.getX() - point2.getX(), 2) + Math.pow(point3.getY() - point2.getY(), 2));
        this.sideAc = Math.sqrt(Math.pow(point3.getX() - point1.getX(), 2) + Math.pow(point3.getY() - point1.getY(), 2));
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double getPerimeter() {
        return sideAb + sideBc + sideAc;
    }

    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideAb) *
                (semiPerimeter - sideBc) * (semiPerimeter - sideAc));
    }

    public Point getMedianPoint() {
        double x = (point1.getX() + point2.getX() + point3.getX()) / 3;
        double y = (point1.getY() + point2.getY() + point3.getY()) / 3;
        return new Point(x, y);
    }

    public String toString() {
        return "Периметр = " + getPerimeter() + " " + "Площадь = " + getArea() + " " +
                "Точка пересечения медиан = " + getMedianPoint().toString();
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
