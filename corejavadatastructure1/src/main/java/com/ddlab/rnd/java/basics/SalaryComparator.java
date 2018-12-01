package com.ddlab.rnd.java.basics;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        //Ascending order
//        return e1.getAge() - e2.getAge();

        //Descending order
        return e2.getAge() - e1.getAge();
    }
}
