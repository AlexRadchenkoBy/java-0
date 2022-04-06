package com.company.oop.vouchers;
// Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

public class Vouchers {
    private VoucherType typeVouchers;
    private String transport;
    private boolean food;
    private int days;

    public Vouchers(VoucherType typeVouchers, String transport, boolean food, int days) {
        this.typeVouchers = typeVouchers;
        this.transport = transport;
        this.food = food;
        this.days = days;
    }

    public VoucherType getTypeVouchers() {
        return typeVouchers;
    }

}
