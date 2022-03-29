package com.company.oop.bank;

import java.util.UUID;

public class Account {
    private String id;
    private int balance;
    private boolean isBlocked;

    public Account() {
        this.id = UUID.randomUUID().toString();
        this.balance = 0;
        this.isBlocked = false;
    }

    public String toString() {
        return "id " + id + " balance " + balance + " isBlocked " + isBlocked;
    }
}
