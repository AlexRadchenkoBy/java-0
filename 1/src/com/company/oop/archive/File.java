package com.company.oop.archive;

import java.util.UUID;

public class File {
    private String id;
    private String name;
    private String surname;
    private int yearOfBirth;
    private String faculty;

    public File(String name, String surname, int yearOfBirth, String faculty) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.faculty = faculty;
    }
}
