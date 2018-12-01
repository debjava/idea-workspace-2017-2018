package com.ddlab.algol.completed;

public class NodeBasedStack {

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

    public void push(Object x) { //enqueue()

        if( front == null )
            back = front = new Node(x);
        else
            back = back.next = new Node(x);
    }

    public Object pop() {

        if( front == null ) throw new NullPointerException("No element found");

        Object returnValue = back.element;
        if( front.equals(back))
            front = back = null;
        else {
            Node current = front;
            while( current.next != back )
                current = current.next;
            back = current;
            current.next = null;
        }
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

        NodeBasedStack stack = new NodeBasedStack();
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

        stack.print();
    }
}
