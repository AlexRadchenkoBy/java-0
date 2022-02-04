package com.company.oop;

import com.company.oop.employee.Cashier;
import com.company.oop.employee.Manager;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager(34, 8);
        Cashier cashier = new Cashier(45, 8);
        manager.getSalary();
        cashier.getSalary();
        System.out.println(manager.getSalary() + " " + cashier.getSalary());

        Test1 test1 = new Test1(34, 56);
        System.out.println(test1.sumNumbers() + " " + test1.max());
    }

}
