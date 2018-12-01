package com.ddlab.algol;

/**
 * Created by PIKU on 9/20/2015.
 */
public class SameHashCode {

    public static void main(String[] args) {

        String s1 = "FB";
        String s2 = "Ea";

        System.out.println("S1 hashcode :::"+s1.hashCode());
        System.out.println("S2 hashcode :::"+s2.hashCode());

        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print((int) ch[i]+"\t");
        }



        System.out.println(Long.valueOf(0).hashCode() == Long.valueOf(-1).hashCode());
        System.out.println(Long.valueOf(0).hashCode());
        System.out.println(Long.valueOf(-1).hashCode());
    }
}
