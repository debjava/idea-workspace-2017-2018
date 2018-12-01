package com.ddlab.rnd.type1;

public class Bank {

    public void openAccount(Account act) {
        System.out.println("Basic account ....");
    }

    public void openAccount(SavingsAccount act) {
        System.out.println("Savings account ....");
    }

    public void openAccount(DematAccount act) {
        System.out.println("Demat account ....");
    }

    public void openAccount(LoanAccount act) {
        System.out.println("Loan account ....");
    }

}
