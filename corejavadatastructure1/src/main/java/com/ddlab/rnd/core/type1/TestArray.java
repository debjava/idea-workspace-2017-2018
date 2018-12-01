package com.ddlab.rnd.core.type1;

public class TestArray {

    public static int[] insertAt(int pos, int[] src, int val) {
        int[] result = new int[src.length + 1];
        System.arraycopy(src, 0, result, 0, pos);
        result[pos] = val;
        System.arraycopy(src, pos, result, pos + 1, src.length - pos);
        return result;
    }

    public static int[] deleteAt(int pos, int[] src) {
        int[] result = new int[src.length - 1];
        System.arraycopy(src, 0, result, 0, pos);
        System.arraycopy(src, pos + 1, result, pos, result.length - pos);
        return result;
    }

    public static int[] removeDuplicates(int[] a) {

        for (int i = 0; i < a.length; i++) {
            try {
                if ((a[i] ^ a[i + 1]) == 0) {
                    //Duplicate found
                    a = deleteAt(i, a);
                    break;
                }
            } catch (RuntimeException re) {

            }
        }
        return a;
    }

    public static int[] removeDuplicates1(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] ^ a[i + 1]) == 0) {
                //Duplicate found
                a = deleteAt(i, a);
                break;
            }
        }
        return a;
    }

    public static int[] deleteAnElement(int[] a, int val) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == val) {
                a = deleteAt(i,a);
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
//        int[] a = {1,2,3,5};
//        a = insertAt(3,a,4);//Ok
//        int[] a = {2,3,5};
//        a = insertAt(0,a,1);//Ok
//        int[] a = {1,2,3,5};
//        a = insertAt(4,a,6);//Ok
//        int[] a = {1,2,3,4,5};
//        a = deleteAt(0,a);//Ok
//        a = deleteAt(4,a);//Ok
//        a = deleteAt(2,a);//Ok

        int[] a = {1, 2, 3, 4, 5, 6};
//        a = removeDuplicates1(a);
        a = deleteAnElement(a,4);
        for (int i : a) {
            System.out.print(i + "\t");
        }
    }
}
