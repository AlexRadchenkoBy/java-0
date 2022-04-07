package com.company.oop.vouchers;
import java.util.ArrayList;
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

    @Override
    public String toString() {
        return "name " + name + " clients " + clients + " vouchers " + vouchers;
    }
}
