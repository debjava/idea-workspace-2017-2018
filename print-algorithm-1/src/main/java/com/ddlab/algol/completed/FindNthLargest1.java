package com.ddlab.algol.completed;

/**
 * Created by PIKU on 9/17/2015.
 */
public class FindNthLargest1 {

    public static void quickSort(int[] a, int k) {

        quickSort(a.length - k + 1, a, 0, a.length - 1);
    }

    public static void quickSort(int k, int[] a, int low, int high) {

        int i = low;
        int j = high;
        int pivot = a[low + (high - low) / 2];

        while (i <= j) {

            while (a[i] < pivot)
                i++;

            while (a[j] > pivot)
                j--;

            if (i <= j) {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        if (k == i+1) {
//            return pivot;
            System.out.println("Pivot :::" + pivot);
        }
//        else if (k < i + 1) {
//            quickSort(k, a, low, i-1);
//
//        }
        if( i < high ) {
            quickSort(k, a, i, high);
        }
        if( j > low ) {
            quickSort(k, a, low, j);
        }
        else {
//            return quickSort(k, a, i + 1, high);
            quickSort(k, a, i + 1, high);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

//    public static void main(String[] args) {
//        int[] a = {1,4,45,6,7,90,3,4,2, 11, 6};
//        quickSort(a);
//        for( int b : a )
//            System.out.print(b+"\t");
//    }

    public static void main(String[] args) {
        int arr[] = {1, 23, 47, 81, 92, 88};
        quickSort(arr, 2);
    }
}
