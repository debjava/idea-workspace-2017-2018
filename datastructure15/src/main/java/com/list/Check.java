package com.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Created by PIKU on 9/7/2015.
 */
public class Check {

    public static void main(String[] args) {

        String s = "aabbcccddaaa";
        ArrayList al = new ArrayList();
        Map<String,Integer> map = new HashMap<String,Integer>();

        for( int i = 0 ; i < s.length() ; i++ ) {

            String current = String.valueOf( s.charAt(i));
            if( map.containsKey(current)) {
                int counter = map.get(current);
                map.put(current, counter++);
            }
            else if(map.size() == 0 ) {
                map.put(current, 1);
            }

            if( map.size() > 1)
                map.clear();

        }
    }
}
