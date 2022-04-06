package com.company.oop.vouchers;

public enum VoucherType {
    RELAXATION("Отдых"),
    EXCURSION("Экскурсия"),
    TREATMENT("Лечение"),
    SHOPPING("Шоппинг");

    private String name;

     VoucherType(String name) {
        this.name = name;
    }

    public String getName() {
         return name;
    }

    @Override
    public String toString() {
         return name;
    }


}
