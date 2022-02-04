package com.company.oop.employee;

public abstract class Employee {

    private int age;
    private double coefficient;
    private int workedHours;

    public Employee(int age, double coefficient, int workedHours) {
        this.age = age;
        this.coefficient = coefficient;
        this.workedHours = workedHours;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return (int) (1000 * coefficient * workedHours);
    }

}
