package com.ddlab.rnd.type1;

public class DematAccount extends Account {
    public void open(Bank bank) {
        System.out.println("Demat account opened ..");
        bank.openAccount(this);
    }
}
