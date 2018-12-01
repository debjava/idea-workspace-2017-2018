package com.ddlab.algol.completed;

/**
 * Created by PIKU on 9/17/2015.
 */
public class ReverseAString {

    public static String reverse(String s ) {
        if( s == null || s.length() == 0 ) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "ABCD";
        System.out.println("Reverse :::"+reverse(s));
    }
}
