package com.ddlab.rnd.type1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PIKU on 11/21/2015.
 */
public class Test1 {

    public static void main(String[] args) {

        Bank bank = new Bank();
        List<Account> actList = new ArrayList<Account>();

        Account act = new Account();
        actList.add(act);

        act = new SavingsAccount();
        actList.add(act);

        act = new DematAccount();
        actList.add(act);

        act = new LoanAccount();
        actList.add(act);


//        actList.add(new Account());
//        actList.add(new SavingsAccount());
//        actList.add(new DematAccount());
//        actList.add(new LoanAccount());

//
        for (int i = 0; i < actList.size(); i++) {
            Account act1 = actList.get(i);
            bank.openAccount(act1);
        }
    }
}
