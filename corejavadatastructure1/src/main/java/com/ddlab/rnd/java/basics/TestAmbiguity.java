package com.ddlab.rnd.java.basics;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class TestAmbiguity {

    public static void m1(List list) {
        System.out.println("List Interface Verion");
    }

    public static void m1(AbstractList absList) {
        System.out.println("AbstractList Version");
    }

    public static void m1(ArrayList al) {
        System.out.println("ArrayList Version");
    }

    public static void main(String[] args) {
        m1(null);
    }
}
