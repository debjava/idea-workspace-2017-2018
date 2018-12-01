package com.ddlab.rnd.comparator;

import java.util.Map;
import java.util.TreeMap;

public class TestMap1 {

    public static void main(String[] args) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < 10; i++) {
            treeMap.put(i,i);
        }
        Map.Entry<Integer,Integer> entry = treeMap.floorEntry(11);
        System.out.println(entry.getKey()+"---"+entry.getValue());

    }
}
