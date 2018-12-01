package com.ddlab.rnd.comparator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PIKU on 6/2/2017.
 */
public class Test1 {

    public static void main(String[] args) {
        List<? super Number> l1 = new ArrayList<>();
        for( int i = 0 ; i < 10 ; i++ ) {
            l1.add(i);
        }
        System.out.println(l1);
        List<? extends Number> l2 = (List<? extends Number>)l1;
        System.out.println(l2);



    }
}
