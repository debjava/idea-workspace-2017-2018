package com.ddlab.algol;


import java.util.Arrays;

public class SystemArrayCopy {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
//        int[] b = new int[a.length];

        int[] b = null;

//        System.arraycopy(a,0,b,0,a.length);//copy all elements
//        System.arraycopy(a,0,b,0,2);//copy 2 elements

      b = Arrays.copyOfRange(a, 2,5);


        for( int i : b)
            System.out.print(i+"  ");


    }
}
