package com.company.oop.vouchers;

import com.company.oop.bank.Account;

import java.util.ArrayList;

public class Agency {
    private String name;
    private ArrayList<Client> clients;
    private ArrayList<Vouchers> vouchers;

    public Agency(String name) {
        this.name = name;
        this.clients = new ArrayList<Client>();
    }

    public void createClient(String name, int phoneNumber, Vouchers voucher) {
        Client client = new Client(name, phoneNumber, voucher);
        clients.add(client);
    }

    public Vouchers createVouchers(String name, int phoneNumber, Vouchers typeVoucher) {
        Vouchers voucher = new Vouchers();
        for (int i = 0; i < vouchers.size(); i++) {
            vouchers.get(i).getTypeVouchers().getName();
        }
        return null;
    }
}
