package com.ddlab.rnd.type1;

public class LoanAccount extends Account {

    public void open(Bank bank) {
        System.out.println("Loan account opened ..");
        bank.openAccount(this);
    }
}
