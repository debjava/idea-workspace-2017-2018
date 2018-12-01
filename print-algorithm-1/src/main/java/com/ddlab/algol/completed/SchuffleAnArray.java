package com.ddlab.algol.completed;

import java.util.Random;

public class SchuffleAnArray {

    public static void schuffleAnArray(int[] a) {

        Random random = new Random();
        for (int i = 0; i < a.length; i++) {

            int randomPosition = random.nextInt(a.length);

            int temp = a[i];
            a[i] = a[randomPosition];
            a[randomPosition] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        schuffleAnArray(a);
        for (int i : a ) {
            System.out.print(i+"\t");
        }
    }
}
