package com.ddlab.algol.completed;

//Sorting in Ascending order
public class QuickSortAscending {

    public static void quickSort(int[] a) {

        quickSort(a, 0 , a.length - 1 );
    }

    public static void quickSort(int[] a , int low , int high ) {

        int i = low;
        int j = high;
        int pivot = a[low+ (high - low )/2 ];

        while( i <= j ) {

            while( a[i] < pivot ) i++;

            while( a[j] > pivot ) j--;

            if( i <= j ) {
                swap(a , i , j);
                i++;
                j--;
            }
        }
        if( i < high ) {
            quickSort( a, i , high );
        }
        if( j > low )
            quickSort( a,low,j );
    }

    public static void swap(int[] a, int i , int j ) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {24, 3, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        quickSort(a);
        for( int i : a )
            System.out.print(i + "\t");
    }
}
