package com.ddlab.rnd.type1;

public class SavingsAccount extends Account {

    public void open(Bank bank) {
        System.out.println("Savings account opened ..");
        bank.openAccount(this);
    }
}
