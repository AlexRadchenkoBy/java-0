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

    public Vouchers(Vouchers voucher) {
        this(voucher.getTypeVouchers(), voucher.getTransport(), voucher.getFood(), voucher.getDays());
    }

    public VoucherType getTypeVouchers() {
        return typeVouchers;
    }

    public int getDays() {
        return days;
    }

    public String getTransport() {
        return transport;
    }

    public boolean getFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "typeVouchers " + typeVouchers + " transport " + transport + " food " + food + " days " + days;
    }

}
