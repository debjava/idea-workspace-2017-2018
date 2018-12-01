package com.ddlab.temp.test;

import java.io.*;

/**
 * Created by PIKU on 9/21/2015.
 */
public class Test {

    public static void main(String[] args) throws Exception {

        Organisation org = new Organisation();
        Object[] emps = new Object[100] ;

        for( int i = 0 ; i < emps.length ; i++ ) {

            emps[i] = new Employee("Name->"+i);
        }

        org.setEmps(emps);

//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        OutputStream bos = new FileOutputStream("a.ser");
        ObjectOutputStream out = new ObjectOutputStream(bos);

        out.writeObject(org);

//        byte[] buff = bos.toByteArray();

//        System.out.println("Buffer Size :::"+buff.length);

        Object obj = new Object();
        System.out.println( obj instanceof Serializable );
    }
}
