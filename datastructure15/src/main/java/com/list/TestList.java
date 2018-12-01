package com.list;

import java.util.*;

/**
 * Created by PIKU on 9/6/2015.
 */
public class TestList {

    public static void main(String[] args) {

        String s = "aabbcccddaaa";

        String previous = "";
        String current = "";
        int counter = 1;
        int max = 0;
        Map<String,Integer> map = new IdentityHashMap<String,Integer>();

        for( int i = 0 ; i < s.length() ; i++ ) {
            current = String.valueOf( s.charAt(i));
            if( current.equals(previous) ) {
                ++counter;
            }
            else {

                previous = current;

                counter = 1;
            }
            map.put(previous,counter);
        }

        System.out.println(map);

    }

}
