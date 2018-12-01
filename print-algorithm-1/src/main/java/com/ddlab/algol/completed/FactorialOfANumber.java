package com.ddlab.algol.completed;

/**
 * Created by PIKU on 9/16/2015.
 */
public class FactorialOfANumber {

    public static int factorial( int n ) {

        if( n==0 ) return 1;
        return n*factorial( n-1 );
    }

    public static void main(String[] args) {

        System.out.println(factorial(6));
    }
}
