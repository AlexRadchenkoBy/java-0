package com.company.oop.bank;
// Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

import java.util.ArrayList;

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
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) {
                return clients.get(i);
            }
        }
        return null;
    }

    // - найти клиента в списке clients. Входные данные clientId, clients. Выходные данные client;
    // - найти счет клиента. Входные даныые client.getAccaunts, accauntId. Выходные данные accaunt;
    // - положить деньги на счет accaunt.addBalance(balance);
    public void addBalance(int clientId, String accountId, int balance) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == clientId) {
                Client client = clients.get(i);
                for (int j = 0; j < client.getAccounts().size(); j++) {
                    if (client.getAccounts().get(j).getId() == accountId) {
                        Account account = client.getAccounts().get(j);
                        account.addBalance(balance);
                    }
                }
            }
        }
    }

    public String toString() {
        return "name " + name + " clients " + clients;
    }
}
