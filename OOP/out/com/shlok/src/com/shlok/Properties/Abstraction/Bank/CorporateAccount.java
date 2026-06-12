package com.shlok.Properties.Abstraction.Bank;

public class CorporateAccount extends Account {
    
        CorporateAccount(String name, double balance) {
            super(name, balance);
        }

    @Override
    void withdraw(double amt){
        if (balance - amt > 1000) {
            balance -= amt;
        }
        else{System.out.println("mini balance us required ");}
    }
}
