package com.company.oop.employee;

public abstract class Employee {

    private int age;
    private int coefficient;
    private int workedHours;

    public Employee(int age, int coefficient, int workedHours) {
        this.age = age;
        this.coefficient = coefficient;
        this.workedHours = workedHours;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return 1000 * coefficient * workedHours;
    }

}
