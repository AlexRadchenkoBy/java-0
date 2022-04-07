package com.company.oop.vouchers;

public class Main {
    public static void main(String[] args) {
        checkVouchers();
    }

    public static void checkVouchers() {
        Agency agency = new Agency("Одиссей");
        agency.createClient("Сергей", 293424563);
        agency.createVouchers(VoucherType.RELAXATION, "Самолет", true, 10);
        agency.createVouchers(VoucherType.EXCURSION, "Автобус", false, 3);
        agency.createVouchers(VoucherType.TREATMENT, "Поезд", true, 7);
        agency.createVouchers(VoucherType.SHOPPING, "Поезд", false, 1);
        System.out.println(agency.toString());
    }
}
