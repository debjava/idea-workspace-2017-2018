package com.ddlab.algol.completed;

public class FindMissingAndDuplicate {

    public static void findMissingAndDuplicate(int[] a) {
        int n = a.length;
        int idealSum = ( ( n*( n+1 ) )/2 );
        int actualSum = 0;
        int duplicate = 0;
        for (int i = 0; i < n; i++) {
            actualSum = actualSum+a[i];
            try {
                if( (a[i] ^ a[i+1]) == 0 )
                    duplicate = a[i];
            }
            catch (IndexOutOfBoundsException ibe) {
                break;
            }
        }

        int missing = idealSum - actualSum+duplicate;
        System.out.println("Duplicate :::"+duplicate+"----"+"Missing :::"+missing);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,5,5,6,7,8,9,10};
        findMissingAndDuplicate(a);
    }
}
