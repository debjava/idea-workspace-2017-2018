package com.ddlab.rnd.lru.cache;

public class TestLRUCache1 {

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        lru.set(1, 1);
        System.out.println(lru);//{1=1}
        System.out.println("Get the value for 1--->" + lru.get(1));//Get the value for 1--->1
        lru.set(2, 2);
        System.out.println(lru);//{1=1, 2=2}
        System.out.println("Get the value for 2--->" + lru.get(2));//Get the value for 2--->2
        System.out.println(lru);//{1=1, 2=2}
//Capacity Reached Oldest Removed
        lru.set(3, 3);
        lru.set(4, 4);
        lru.set(5, 5);
        System.out.println(lru);//{4=4, 5=5}
    }
}
