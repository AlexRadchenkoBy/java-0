package com.company.oop.notebook;

import java.util.Date;

public class Note {
    private String topic;
    private Date creationDate;
    private String email;
    private String message;

    public Note(String topic, Date creationDate, String email, String message) {
        this.topic = topic;
        this.creationDate = creationDate;
        this.email = email;
        this.message = message;
    }

    public Note(String topic, String email, String message) {
        this.topic = topic;
        this.creationDate = new Date();
        this.email = email;
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public Date getCreationDate() {
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
