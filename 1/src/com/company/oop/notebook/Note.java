package com.company.oop.notebook;

public class Note {
    private String topic;
    private String dateOfCreation;
    private String email;
    private Message message;

    public Note(String topic, String dateOfCreation, String email, Message message) {
        this.topic = topic;
        this.dateOfCreation = dateOfCreation;
        this.email = email;
        this.message = message;
    }
}
