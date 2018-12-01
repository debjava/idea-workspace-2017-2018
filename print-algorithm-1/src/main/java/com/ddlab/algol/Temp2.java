package com.ddlab.algol;

/**
 * Created by PIKU on 9/24/2015.
 */
public class Temp2 {

    public static void arracopy( int[] a , int start, int[] destn , int start1 , int noOfElement ) {

        for (int i = start; i < noOfElement; i++) {
            destn[start1++] = a[start++];
        }
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[5];
        System.arraycopy(a,0,b,0,5);

        for( int i : b )
            System.out.print(i + "\t");
        System.out.println("\n");
        b = new int[5];
        arracopy(a,0,b,0,5);
        for( int i : b )
            System.out.print(i + "\t");
    }

}
