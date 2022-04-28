package com.company.oop.library;

import java.util.UUID;

public class User {
    private String id;
    private boolean isAdmin;
    private String name;
    private String email;
    private String password;

    public User(boolean isAdmin, String name, String email, String password) {
        this.id = UUID.randomUUID().toString();
        this.isAdmin = isAdmin;
        this.name = name;
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public User(String id, boolean isAdmin, String name, String email, String password) {
        this.id = id;
        this.isAdmin = isAdmin;
        this.name = name;
        this.email = email;
        this.password = password;
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
