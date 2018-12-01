package com.ddlab.rnd.java.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> , Comparator<Employee> {
    private int age;
    private int sal;

    public Employee() {}

    public Employee(int age , int sal) {
        this.age = age;
        this.sal = sal;
    }

    public int getAge() {
        return age;
    }

    public int getSal() {
        return sal;
    }

    @Override
    public int compareTo(Employee emp) {
        System.out.println("Comparable called ...");
        //Ascending order
        if(age == emp.age)
            return 0;
        else if(age > emp.age)
            return 1;
        else
            return -1;

        //Descending order
//        else if(age > emp.age)
//            return -1;
//        else
//            return 1;
    }

    @Override
    public int compare(Employee e1, Employee e2) {
        System.out.println("Comparator called ...");
        //Ascending order
//        return e1.getAge() - e2.getAge();

        //Descending order
        return e2.getAge() - e1.getAge();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", sal=" + sal +
                '}';
    }
}
public class ComparableComparator {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add( new Employee(23,5000));
        empList.add( new Employee(24,6000));
        empList.add( new Employee(25,7000));
        System.out.println(empList);

        Collections.sort(empList , new Employee());
        System.out.println(empList);

    }
}
