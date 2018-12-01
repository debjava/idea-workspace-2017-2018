package com.ddlab.algol.completed;

import java.util.Arrays;

/**
 * Created by PIKU on 9/15/2015.
 */
public class MyArrayList {

    private int size;
    private int defaultCapacity = 10;
    private Object[] elements;

    private int capacity = 0;

    public MyArrayList() {
        elements = new Object[defaultCapacity];
    }

    public void add(Object x) {
        if (elements.length == size)
            ensureCapacity();

        elements[size++] = x;

//        System.out.println("Value------->"+elements[--size]);
    }

    public Object get(int index) {
        return elements[index];
    }

    public void ensureCapacity() {
//        elements = new Object[elements.length*2];
        elements = Arrays.copyOf(elements, (elements.length * 2));
        capacity = elements.length;
    }

//    public void delete(Object x) {
//
//        for (int i = 0; i < elements.length; i++) {
//
//            if( elements[i].equals(x)) {
//                elements[i] = null;
//                size--;
//                condenseArray(i);
//                break;
//            }
//        }
//    }
//
//    public void condenseArray(int start) {
//        for (int i = start; i < size; i++) {
//            elements[i] = elements[i+1];
//        }
//    }

    public void delete(Object x) {

        for (int i = 0; i < elements.length; i++) {

            if (elements[i].equals(x)) {
                elements[i] = null;
                size--;
                elements = Arrays.copyOf(elements, size);
                capacity = elements.length;
                break;
            }
        }
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void trimArray() {
        elements = Arrays.copyOf(elements, size);
        capacity = elements.length;
    }

    public static void main(String[] args) {

        MyArrayList al = new MyArrayList();

        for (int i = 0; i < 15; i++) {
            al.add(new Integer(i));
        }
//        System.out.println("Now Size :::"+al.getSize());
//        System.out.println("Now Capacity :::"+al.getCapacity());
//        for (int j = 0; j < al.getSize(); j++) {
//            System.out.println("======"+al.get(j));
//        }

        al.delete(new Integer(11));
//        al.trimArray();

        System.out.println("Now Size :::" + al.getSize());
        System.out.println("Now Capacity :::" + al.getCapacity());
        for (int j = 0; j < al.getSize(); j++) {
            System.out.println("======" + al.get(j));
        }


    }
}
