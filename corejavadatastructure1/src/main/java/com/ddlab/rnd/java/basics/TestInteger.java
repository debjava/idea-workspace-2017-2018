package com.ddlab.rnd.java.basics;

public class TestInteger {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        System.out.println("(i1 == i2)-->"+(i1 == i2));//false
        System.out.println("(i1.equals(i2)-->"+(i1.equals(i2)));//true

        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println("(s1 == s2)"+(s1 == s2));//true
        System.out.println("(s1 == s3)"+(s1 == s3));//false
        String s4 = s3.intern();
        System.out.println("(s1 == s4)"+(s1 == s4));//true , after String interning


    }
}
