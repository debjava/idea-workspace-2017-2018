package com.ddlab.algol.completed;

/**
 * Created by PIKU on 9/20/2015.
 */
public class NodeBasedQueue {

    private Node front;
    private Node back;

    private static class Node {
        public Object element;
        public Node next;

        public Node(Object element) {
            this.element = element;
            next = null;
        }
    }

    public void offer(Object x) { //enqueue()

        if( front == null )
            back = front = new Node(x);
        else
            back = back.next = new Node(x);
    }

    public Object poll() {

        if( front == null ) throw new NullPointerException("No element found");

        Object returnValue = front.element;
        front = front.next;
        return returnValue;
    }

    public Object getFront() {
        if( front == null ) throw new NullPointerException("No element found");

        return front.element;
    }

    public void makeQueueEmpty() {
        front = null;
        back = null;
    }

    public void print() {
        for( Node p = front ; p != null ; p = p.next)
            System.out.println("Element --->"+p.element);
    }

    public static void main(String[] args) {

        NodeBasedQueue queue = new NodeBasedQueue();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");

        System.out.println(queue.poll());
        System.out.println(queue.poll());

        queue.print();
    }

}
