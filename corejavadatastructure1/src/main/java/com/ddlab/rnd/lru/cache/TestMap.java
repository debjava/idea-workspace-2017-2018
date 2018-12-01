package com.ddlab.rnd.lru.cache;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by PIKU on 5/23/2017.
 */
public class TestMap {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        for( int i = 0 ; i < 5 ; i++ )
            map.put(i,i);
        System.out.println(map);//{0=0, 1=1, 2=2, 3=3, 4=4}

        Iterator<Integer> it = map.keySet().iterator();
        it.next();
        System.out.println(map);//{0=0, 1=1, 2=2, 3=3, 4=4}
        it.remove();//Removes only first element
        System.out.println(map);//{1=1, 2=2, 3=3, 4=4}
    }
}
