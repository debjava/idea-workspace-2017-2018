package com.ddlab.algol.completed;

import java.util.Arrays;

public class BoyerMooreAlgorithm {

    public static int search(String text, String pat) {
        int val = -1;
        int[] dummy = new int[256];
        Arrays.fill(dummy, -1);
        for (int j = 0; j < pat.length(); j++) {
            dummy[pat.charAt(j)] = j;
        }

        int m = text.length();
        int n = pat.length();

        int skip;

        for (int i = 0; i <= m - n; i += skip) {
            skip = 0;
            for (int j = n - 1; j >= 0; j--) {

                if (pat.charAt(j) != text.charAt(i + j)) {
                    skip = Math.max(1, j - dummy[text.charAt(i + j)]);
                    break;
                }
            }
            if (skip == 0) return i;
        }
        return val;
    }

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet";
        String pattern = "ipsum";
        BoyerMooreAlgorithm bm = new BoyerMooreAlgorithm();
        int firstPosition = bm.search(text,pattern);
        System.out.println("Position :::" + firstPosition);
    }
}
