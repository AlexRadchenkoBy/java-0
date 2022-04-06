package com.company.oop.vouchers;

public class Main {
    public static void main(String[] args) {
        checkVouchers();
    }

    public static void checkVouchers() {
        Agency agency = new Agency("Одиссей");
        Vouchers voucher1 = new Vouchers(VoucherType.RELAXATION, "Автобус", false, 2);
        agency.createClient("Сергей", 293424563, voucher1);

    }
}
