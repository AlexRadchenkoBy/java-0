package com.company.oop.notebook;

public enum MessageType {
    WORK("Работа"),
    RELAXATION("Отдых"),
    MEETING("Встреча");


    private String name;
    MessageType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
