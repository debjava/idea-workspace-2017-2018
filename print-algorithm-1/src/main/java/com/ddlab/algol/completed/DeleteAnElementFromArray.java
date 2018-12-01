package com.ddlab.algol.completed;

/**
 * Created by PIKU on 9/17/2015.
 */
public class DeleteAnElementFromArray {

    public static int[] delete(int[] a, int val) {

        int[] newArray = null;
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            try {
                if (a[i] == val) {
                    //Item to delete
                } else {
                    a[j] = a[i];
                    j++;
                }
            } catch (IndexOutOfBoundsException ibe) {
                break;
            }

        }
        int newSize = j;
        newArray = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            newArray[i] = a[i];
        }
        return newArray;

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 5, 6, 7};
        System.out.println("Initial Size of Array :::" + a.length);
        a = delete(a, 5); //It will delete all occurance of that number
        System.out.println("Modified Size of Array :::" + a.length);
        for (int i : a)
            System.out.print(i + "\t");
    }
}
