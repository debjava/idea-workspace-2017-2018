package com.ddlab.algol.completed;

import java.util.Arrays;

public class MergeSort1 {

    public static void mergeSort(int[] a) {
        if( a.length <= 1 ) return;
        int[] a1 = Arrays.copyOfRange(a, 0, a.length / 2);
        int[] a2 = Arrays.copyOfRange(a, a.length / 2, a.length);
        mergeSort(a1);
        mergeSort(a2);
        merge(a1, a2, a);
    }

    public static void merge(int[] a1 , int[] a2 , int[] a ) {

        int j = 0;
        int k = 0;

        for (int i = 0; i < a.length; i++) {

            if( j == a1.length )
                a[i] = a2[k++];
            else if( k == a2.length )
                a[i] = a1[j++];
            else if( isLess(a1[j],a2[k]) )
                a[i] = a1[j++];
            else
                a[i] = a2[k++];
        }
    }

    public static boolean isLess( int a , int b ) {
        return a < b;
    }

    public static void main(String[] args) {
        int[] a = {24, 3, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        mergeSort(a);
        for( int i : a )
            System.out.print(i + "\t");
    }


}
