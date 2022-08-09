package com.company.oop.archive;

import java.util.UUID;

public class Case {
    private String id;
    private String name;
    private String surname;
    private int yearOfBirth;
    private String faculty;

    public Case(String name, String surname, int yearOfBirth, String faculty) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.faculty = faculty;
    }

    public Case(String id, String name, String surname, int yearOfBirth, String faculty) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.faculty = faculty;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Case{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
