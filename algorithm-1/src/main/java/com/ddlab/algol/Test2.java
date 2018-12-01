package com.ddlab.algol;

/**
 * Created by PIKU on 9/15/2015.
 */
public class Test2 {

   public static int getHash( int h) {

       h ^= (h >>>20) ^ (h >>>12);
       return h ^ (h >>> 7) ^ (h >>>4);
   }

//    public static int getCapacity( int capacity) {
//        int threshold = (int) (capacity * 0.75);
//
//    }

    public static void main(String[] args) {

        int hashCode = 50;
        int hashVal = getHash(hashCode);
        System.out.println("hashVal = " + hashVal);

        int capacity = 128;
        int length = capacity - 1;
        int result = hashVal & length;

//        for (int i = 11; i < 21; i++) {
//
//            hashCode = i;
//            hashVal = getHash(hashCode);
//            System.out.println("HashValue---->"+hashVal);
//            result = hashVal & length;
//            System.out.println("result = " + result);
//        }

    }
}
