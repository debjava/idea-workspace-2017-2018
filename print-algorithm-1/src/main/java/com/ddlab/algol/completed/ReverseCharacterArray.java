package com.ddlab.algol.completed;

/**
 * Created by PIKU on 9/17/2015.
 */
public class ReverseCharacterArray {

    public static void reverse(char[] ch) {
        int mid = ch.length/2;
        int len = ch.length - 1;
        for (int i = 0; i < mid; i++) {
            char temp = ch[i];
            ch[i] = ch[len - i];
            ch[len - i] = temp;
        }
    }

    public static void reverse1(char[] ch) {
        for (int i = 0 , j = ch.length - 1 ; i < j ; i++ , j-- ) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
    }

    public static void reverseIntArray(int[] a) {

        for (int i = 0 , j = a.length - 1; i < j; i++, j--) {

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static void main(String[] args) {

//        char[] ch = {'A','B','C','D','E'};
//        reverse(ch);
//        for( char ch1 : ch)
//            System.out.print(ch1 + "\t");

        int[] a = {1,2,3,4};
        reverseIntArray(a);
        for (int b : a)
            System.out.print(b + "\t");
    }
}
