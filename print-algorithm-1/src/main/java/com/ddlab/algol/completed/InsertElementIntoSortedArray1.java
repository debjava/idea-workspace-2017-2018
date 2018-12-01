package com.ddlab.algol.completed;

import java.util.Arrays;

public class InsertElementIntoSortedArray1 {

    public static void insertElement(int[] a, int value) {
        //find insert point
        int i = 0;
        //In case of descending order while(i < a.length && a[i] > value)
        while (i < a.length && a[i] < value) {
            i++;
        }
        System.out.println("Value of I-->" + i);
        if (i < a.length) {
            //you found a place to insert the score
            for (int j = a.length - 1; j > i; j--) {
                a[j] = a[j - 1];
            }
            a[i] = value;
        }
    }

    public static int[] insert(int[] a, int value) {
        int index = Arrays.binarySearch(a, value);
        System.out.println("Index ::: " + index);
        int newIndex = 0;
        if (index < 0)
            newIndex = -(index) - 1;
        else
            newIndex = index + 1;
        a = insertElement(a, value, newIndex);
        return a;
    }

    public static int[] insertElement(int[] a, int value, int index) {
        int length = a.length;
        int[] destn = new int[length + 1];
        System.arraycopy(a, 0, destn, 0, index);
        destn[index] = value;
        System.arraycopy(a, index, destn, index + 1, length - index);
        return destn;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 6, 7};
        int[] b = Arrays.copyOf(a, a.length + 1);

//        int index = Arrays.binarySearch(a, 5);
//        System.out.println("Index ::: " + index);

        a = insert(a, 5);
//        insertElement(b,5);

        for (int i : a)
            System.out.print(i + "\t");
    }
}
