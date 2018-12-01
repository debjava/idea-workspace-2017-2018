package com.ddlab.algol.completed;

/**
 * Created by PIKU on 9/20/2015.
 */
public class Anagram {

    public static void main(String[] args) {

        String s1 = "post";
        String s2 = "pots";

        int val1 = 1;
        int val2 = 1;
        for (int i = 0; i < s1.length(); i++) {
            val1 = val1*s1.charAt(i);
            val2 = val2*s2.charAt(i);
        }

        System.out.println(val1+"-----"+val2);
    }
}
