package com.ddlab.temp.test;

import java.io.Serializable;

/**
 * Created by PIKU on 9/21/2015.
 */
public class Organisation implements Serializable {

    private Object[] emps;

    public Object[] getEmps() {
        return emps;
    }

    public void setEmps(Object[] emps) {
        this.emps = emps;
    }

    private void writeObject(java.io.ObjectOutputStream s)
            throws java.io.IOException {

        s.defaultWriteObject();
        for (int i = 0; i < emps.length; i++) {
            Employee emp = (Employee) emps[i];
            s.writeObject(emp);
        }
    }

    private void readObject(java.io.ObjectInputStream s)
            throws java.io.IOException, ClassNotFoundException {
        s.defaultReadObject();
        for (int i = 0; i < emps.length; i++) {
            emps[i] = (Employee) s.readObject();
        }
    }
}
