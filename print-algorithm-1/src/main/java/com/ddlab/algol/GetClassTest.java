package com.ddlab.algol;

/**
 * Created by PIKU on 10/8/2015.
 */

class AParent {

}

class BSub extends AParent {

}

class CSub extends BSub {

}

public class GetClassTest {

    public static void main(String[] args) {
        BSub sub = new BSub();
        AParent p = new AParent();
        System.out.println( sub.getClass() == p.getClass() );
    }

}
