package com.ddlab.algol.completed;

/**
 * Created by PIKU on 9/16/2015.
 */
public class FibbonacciSeries {

    public static int fibbo( int n ) {

        if( n == 0 ) return 0;
        else if( n == 1) return 1;
        else
            return fibbo( n - 1)+fibbo( n - 2 );
    }

    public static void main(String[] args) {

        int n = 7;
        for (int i = 0; i < n; i++) {
            System.out.println(fibbo(i));
        }
    }
}
