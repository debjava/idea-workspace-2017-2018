package com.ddlab.algol;

/**
 * Created by PIKU on 10/12/2015.
 */
public class Temp4 {

    public static void main(String[] args) throws Exception {

//        int a = -1;
//        int result = a >>> 32 ;
//
////        result = a ^ a;
//        System.out.println( result );

//        long l = 12L;
//        long result = l >>> 32;
//        System.out.println(result);

        for (long i = 0L; i < 9_223_372_036_854_775_807L; i++) {
            long result = i >>> 32;
            if( i > 32768 && result != 0 ) {
                System.out.println("Not equal...."+i);
                System.exit(0);
            }

//            if( i > 32768 )
//                Thread.sleep(10);
        }
        System.out.println("Completed........");
    }
}
