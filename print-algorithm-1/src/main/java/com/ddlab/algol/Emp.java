package com.ddlab.algol;

import java.io.Serializable;

/**
 * Created by PIKU on 9/24/2015.
 */
public class Emp implements Serializable {

    private String name;

    public Emp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
