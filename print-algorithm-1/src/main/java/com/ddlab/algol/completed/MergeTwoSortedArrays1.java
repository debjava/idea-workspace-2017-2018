package com.ddlab.algol.completed;

public class MergeTwoSortedArrays1 {

    public static void mergeTwoArrays(int[] a1, int[] a2, int[] a) {

        int j = 0;
        int k = 0;

        for (int i = 0; i < a.length; i++) {

            if (j == a1.length)
                a[i] = a2[k++];
            else if (k == a2.length)
                a[i] = a1[j++];
            else if (isLess(a1[j], a2[k]))
                a[i] = a1[j++];
            else
                a[i] = a2[k++];
        }

    }

    public static boolean isLess(int a, int b) {
        return a < b;
    }

    //Super technique
    public static void merge(int[] a, int[] b, int[] c) {

        int i = a.length - 1, j = b.length - 1, k = c.length;

        while (k > 0)
            c[--k] = (j < 0 || (i >= 0 && a[i] >= b[j])) ? a[i--] : b[j--];
    }

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4, 5, 5};
        int[] a2 = {7, 8, 9, 10, 14, 17};
        int[] a3 = new int[a1.length + a2.length];

//        mergeTwoArrays(a1, a2, a3);
//        merge(a1, a2, a3);
//        for (int i : a3)
//            System.out.print(i + "\t");

        merge(a1, a2, a3);
        for (int i : a3)
            System.out.print(i + "\t");



    }
}
