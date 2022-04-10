package com.company.oop.vouchers;

public class Client {
    private String name;
    private int phoneNumber;
    private Voucher voucher;

    public Client(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", voucher=" + voucher +
                '}';
    }
}
