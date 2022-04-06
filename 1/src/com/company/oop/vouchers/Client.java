package com.company.oop.vouchers;

public class Client {
    private String name;
    private int phoneNumber;
    private Vouchers voucher;

    public Client(String name, int phoneNumber, Vouchers voucher) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.voucher = voucher;
    }

    public Vouchers getVoucher() {
        return voucher;
    }
}
