package com.company.oop.vouchers;

import com.company.oop.bank.Account;

import java.util.ArrayList;
import java.util.Comparator;

// Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
public class Agency {
    private String name;
    private ArrayList<Client> clients;
    private ArrayList<Vouchers> vouchers;

    public Agency(String name) {
        this.name = name;
        this.clients = new ArrayList<Client>();
        this.vouchers = new ArrayList<Vouchers>();
    }

    public void createClient(String name, int phoneNumber) {
        Client client = new Client(name, phoneNumber);
        clients.add(client);
    }

    public void createVouchers(VoucherType typeVoucher, String transport, boolean food, int days) {
        Vouchers voucher = new Vouchers(typeVoucher, transport, food, days);
        vouchers.add(voucher);
    }

    public ArrayList<Vouchers> selectingSortingVouchers(VoucherType typeVouchers) {
        ArrayList<Vouchers> sort = new ArrayList<>();
        for (int i = 0; i < vouchers.size(); i++) {
            if (vouchers.get(i).getTypeVouchers() == typeVouchers) {
                sort.add(vouchers.get(i));
                sort.sort(Comparator.comparing(Vouchers::getDays));
            }
        }
        return sort;
    }

    public Vouchers changeVouchersAndAddClient(String clientName, Vouchers voucher, boolean food) {
        Vouchers addedVoucher = new Vouchers(voucher); // todo: explain
        addedVoucher.setFood(food);
        getClient(clientName).setVoucher(addedVoucher);
        return addedVoucher;
    }

    public Client getClient(String name) {
        for (Client client : clients) {
            if (client.getName() == name) {
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
