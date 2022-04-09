package com.company.oop.vouchers;

public class Client {
    private String name;
    private int phoneNumber;
    private Vouchers voucher;

    public Client(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Vouchers getVoucher() {
        return voucher;
    }

    public void setVoucher(Vouchers voucher) {
        this.voucher = voucher;
    }

    @Override
    public String toString() {
        return "name " + name + " phoneNumber " + phoneNumber + " voucher " + voucher;
    }
}
