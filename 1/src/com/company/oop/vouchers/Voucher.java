package com.company.oop.vouchers;
// Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

public class Voucher {
    private VoucherType voucherType;
    private String transport;
    private boolean food;
    private int days;

    public Voucher(VoucherType voucherType, String transport, boolean food, int days) {
        this.voucherType = voucherType;
        this.transport = transport;
        this.food = food;
        this.days = days;
    }

    public Voucher(Voucher voucher) {
        this(voucher.getVoucherType(), voucher.getTransport(), voucher.getFood(), voucher.getDays());
    }

    public VoucherType getVoucherType() {
        return voucherType;
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
        return "Vouchers{" +
                "typeVouchers=" + voucherType +
                ", transport='" + transport + '\'' +
                ", food=" + food +
                ", days=" + days +
                '}';
    }
}
