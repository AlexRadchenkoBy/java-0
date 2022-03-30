package com.company.oop.bank;

import java.util.ArrayList;

public class Client {
    private int id;
    private ArrayList<Account> accounts;

    public Client(int id) {
        this.id = id;
        this.accounts = new ArrayList<Account>();
    }

    public int getId() {
        return id;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public String toString() {
        return "id " + id + " accunts " + accounts;
    }

}
