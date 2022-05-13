package com.company.oop.library;

import java.util.UUID;

public class User {
    private String id;
    private boolean isAdmin;
    private String name;
    private String email;
    private String passwordHash;

    public User(String name, String email, String passwordHash) {
        this.id = UUID.randomUUID().toString();
        this.isAdmin = false;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
    }

    public String getId() {
        return id;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public User(String id, boolean isAdmin, String name, String email, String passwordHash) {
        this.id = id;
        this.isAdmin = isAdmin;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", isAdmin=" + isAdmin +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
