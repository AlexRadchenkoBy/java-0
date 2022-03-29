package com.company.oop.bank;

public class Main {
    public static void main(String[] args) {
        checkBank();
    }

    public static void checkBank() {
        Bank bank = new Bank("Денюжка");
        bank.createClient(29032201);
        bank.createAccount(bank.getClient(29032201));

        System.out.println(bank.toString());
    }

}
