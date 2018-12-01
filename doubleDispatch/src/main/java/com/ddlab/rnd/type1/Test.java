package com.ddlab.rnd.type1;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Account> actList = new ArrayList<Account>();

        actList.add( new Account());
        actList.add( new SavingsAccount());
        actList.add( new DematAccount());
        actList.add( new LoanAccount());

        Bank bank = new Bank();
        for( Account act : actList) {
//            bank.openAccount(act);//Do not call like this
            act.open(bank);
        }
    }
}
