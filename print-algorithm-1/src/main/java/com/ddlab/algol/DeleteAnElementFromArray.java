package com.ddlab.algol;

import java.util.Arrays;

//Delete all occurrences of a number from an array
public class DeleteAnElementFromArray {

    public static int[] removeAllElements(int[] a, int value) {

        int j = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == value) {
                //Found the element
            } else {
                a[j++] = a[i];
            }
        int newSize = j ;
//        int[] b = new int[newSize];
//        System.arraycopy(a,0,b,0,newSize);

        int[] b = Arrays.copyOfRange(a,0,newSize);

//        for (int i = 0; i < newSize; i++) {
//            b[i] = a[i];
//        }
        return b;

    }

    public static void main(String[] args) {

        int[] a = {1,2,2,3,4,56,7,8,8};
        for (int i : a )
            System.out.print(i+"\t");
        System.out.println();
        int[] b = removeAllElements(a,2);
        for (int i : b )
            System.out.print(i + "\t");
    }
}
