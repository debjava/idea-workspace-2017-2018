package com.ddlab.algol.completed;

//Final Integer Array Permutation
// http://introcs.cs.princeton.edu/java/23recursion/Permutations.java.html
public class IntegerArrayPermutation {

    public static void print(int[] arr) {
        for( int p : arr)
            System.out.print(p + " ");
        System.out.println("\n");
    }

    private static void swap(int[] a, int i, int j) {
        int c = a[i];
        a[i] = a[j];
        a[j] = c;
    }

    public static void perm(int[] arr) {
        int N = arr.length;
        perm(arr, N);
    }

    private static void perm(int[] a, int n) {
        if (n == 1) {
            print(a);
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            perm(a, n-1);
            swap(a, i, n-1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        perm(a);

    }

}
