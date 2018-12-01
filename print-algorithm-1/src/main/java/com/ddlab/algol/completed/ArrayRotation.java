package com.ddlab.algol.completed;

/**
 * Created by PIKU on 9/18/2015.
 */
public class ArrayRotation {

    public static void rotateLeft( Object[] a ) {

        Object firstElement = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i-1] = a[i];
        }
        a[ a.length -1 ] = firstElement;
    }

    public static void rotateRight( Object[] a ) {

        Object lastElement = a[ a.length - 1 ];
        for (int i = a.length - 1; i > 0 ; i--) {
            a[i] = a[i - 1];
        }
        a[ 0 ] = lastElement;
    }

    public static void main(String[] args) {

        Integer[] a = {1,2,3,4,5};

        for (Integer i : a )
            System.out.print(i+"\t");
        rotateLeft(a);
        System.out.println();
        for (Integer i : a )
            System.out.print(i + "\t");
    }


}
