package com.ddlab.algol.completed;

public class MergeTwoArraysOneSmallOneBig {

    public static void mergeArrays(int[] a, int[] b) {
        // pointer to end of the first sorted array
        int i = a.length - 1;
        // pointer to end of the second sorted array (pointer at 100 in below array b)
        int j = b.length - a.length - 1;
        // pointer to end of the second sorted array (pointer at last 0)
        int k = b.length - 1;

        /**
         * whichever is higher in two arrays, place that
         * element in last position of the bigger array
         */
        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                b[k--] = a[i--];
            } else {
                b[k--] = b[j--];
            }
        }
    }




    public static void main(String[] args) {
        int[] aArr = {3, 7, 12, 16};
        int[] bArr = {1, 4, 9, 100, 0, 0, 0, 0};

        mergeArrays(aArr, bArr);

        for (int i : bArr) {
            System.out.println(i);
        }
    }

}
