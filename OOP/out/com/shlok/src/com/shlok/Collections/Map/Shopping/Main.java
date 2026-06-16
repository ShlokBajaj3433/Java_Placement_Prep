package com.shlok.Collections.Map.Shopping;

public class Main {

    public static void main(String[] args) {

        OrderManager manager = new OrderManager();

        // Add Customers
        Customer c1 = new Customer(101, "Shlok");
        Customer c2 = new Customer(102, "Rahul");
        Customer c3 = new Customer(103, "Suchit");

        manager.addCustomer(c1);
        manager.addCustomer(c2);
        manager.addCustomer(c3);

        // Add Orders
        manager.addOrder(new Order(1, 101, 2500.0));
        manager.addOrder(new Order(2, 101, 1500.0));
        manager.addOrder(new Order(3, 102, 3000.0));
        manager.addOrder(new Order(4, 103, 1200.0));
        manager.addOrder(new Order(5, 102, 1800.0));

        System.out.println("\n===== Customers =====");
        manager.displayCustomers();

        System.out.println("\n===== Orders =====");
        manager.displayOrders();

        System.out.println("\n===== Orders of Customer 101 =====");
        manager.displayOrdersOfCustomers(101);

        System.out.println("\n===== Total Spending =====");
        manager.calculateTotalSpending(101);

        System.out.println("\n===== Highest Spending Customer =====");
        manager.findHighesSpendingCustomer();

        System.out.println("\n===== Orders Per Customer =====");
        manager.countOrdersPerCustomer();

        System.out.println("\n===== Removing Customer 102 =====");
        manager.removeCustomer(102);

        System.out.println("\n===== Customers After Removal =====");
        manager.displayCustomers();

        System.out.println("\n===== Orders After Removal =====");
        manager.displayOrders();
    }
}