package com.ddlab.temp.test;

import java.io.Serializable;

/**
 * Created by PIKU on 9/21/2015.
 */
public class Employee extends Organisation implements Serializable {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
