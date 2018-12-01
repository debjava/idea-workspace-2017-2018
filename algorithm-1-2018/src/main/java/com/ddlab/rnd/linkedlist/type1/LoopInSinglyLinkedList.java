package com.ddlab.rnd.linkedlist.type1;

public class LoopInSinglyLinkedList {
  private Node front;

  private static class Node {
    private Node next;
    private Object element;

    public Node(Object data) {
      this.element = data;
      this.next = null;
    }
  }

  public void addLast(Object x) {
    if (front == null) front = new Node(x);
    else {
      Node current = front;
      for (Node p = current; p != null; p = p.next) {
        current = p;
      }
      current.next = new Node(x);
    }
  }

  // Floyd’s Cycle Detection Algorithm Tortoise and Hare
  public boolean isCyclic() {
    Node fast = front;
    Node slow = front;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      // if fast and slow pointers are meeting then LinkedList is cyclic
      if (fast == slow) {
        return true;
      }
    }
    return false;
  }

    // Method to create a Loop inside a LinkedList
    public void createALoop() {
        front.next.next.next = front.next.next;
    }

  public void print() {
    for (Node p = front; p != null; p = p.next) {
      System.out.print(p.element + "\t");
    }
  }


}
