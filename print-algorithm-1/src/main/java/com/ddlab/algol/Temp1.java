package com.ddlab.algol;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;

public class Temp1 {

    private static class Emp {

        private String name;

        public Emp(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) throws Exception {

        List<Emp> list = new ArrayList<Emp>();

        for (int i = 0; i < 10; i++) {
            Emp emp = new Emp("Name-"+i);
            list.add(emp);
        }

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(list);

        byte[] buffer = bos.toByteArray();


    }
}
