package com.ddlab.rnd.lru.cache;

public class CircularLinkedList {

    public int size = 0;
    public Node front = null;
    public Node back = null;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    //add a new node at the start of the linked list
    public void addNodeAtStart(int data) {
        System.out.println("Adding node " + data + " at start");
        Node node = new Node(data);
        if (size == 0) {
            front = back = node;
            node.next = front;
        } else {
            Node temp = front;
            front = node;
            node.next = temp;
            back.next = front;
        }
        size++;
    }

    public void addNodeAtEnd(int data) {
        if (size == 0) {
            addNodeAtStart(data);
        } else {
            Node node = new Node(data);
            back.next = node;
            back = node;
            back.next = front;
            size++;
        }
        System.out.println("\nNode " + data + " is added at the end of the list");
    }

    public void deleteNodeFromStart() {
        if (size == 0) {
            System.out.println("\nList is Empty");
        } else {
            System.out.println("\ndeleting node " + front.data + " from start");
            front = front.next;
            back.next = front;
            size--;
        }
    }

    public int elementAt(int index) {
        if (index > size) {
            return -1;
        }
        Node n = front;
        while (index - 1 != 0) {
            n = n.next;
            index--;
        }
        return n.data;
    }

    //print the linked list
    public void print() {
        System.out.print("Circular Linked List:");
        Node temp = front;
        if (size <= 0) {
            System.out.print("List is empty");
        } else {
            do {
                System.out.print(" " + temp.data);
                temp = temp.next;
            }
            while (temp != front);
        }
        System.out.println();
    }

    //get Size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        CircularLinkedList c = new CircularLinkedList();
        c.addNodeAtStart(3);
        c.addNodeAtStart(2);
        c.addNodeAtStart(1);
        c.print();
        c.deleteNodeFromStart();
        c.print();
        c.addNodeAtEnd(4);
        c.print();
        System.out.println("Size of linked list: " + c.getSize());
        System.out.println("Element at 2nd position: " + c.elementAt(2));
    }

}

