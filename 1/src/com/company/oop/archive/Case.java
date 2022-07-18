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
}
