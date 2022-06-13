package com.company.oop.notebook;

public enum NoteType {
    WORK("Работа"),
    RELAXATION("Отдых"),
    MEETING("Встреча");


    private String name;
    NoteType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
