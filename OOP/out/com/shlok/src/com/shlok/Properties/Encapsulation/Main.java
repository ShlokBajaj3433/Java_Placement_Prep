package com.shlok.Properties.Encapsulation;

public class Main {
    private double BankAccount;
    public double getBankAccount() {
        return BankAccount;
    }
    public void setBankAccount(double bankAccount) {
        BankAccount = bankAccount;
    }

    private void display() {
        System.out.println("Bank Account Balance: " + BankAccount);
    }
    
    public static void main(String[] args) {
        Main account = new Main();
        account.setBankAccount(1000.50);
        account.display();
    }
}
