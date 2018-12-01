package com.ddlab.rnd.type5;

public class ArrayRotation {

    public static void reverse(int[] a , int start , int end ) {
        for( int i = start , j = end ; i < j ; i++,j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static void rotateRight( int[] a , int d ) {
        int n = a.length;
        reverse(a, 0 , n-1);
        reverse(a , 0, d - 1);
        reverse(a, d, n-1);
    }

    public static void rotateLeft( int[] a , int d ) {
        int n = a.length;
        reverse(a , 0, d - 1);
        reverse(a, d, n-1);
        reverse(a, 0 , n-1);
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9};

        //rotateRight(a,3);
        rotateLeft(a,30);

        for( int i : a )
            System.out.print(i + "\t");
    }
}
