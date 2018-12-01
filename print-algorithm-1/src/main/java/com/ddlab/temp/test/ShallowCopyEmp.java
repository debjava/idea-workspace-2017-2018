package com.ddlab.temp.test;

import java.io.Serializable;

public class ShallowCopyEmp implements Cloneable, Serializable {

    private String name;
    private Address adrs ;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdrs() {
        return adrs;
    }

    public void setAdrs(Address adrs) {
        this.adrs = adrs;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
