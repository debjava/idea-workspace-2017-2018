package com.ddlab.algol;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator implements Iterable {

    private Object[] elements;
    private int size;
    private int counter = 0;

    public ArrayIterator() {

        elements = new Object[20];
    }

    public void add( Object x ) {
        elements[size++] = x;
    }

    @Override
    public Iterator iterator() {
        //reset the counter
        //If you do not reset the counter, you will not be iterate once again
        counter = 0;
        return new MyIterator();
    }

    private class MyIterator implements Iterator {
        @Override
        public boolean hasNext() {
            return counter < elements.length && elements[counter] != null ;
        }

        @Override
        public Object next() {
            return elements[counter++] ;
        }

        @Override
        public void remove() {
            System.out.println("Don't want to delete item");
        }
    }

    public static void main(String[] args) {

        ArrayIterator arr = new ArrayIterator();
        for( int i = 0 ; i < 10 ; i++ ) {
            arr.add( new Integer(i));
        }

        Iterator itr = arr.iterator();
        while( itr.hasNext() ) {

            System.out.print("\t"+itr.next()); //0	1	2	3	4	5	6	7	8	9
        }
        System.out.println("\n\n");
        itr = arr.iterator();
        while( itr.hasNext() ) {
            System.out.print("\t" + itr.next()); //0	1	2	3	4	5	6	7	8	9
        }

        //In case of arraylist also, everytime, you get an iterator,
        //the index is et to 0 so that it can be iterated.
        ArrayList al = new ArrayList();
        for( int i = 0 ; i < 10 ; i++ ) {
            al.add( new Integer(i));
        }
        System.out.println("\n\n");
        itr = arr.iterator();
        while( itr.hasNext() ) {

            System.out.print("\t"+itr.next());
        }

        System.out.println("\n\n");
        itr = arr.iterator();
        while( itr.hasNext() ) {

            System.out.print("\t"+itr.next());
        }

    }
    //public interface Collection<E> extends Iterable<E>
    //public interface List<E> extends Collection<E>
}
