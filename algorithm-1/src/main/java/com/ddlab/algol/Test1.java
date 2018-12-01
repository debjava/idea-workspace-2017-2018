package com.ddlab.algol;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by PIKU on 9/14/2015.
 */
public class Test1 {

    static final int MAXIMUM_CAPACITY = 1 << 30;
    public static int roundUpToPowerOf2(int number) {
        // assert number >= 0 : "number must be non-negative";
        return number >= MAXIMUM_CAPACITY
                ? MAXIMUM_CAPACITY
                : (number > 1) ? Integer.highestOneBit((number - 1) << 1) : 1;
    }


    public static void main(String[] args ) {

        System.out.println(roundUpToPowerOf2(0)); //1
        System.out.println(roundUpToPowerOf2(1)); //1
        System.out.println(roundUpToPowerOf2(2)); //2
        System.out.println(roundUpToPowerOf2(3)); //4
        System.out.println(roundUpToPowerOf2(4)); //4
        System.out.println(roundUpToPowerOf2(5)); //8
        System.out.println(roundUpToPowerOf2(7)); //8
        System.out.println(roundUpToPowerOf2(9)); //16
        System.out.println(roundUpToPowerOf2(11)); //16
        System.out.println(roundUpToPowerOf2(15)); //16
        System.out.println(roundUpToPowerOf2(16)); //16
        System.out.println(roundUpToPowerOf2(19)); //32
        System.out.println(roundUpToPowerOf2(27)); //32
        System.out.println(roundUpToPowerOf2(32)); //32
        System.out.println(roundUpToPowerOf2(33)); //64
        System.out.println(roundUpToPowerOf2(48)); //64
        System.out.println(roundUpToPowerOf2(65)); //128

    }

}
