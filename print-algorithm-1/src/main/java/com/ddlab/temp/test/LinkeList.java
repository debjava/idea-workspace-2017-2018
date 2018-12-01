package com.ddlab.temp.test;

public class LinkeList {

    private Node front;
    private Node back;

    private static class Node {
        private Node next;
        private Object element;

        public Node(Object x) {
            this.element = x;
            next = null;
        }
    }

    public void add(Object x) {
        if( front == null )
            back = front = new Node(x);
        else
            back = back.next = new Node(x);
    }

    public void print() {
        printRecursive(front);
    }

    public void printRecursive(Node p) {
        if( p != null ) {
            System.out.print(p.element + "\t");
            printRecursive(p.next);

        }
    }

    public void deleteByIndex(int index) {

        int counter = 0;
        for (Node p = front ; p != null ; p = p.next ) {
            if( counter == index ) {
                //Delete
                delete(p);
                break;
            }
            counter++;
        }
    }

    public void delete( Node p) {

        if( front == back )
            back = front = null;
        else {
            for( Node k = front , q = front ; k != null ; q = k , k = k.next ) {
                if( k.equals(p)) {
                    q.next = k.next;
//                    break;
                }

            }
        }
    }

    public static void main(String[] args) {

        LinkeList ll = new LinkeList();

        for (int i = 0; i < 10; i++) {

            ll.add(new Integer(i));

        }
        ll.print();

        ll.deleteByIndex(10);
        System.out.println("\n\n");
        ll.print();
    }

}
