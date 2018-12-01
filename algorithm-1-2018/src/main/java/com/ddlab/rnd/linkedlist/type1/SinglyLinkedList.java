package com.ddlab.rnd.linkedlist.type1;

public class SinglyLinkedList {
  private Node front;

  private static class Node {
    private Node next;
    private Object data;

    public Node(Object data) {
      this.next = null;
      this.data = data;
    }
  }

  // Insert at beginning O(1)
  public void addFirst(Object x) {
    Node f = front;
    front = new Node(x);
    front.next = f;
  }

  // Insert at last O(n)
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

  private Node getNodeAt(int index) {
    Node current = front;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    return current;
  }

  public void insertAtPosition(Object x, int position) {
    Node current = getNodeAt(position - 1);
    Node newNode = new Node(x);
    newNode.next = current.next;
    current.next = newNode;
  }

  public int size() {
    int len = 0;
    for (Node p = front; p != null; p = p.next) len++;
    return len;
  }

  // O(n)
  public Object get(int index) {
    if (index < 0) return null;
    Object data = null;
    int counter = 0;
    for (Node p = front; p != null; p = p.next) {
      if (counter == index) data = p.data;
      counter++;
    }
    return data;
  }

  // O(1)
  public void deleteFirst() {
    front = front.next;
  }

  public void deleteLast() {
    Node previous = null;
    for (Node p = front, q = front; p != null; q = p, p = p.next) {
      previous = q;
    }
    previous.next = null;
  }

  public void deleteAt(int position) {
    if (position == 0) deleteFirst();
    else {
      Node tempNode = front;
      for (int i = 0; i < position - 1; i++) {
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
    }
  }

  public void recursiveReversList() {
    recursiveReverse(front);
  }

  public void recursiveReverse(Node currentNode) // Best way to do it
      {
    // check for empty list
    if (currentNode == null) return;
    /* if we are at the TAIL node: recursive base case:*/
    if (currentNode.next == null) {
      // set HEAD to current TAIL since we are reversing list
      front = currentNode;
      return; // since this is the base case
    }
    recursiveReverse(currentNode.next);
    currentNode.next.next = currentNode;
    currentNode.next = null; // set "old" next pointer to NULL
  }

  public void reversList() {
    front = reverse(front);
  }

  public Node reverse(Node node) {
    Node prev = null;
    Node next = null;
    Node current = node;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    node = prev;
    return node;
  }

  // Find the middle element
  public void findMiddle() {
    int length = 0;
    Node middle = front;
    for (Node p = front; p != null; p = p.next) {
      length++;
      if (length % 2 == 0) middle = middle.next;
    }
    System.out.println("Middle Element : " + middle.data);
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

  public void print() {
    printRecursive(front);
  }

  public void printRecursive(Node p) {
    if (p != null) {
      System.out.print(p.data + "\t");
      printRecursive(p.next);
    }
  }
  // Print in reverse
  public void printReverseList() {
    printReverseList(front);
  }

  private void printReverseList(Node p) {
    if (p != null) {
      printReverseList(p.next);
      System.out.println(p.data);
    }
  }

  public Object findNthNodeFromLast(int n) {
    Node temp = front;
    int len = size();
    for (int i = 1; i < len - n + 1; i++) temp = temp.next;
    return temp.data;
  }

  // Reverse the linkedlist pair wise, 1->2->3->4, 2->1->4->3
  public void reversePairWise() {
    Node temp = front;
    /* Traverse only till there are atleast 2 nodes left */
    while (temp != null && temp.next != null) {
      /* Swap the data */
      Object k = temp.data;
      temp.data = temp.next.data;
      temp.next.data = k;
      temp = temp.next.next;
    }
  }

  /** Inputs: 1->2->3->4->5->6->7->8->NULL and k = 3 Output: 3->2->1->6->5->4->8->7->NULL. */
  public void reverseKnodes(int k) {
    front = reverseKNodes(front, k);
  }

  public Node reverseKNodes(Node head, int k) {
    Node current = head;
    Node next = null;
    Node prev = null;

    int count = 0;

    /* Reverse first k nodes of linked list */
    while (count < k && current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
      count++;
    }

    /* next is now a pointer to (k+1)th node
    Recursively call for the list starting from current.
    And make rest of the list as next of first node */
    if (next != null) head.next = reverseKNodes(next, k);

    // prev is now head of input list
    return prev;
  }

    /**
     * Remove duplicates from Singly LinkedList
     * INPUT : 12->11->12->21->41->43->21
     * OUTPUT : 12	11	21	41	43
     */
  public void removeDuplicates() {
    Node ptr1 = null, ptr2 = null, dup = null;
    ptr1 = front;

    /* Pick elements one by one */
    while (ptr1 != null && ptr1.next != null) {
      ptr2 = ptr1;
      /* Compare the picked element with rest
      of the elements */
      while (ptr2.next != null) {
        /* If duplicate then delete it */
        if (ptr1.data == ptr2.next.data) {
          /* sequence of steps is important here */
          dup = ptr2.next;
          ptr2.next = ptr2.next.next;
        } else /* This is tricky */ {
          ptr2 = ptr2.next;
        }
      }
      ptr1 = ptr1.next;
    }
  }

  public void displayAll() {
    for (Node p = front; p != null; p = p.next) {
      System.out.println("---" + p.data);
    }
  }
}
