package com.company.oop.bank;

public class Main {
    public static void main(String[] args) {
        checkBank();
    }

    public static void checkBank() {
        Bank bank = new Bank("Денюжка");
        bank.createClient(29032201);
        String accountId = bank.createAccount(29032201);
        bank.addBalance(29032201, accountId, 400);
        bank.addBalance(29032201, accountId, 400);

        System.out.println(bank.toString());
    }

}
