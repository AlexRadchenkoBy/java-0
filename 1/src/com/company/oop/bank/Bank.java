package com.company.oop.bank;
// Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

import com.company.oop.customer.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bank {
    private String name;
    private ArrayList<Client> clients;

    public Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<Client>();
    }

    public void createClient(int idClient) {
        Client client = new Client(idClient);
        clients.add(client);
    }

    public String createAccount(int idClient) {
        Account account = new Account();
        getClient(idClient).getAccounts().add(account);
        return account.getId();
    }

    public Client getClient(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }

    // - найти клиента в списке clients. Входные данные clientId, clients. Выходные данные client;
    // - найти счет клиента. Входные даныые client.getAccaunts, accauntId. Выходные данные accaunt;
    // - положить деньги на счет accaunt.addBalance(balance);
    public void addBalance(int clientId, String accountId, int balance) {
        ArrayList<Account> accounts = getClient(clientId).getAccounts();
        for (Account account : accounts) {
            if (account.getId() == accountId) {
                if (account.getIsBlocked()) {
                    System.out.println("Аккаунт заблокирован");
                } else {
                    account.addBalance(balance);
                }
            }
        }
    }

    public void blockAccount(int clientId, String accountId, boolean isBlock) {
        ArrayList<Account> accounts = getClient(clientId).getAccounts();
        for (Account account : accounts) {
            if (account.getId() == accountId) {
                account.setIsBlocked(isBlock);
            }
        }
    }

    public ArrayList<Account> searchAndSortAccounts(int clientId) {
        ArrayList<Account> searchableAccounts = new ArrayList<Account>();
        searchableAccounts.addAll(getClient(clientId).getAccounts());
        searchableAccounts.sort(Comparator.comparing(Account::getBalance));
        return searchableAccounts;
    }

    public int sumOfAllBalances(int clientId) {
        int sum = 0;
        ArrayList<Account> accounts = getClient(clientId).getAccounts();
        for (Account account : accounts) {
            sum = sum + account.getBalance();
        }
        return sum;
    }

    public int sumAllPositiveBalances(int clientId) {
        int sum = 0;
        ArrayList<Account> accounts = getClient(clientId).getAccounts();
        for (Account account : accounts) {
            if (account.getBalance() > 0) {
                sum = sum + account.getBalance();
            }
        }
        return sum;
    }

    public int sumAllNegativeBalances(int clientId) {
        int sum = 0;
        ArrayList<Account> accounts = getClient(clientId).getAccounts();
        for (Account account : accounts) {
            if (account.getBalance() < 0) {
                sum = sum + account.getBalance();
            }
        }
        return sum;
    }


    public String toString() {
        return "name " + name + " clients " + clients;
    }
}
