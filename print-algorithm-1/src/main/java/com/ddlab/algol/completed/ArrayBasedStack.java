package com.ddlab.algol.completed;

import java.util.Arrays;

//LIFO
public class ArrayBasedStack<E> {

    private int defaultCapacity = 10;
    private int size;
    private Object[] elements;

    public ArrayBasedStack() {
        elements = new Object[defaultCapacity] ;
    }

    private void ensureCapacity() {
        elements = Arrays.copyOf( elements, size*2 );
    }

    public void push( E e ) {
        if( size == elements.length)
            ensureCapacity();
        elements[size++] = e;
    }

    public int getSize() {
        return size;
    }

    public E pop() {
        E e = (E) elements[ --size ];
        elements[size] = null;
        return e;
    }

    public E getElement( int index ) {
        return (E) elements[index];
    }

    public static void main(String[] args) {

        ArrayBasedStack stack = new ArrayBasedStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        for (int i = 5; i < 25; i++) {
            String val = String.valueOf(i);
            stack.push(val);
        }

        for (int i = 0; i < stack.getSize(); i++) {
            System.out.println("Element --->"+stack.getElement(i));
        }
    }
}
