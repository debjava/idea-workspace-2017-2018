package com.ddlab.algol.completed;

public class InsertionSort {

    private static void insertionSort(int x[], int off, int len) {
// Insertion sort on smallest arrays
        for (int i = off; i < len + off; i++)
            for (int j = i; j > off && x[j - 1] > x[j]; j--)
                swap(x, j, j - 1);
    }

    private static void insertionSort1(int a[]) //Insertion sort on small arrays
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0 && a[j] < a[j - 1]; j--)
                swap(a, j, j - 1);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {-1, 67, 8, -1, 1, 3, 4, 10, 05, 07, 9};
// int[] a = { 67, 89, -1, 2, 3, 99, 23, 05, 07, 9,1};
        for (int k : a)
            System.out.print(k + " ");
        System.out.println("\n");
// insertionSort(a, 0, a.length);
        insertionSort1(a);
        for (int k : a)
            System.out.print(k + " ");
    }

}
