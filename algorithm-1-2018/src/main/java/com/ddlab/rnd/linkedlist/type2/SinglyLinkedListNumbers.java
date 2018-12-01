package com.ddlab.rnd.linkedlist.type2;

public class SinglyLinkedListNumbers {

  private Node front;

  private static class Node {
    private Node next;
    private int data;

    public Node(int data) {
      this.next = null;
      this.data = data;
    }
  }

  public void addLast(int x) {
    if (front == null) front = new Node(x);
    else {
      Node current = front;
      for (Node p = current; p != null; p = p.next) {
        current = p;
      }
      current.next = new Node(x);
    }
  }

  public int size() {
    int len = 0;
    for (Node p = front; p != null; p = p.next) len++;
    return len;
  }

  // ALready insert into sorted List
  public void insertInSortedManner(int x) {
    Node current;
    Node newNode = new Node(x);
    if (front == null || front.data >= x) {
      newNode.next = front;
      front = newNode;
    } else {
      /* Locate the node before point of insertion. */
      current = front;
      while (current.next != null && current.next.data < x) {
        current = current.next;
      }
      newNode.next = current.next;
      current.next = newNode;
    }
  }

  public void displayAll() {
    for (Node p = front; p != null; p = p.next) {
      System.out.print(p.data + "\t");
    }
  }

  public static void main(String[] args) {
    SinglyLinkedListNumbers list = new SinglyLinkedListNumbers();
    list.addLast(2);
    list.addLast(5);
    list.addLast(7);
    list.addLast(10);
    list.addLast(15);
    list.displayAll();
    list.insertInSortedManner(9);
    System.out.println();
    list.displayAll();
    System.out.println();
    list.insertInSortedManner(1);
    list.displayAll();
  }
}
