package com.ddlab.rnd.lru.cache;

import java.util.LinkedHashMap;
import java.util.Iterator;

public class LRUCache {

    private int capacity;
    private LinkedHashMap<Integer,Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>();
    }

    public int get(int key) {
        Integer value = map.get(key);
//        if (value == null) {
//            value = -1;
//        } else {
//            set(key, value);
//        }
        set(key, value);
        return value;
    }

    public void set(int key, int value) {
        if (map.containsKey(key)) {
            map.remove(key);
        } else if (map.size() == capacity) {
            Iterator<Integer> it = map.keySet().iterator();
            it.next();
            it.remove();
        }
        map.put(key, value);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}