package com.ddlab.algol.completed;

public class Merge2SortedArraysWO3rdArray {
 
    public void mergeArrays(int[] a, int[] b) {
        // pointer to end of the first sorted array
        int i=a.length-1;
        // pointer to end of the second sorted array (pointer at 100 in below array b)
        int j=b.length-a.length-1;
        // pointer to end of the second sorted array (pointer at last 0)
        int k=b.length-1;
 
        /**
         * whichever is higher in two arrays, place that
         * element in last position of the bigger array
         */
        while ( i>=0 && j>=0 ) {
            if( a[i] > b[j] ) {
                b[k--] = a[i--];
            } else {
                b[k--] = b[j--];
            }
        }
 
////         run through the left over elements of array a
//        while(i>=0) {
//            b[k--] = a[i--];
//        }
//
//        // run through the left over elements of array b
//        while(j>0) {
//            b[k--] = b[j--];
//        }
    }
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        Merge2SortedArraysWO3rdArray mergeArrays = new Merge2SortedArraysWO3rdArray();
        int[] aArr = {3,7,12,16};
        int[] bArr = {1,4,9,100,0,0,0,0};

//        int[] bArr = {0,0,0,0,1,4,9,100};
 
        mergeArrays.mergeArrays(aArr, bArr);
 
        for(int i: bArr) {
            System.out.println(i);
        }
    }
}