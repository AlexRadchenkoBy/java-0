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

    public void createAccount(Client client) {
        Account account = new Account();
        client.getAccounts().add(account);
    }

    public Client getClient(int id) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) {
                return clients.get(i);
            }
        }
        return null;
    }

    public String toString() {
        return "name " + name + " clients " + clients;
    }
}
