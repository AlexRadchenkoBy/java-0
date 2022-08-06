package com.company.oop.archive;

import java.util.UUID;

public class User {
    private String id;
    private boolean isAdmin;
    private String email;
    private String passwordHash;

    public User(String email, String passwordHash) {
        this.id = UUID.randomUUID().toString();
        this.isAdmin = false;
        this.email = email;
        this.passwordHash = passwordHash;
    }

    public User(String id, boolean isAdmin, String email, String passwordHash) {
        this.id = id;
        this.isAdmin = isAdmin;
        this.email = email;
        this.passwordHash = passwordHash;
    }

    public String getId() {
        return id;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", isAdmin=" + isAdmin +
                ", email='" + email + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                '}';
    }
}
