package com.ddlab.algol;

import java.util.LinkedList;

/**
 * Created by PIKU on 9/23/2015.
 */
public class MyLinkedList {

    private Node front;

    private Node back;

    private static class Node {

        private Object element;

        private Node next;

        public Node( Object x ) {
            element = x;
            next = null;
        }
    }

    public void add( Object x ) {

        if( front == null )
            back = front = new Node(x);
        else
            back = back.next = new Node(x);
    }

    public void print() {

        for( Node p = front ; p != null ; p = p.next ) {
            System.out.print(p.element+"\t");
        }
        System.out.println("\n");
    }

    public void deleteLast() {
        if( front == back )
            front = back = null;
//            back = front = null;
        else {
            Node p = front;
            System.out.println("Back element :::"+back.element);
            System.out.println("Now front Val :::"+p.element);
            for( ; p.next != back ; p = p.next ) {
                //do nothing
                System.out.println("Next Element :::"+p.element);
            }
            System.out.println("~~~~~~~~~~~Next Element :::"+p.element);
            back = p;
            System.out.println("NOW back ::::"+back.element);
            p.next = null;
        }
    }

    public void addFirst(Object x ) {
        Node f = front;
        front = new Node(x);
        front.next = f;
    }

    public static void main(String[] args) {

        MyLinkedList ll = new MyLinkedList();

        for (int i = 0; i < 10; i++) {

            ll.add( new Integer(i));

        }

        ll.print();
//        ll.deleteLast();
//        System.out.println("=============Deleted last===================");
//        System.out.println("================================");
        ll.addFirst(new Integer(11));
//        ll.addFirst(new Integer(14));
//        ll.addFirst(new Integer(13));
//        ll.addFirst(new Integer(131));
        System.out.println("================================");
        ll.print();

    }
}
