package com.company.oop.library;

import java.util.UUID;

public class User {
    private boolean isAdmin;
    private String id;
    private String name;
    private String email;

    public User(boolean isAdmin, String name, String email) {
        this.isAdmin = isAdmin;
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
    }
}
