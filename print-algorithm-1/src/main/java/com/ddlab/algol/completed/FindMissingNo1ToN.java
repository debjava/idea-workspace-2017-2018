package com.ddlab.algol.completed;

/**
 * Created by PIKU on 9/17/2015.
 */
public class FindMissingNo1ToN {

    public static int findMissing(int[] a, int n ) {
        int idealSum = ( ( n*( n+1 ) )/2 );
        int actualSum = 0;
        for (int i = 0; i < a.length; i++) {
            actualSum = actualSum + a[i];
        }
        return idealSum - actualSum;
    }

    public static void main(String[] args) {
        int[] a = {5,4,1,3,2,7};
        System.out.println("Missing :::"+findMissing(a,7));
    }
}
