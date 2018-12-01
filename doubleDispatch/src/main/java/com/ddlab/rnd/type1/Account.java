package com.ddlab.rnd.type1;

public class Account {

    public void open(Bank bank) {
        System.out.println("Basic Account opened ...");
        bank.openAccount(this);
    }
}
