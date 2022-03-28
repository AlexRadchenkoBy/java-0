package com.company.oop.bank;

import java.util.ArrayList;

public class Account {
    private int id;
    private int balance;
    private boolean isBlocked;

    public Account(int id, int balance, boolean isBlocked) {
        this.id = id;
        this.balance = balance;
        this.isBlocked = isBlocked;

        ArrayList<Account> account1 = new ArrayList<Account>();
        Account accountOne = new Account(28032201, 406, false);
        account1.add(accountOne);
        ArrayList<Account> account2 = new ArrayList<Account>();
        Account accountTwo = new Account(30042102, 560, false);
        account2.add(accountTwo);
        ArrayList<Account> account3 = new ArrayList<Account>();
        Account accountThree = new Account(27042303, -15, true);
        account3.add(accountThree);
        ArrayList<Account> account4 = new ArrayList<Account>();
        Account accountFour = new Account(32062504, - 10, true);
    }
}
