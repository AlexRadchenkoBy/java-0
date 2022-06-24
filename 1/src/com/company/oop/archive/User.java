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
}
