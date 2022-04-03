package com.company.oop.bank;

public class Main {
    public static void main(String[] args) {
        checkBank();
    }

    public static void checkBank() {
        Bank bank = new Bank("Денюжка");
        int clientId = 29032201;
        bank.createClient(clientId);
        String accountId1 = bank.createAccount(clientId);
        String accountId2 = bank.createAccount(clientId);
        String accountId3 = bank.createAccount(clientId);
        String accountId4 = bank.createAccount(clientId);
        bank.addBalance(clientId, accountId1, 400);
        bank.addBalance(clientId, accountId2, 200);
        bank.addBalance(clientId, accountId3, -65);
        bank.addBalance(clientId, accountId4, -30);
        bank.blockAccount(clientId, accountId1, true);
        System.out.println(bank.toString());
        System.out.println(bank.searchAndSortAccounts(clientId));
        System.out.println(bank.sumOfAllBalances(clientId));
        System.out.println(bank.sumAllPositiveBalances(clientId));
        System.out.println(bank.sumAllNegativeBalances(clientId));
    }

}
