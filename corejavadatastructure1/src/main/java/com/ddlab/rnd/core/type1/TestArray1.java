package com.ddlab.rnd.core.type1;

public class TestArray1 {

    public static int[] addToArray(int[] a ) {
        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);
        b[a.length] = 100;
        a = b;

        return a;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        a = addToArray(a);
        for (int i : a) {
            System.out.print(i + "\t");
        }
    }
}
