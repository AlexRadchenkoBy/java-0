package com.company.oop.customer;
import java.util.Arrays;
import java.util.Comparator;

public class Customers {
    // 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
    //и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
    //и методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
    //Найти и вывести:
    //a) список покупателей в алфавитном порядке;
    //b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

    Customer[] customers;

    public Customers(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] sortAlphabeticalOrder() {
        Customer[] copiedCustomers = new Customer[customers.length];
        System.arraycopy(customers, 0, copiedCustomers, 0, customers.length);
        Arrays.sort(copiedCustomers, Comparator.comparing(Customer::getSurname));
        return copiedCustomers;
    }

    public Customer[] findByCardNumberInterval(int min, int max) {
        int filteredCustomersLength = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getCreditCardNumber() >= min && customers[i].getCreditCardNumber() <= max) {
                filteredCustomersLength++;
            }
        }
        Customer[] filteredCustomers = new Customer[filteredCustomersLength];
        for (int i = 0, j = 0; i < customers.length; i++) {
            if (customers[i].getCreditCardNumber() >= min && customers[i].getCreditCardNumber() <= max) {
                filteredCustomers[j] = customers[i];
                j++;
            }
        }
        return filteredCustomers;
    }
}
