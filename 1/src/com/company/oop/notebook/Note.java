package com.company.oop.notebook;

public class Note {
    private String topic;
    private String creationDate;
    private String email;
    private String message;
    private NoteType noteType;

    public Note(String topic, String creationDate, String email, String message) {
        this.topic = topic;
        this.creationDate = creationDate;
        this.email = email;
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
