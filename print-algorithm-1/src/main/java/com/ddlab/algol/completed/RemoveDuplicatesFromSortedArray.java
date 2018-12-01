package com.ddlab.algol.completed;

import java.util.Arrays;
//Done
public class RemoveDuplicatesFromSortedArray {

    public static void removeDuplicatesFromSortedArray(int[] a) {

        int j = 0;
        for (int i = 0; i < a.length; i++) {

            if(a[i] != a[j]) {
                j++;
                a[j] = a[i];
            }
        }
        int newArraySize = (j+1);
        a = Arrays.copyOf(a,newArraySize);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }

    public static void main(String[] args) {
        int[] a = {6,7,8,9,9,10,11,11,11,12,13,13,14,14,14,14,15};
        removeDuplicatesFromSortedArray(a);
    }

}
