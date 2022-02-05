package com.company.oop;

public class Student {
    // Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
    //из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
    //номеров групп студентов, имеющих оценки, равные только 9 или 10.

    private String surnameAndInitials;
    private int groupNumber;
    private int[] academicPerformance;

    public Student(String surnameAndInitials, int groupNumber, int[] academicPerformance) {
        this.surnameAndInitials = surnameAndInitials;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }

    public String getSurnameAndInitials() {
        return surnameAndInitials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }
}
