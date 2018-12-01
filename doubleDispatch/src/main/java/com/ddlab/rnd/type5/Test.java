package com.ddlab.rnd.type5;

import java.util.ArrayList;
import java.util.List;

class SavingAccount {

    public void open() {
        System.out.println("... Opened Saving Account Successfully ...");
    }

}

class DematAccount extends SavingAccount {

    public void open() {
        System.out.println("... Opened Demat Account Successfully ...");
    }
}

class Bank {

    public void open(SavingAccount act ) {
        System.out.println("... Opening Saving Account ...");
        act.open();
    }

    public void open(DematAccount act ) {
        System.out.println("... Opening Demat Account ...");
        act.open();
    }
}

public class Test {
    public static void main(String[] args) {
        List<SavingAccount> actList = new ArrayList<SavingAccount>();

        Bank bank = new Bank();

        actList.add( new SavingAccount());
        actList.add( new DematAccount());

        for( SavingAccount act : actList ) {
            bank.open(act);
        }
    }
}
