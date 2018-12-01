package com.ddlab.algol.completed;

import java.util.Arrays;

public class MergeTwoSortedArrays2 {

    public static void merge(int[] a, int[] b) {

        int i = a.length - 1, j = b.length - 1;
//        int x = a.length + b.length - 1;
        int x =  j - 1;
        while (i >= 0 && j >= 0) {
            if (a[i] >= b[j]) a[x--] = a[i--];
            else a[x--] = b[j--];
        }

        while (i >= 0) a[x--] = a[i--];
        while (j >= 0) a[x--] = b[j--];
    }

    public static void merge1(int[] arrayA, int[] arrayB) {

        int len1 = arrayA.length;
        int len2 = arrayB.length;

        arrayA = Arrays.copyOf(arrayA, len1+len2);
//        System.out.println(Arrays.toString(arrayA));
        int i = len1 - 1;
        int j = len2 - 1;
        int x = len1 + len2 - 1;

        while(i >= 0 && j >= 0) {
//            System.out.println(Arrays.toString(arrayA));
            if (arrayA[i] >= arrayB[j])
                arrayA[x--] = arrayA[i--];
            else
                arrayA[x--] = arrayB[j--];
        }
    }

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4, 5, 5};
        int[] a2 = new int[15];
        a2[0] = 6;
        a2[1] = 7;
        a2[2] = 8;
        a2[3] = 9;

        merge( a2 , a1);
        for (int i : a2)
            System.out.print(i + "\t");

    }
}
