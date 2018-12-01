package com.ddlab.algol.completed;

/**
 * Created by PIKU on 9/20/2015.
 */
public class BruteForceAlgorithm {

    public static int search( String txt , String pat ) {

        int M = pat.length();
        int N = txt.length();

        for (int i = 0; i <= N - M ; i++) {
            int j;
            for (j = 0; j < M; j++) {
                if( txt.charAt(i+j) != pat.charAt(j))
                    break;
            }
            if( j == M) return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int result = search("Hello world" ,"o wo");
        System.out.println(result);
    }
}
