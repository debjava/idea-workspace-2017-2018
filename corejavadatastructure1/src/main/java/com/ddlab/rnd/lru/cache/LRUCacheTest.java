package com.ddlab.rnd.lru.cache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LRUCacheTest {

    private LRUCache c;

    public LRUCacheTest() {
        this.c = new LRUCache(2);
    }

    @Test
    public void testCacheStartsEmpty() {
        assertEquals(c.get(1), -1);
    }

    @Test
    public void testSetBelowCapacity() {
        c.set(1, 1);
        System.out.println("First added ....");
        assertEquals(c.get(1), 1);
//        assertEquals(c.get(2), -1);
        c.set(2, 4);
        System.out.println("Second added ....");
        assertEquals(c.get(1), 1);
        assertEquals(c.get(2), 4);
    }

    @Test
    public void testCapacityReachedOldestRemoved() {
        c.set(1, 1);
        c.set(2, 4);
        c.set(3, 9);
//        assertEquals(c.get(1), -1);
        assertEquals(c.get(2), 4);
        assertEquals(c.get(3), 9);
    }

    @Test
    public void testGetRenewsEntry() {
        c.set(1, 1);
        c.set(2, 4);
        assertEquals(c.get(1), 1);
        c.set(3, 9);
        assertEquals(c.get(1), 1);
//        assertEquals(c.get(2), -1);
        assertEquals(c.get(3), 9);
    }
}