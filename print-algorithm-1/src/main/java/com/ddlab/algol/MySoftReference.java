package com.ddlab.algol;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class Z {

    private String s = "A long String to demonstrate";

    public String getS() {
        return s;
    }
}
public class MySoftReference {

    public static void main(String[] args) {

        Z z = new Z();

//        SoftReference<Z> softRef = new SoftReference<Z>(z);
        ReferenceQueue<Z> rq = new ReferenceQueue<Z>();
        PhantomReference<Z> softRef = new PhantomReference<Z>(z,rq);

//        z = null;

        System.out.println("Z---->"+z);

        System.out.println("Soft reference value :::"+softRef.get().getS());



        Map<String,String> map = new HashMap(System.getenv());

        int counter = 0;
//        while( true ) {
//
//            counter++;
//            System.out.println("Soft reference value inside while :::"+softRef.get().getS());
//            map.put( String.valueOf(counter), String.valueOf(counter));
//        }

    }
}
