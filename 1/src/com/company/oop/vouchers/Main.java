package com.company.oop.vouchers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        checkVouchers();
    }

    public static void checkVouchers() {
        Agency agency = new Agency("Одиссей");
        agency.createClient("Сергей", 293424563);
        agency.createVouchers(VoucherType.RELAXATION, "Самолет", true, 10);
        agency.createVouchers(VoucherType.RELAXATION, "Самолет", true, 5);
        agency.createVouchers(VoucherType.RELAXATION, "Самолет", true, 7);
        agency.createVouchers(VoucherType.EXCURSION, "Автобус", false, 3);
        agency.createVouchers(VoucherType.EXCURSION, "Автобус", false, 2);
        agency.createVouchers(VoucherType.EXCURSION, "Автобус", false, 1);
        agency.createVouchers(VoucherType.TREATMENT, "Поезд", true, 21);
        agency.createVouchers(VoucherType.TREATMENT, "Поезд", true, 14);
        agency.createVouchers(VoucherType.TREATMENT, "Поезд", true, 10);
        agency.createVouchers(VoucherType.SHOPPING, "Поезд", false, 1);
        agency.createVouchers(VoucherType.SHOPPING, "Поезд", false, 2);
        agency.createVouchers(VoucherType.SHOPPING, "Поезд", false, 3);
        ArrayList<Vouchers> selectedAndSorted = agency.selectingSortingVouchers(VoucherType.RELAXATION);
        System.out.println(selectedAndSorted);
        agency.changeVouchersAndAddClient("Сергей", selectedAndSorted.get(0), true);
        System.out.println(agency.toString());
    }
}
