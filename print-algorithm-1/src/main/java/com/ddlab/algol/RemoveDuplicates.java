package com.ddlab.algol;

public class RemoveDuplicates {

    public static int[] removeAllDuplicates( int[] a ) {

        int j = 0;
        for (int i = 0; i < a.length; i++) {
            try {
                if( (a[i] ^ a[i+1]) == 0 ) {
                    //Found duplicate
                }
                else {
                    j++;
                    a[j] = a[i+1];
                }
            }
            catch (IndexOutOfBoundsException ibe) {
                break;
            }

        }
        int newSize = (j+1);
        int[] b = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            b[i] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,56,57,78,78};
        for( int i : a )
            System.out.print(i+"  ");
        System.out.println();
        int[] b = removeAllDuplicates(a);
        for( int i : b )
            System.out.print(i + "  ");
    }
}
