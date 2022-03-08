package com.company.oop.customer;
import java.util.*;

public class Customers {
    // 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
    //и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
    //и методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
    //Найти и вывести:
    //a) список покупателей в алфавитном порядке;
    //b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

    ArrayList<Customer> customers;

    public Customers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> sortAlphabeticalOrder() {
        ArrayList<Customer> copiedCustomers = new ArrayList<Customer>(customers);
        copiedCustomers.sort(Comparator.comparing(Customer::getSurname));
        return copiedCustomers;
    }

    public ArrayList<Customer> findByCardNumberInterval(int min, int max) {
        ArrayList<Customer> filteredCustomers = new ArrayList<Customer>();
        for (int i = 0, j = 0; i < customers.size(); i++) {
            if (customers.get(i).getCreditCardNumber() >= min && customers.get(i).getCreditCardNumber() <= max) {
                filteredCustomers.add(j, customers.get(i));
                j++;
            }
        }
        return filteredCustomers;
    }
}
