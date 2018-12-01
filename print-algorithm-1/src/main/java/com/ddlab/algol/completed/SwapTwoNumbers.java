package com.ddlab.algol.completed;

/**
 * Created by PIKU on 9/16/2015.
 */
public class SwapTwoNumbers {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+"----"+b);
    }
}
