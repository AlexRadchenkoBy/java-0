package com.company.oop.vouchers;

import java.util.ArrayList;
import java.util.Comparator;

// Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
public class Agency {
    private String name;
    private ArrayList<Client> clients;
    private ArrayList<Voucher> vouchers;

    public Agency(String name) {
        this.name = name;
        this.clients = new ArrayList<Client>();
        this.vouchers = new ArrayList<Voucher>();
    }

    public void createClient(String name, int phoneNumber) {
        Client client = new Client(name, phoneNumber);
        clients.add(client);
    }

    public void createVouchers(VoucherType voucherType, String transport, boolean food, int days) {
        Voucher voucher = new Voucher(voucherType, transport, food, days);
        vouchers.add(voucher);
    }

    public ArrayList<Voucher> selectingSortingVouchers(VoucherType voucherType) {
        ArrayList<Voucher> sortedVouchers = new ArrayList<>();
        for (Voucher voucher : vouchers) {
            if (voucher.getVoucherType() == voucherType) {
                sortedVouchers.add(voucher);
            }
        }
        sortedVouchers.sort(Comparator.comparing(Voucher::getDays));
        return sortedVouchers;
    }

    public void changeVoucherAndAddToClient(String clientName, Voucher voucher, boolean food) {
        Voucher addedVoucher = new Voucher(voucher);
        addedVoucher.setFood(food);
        getClient(clientName).setVoucher(addedVoucher);
    }

    public Client getClient(String name) {
        for (Client client : clients) {
            if (client.getName().equals(name)) {
                return client;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "name='" + name + '\'' +
                ", clients=" + clients +
                ", vouchers=" + vouchers +
                '}';
    }
}
