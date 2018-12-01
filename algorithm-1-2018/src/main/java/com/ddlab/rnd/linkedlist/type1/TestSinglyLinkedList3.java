package com.ddlab.rnd.linkedlist.type1;

public class TestSinglyLinkedList3 {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    for (int i = 0; i < 10; i++) {
      list.addLast(i);
    }

    for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + "\t");
    System.out.println();

    list.reverseKnodes(3);
    for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + "\t");

    // To remove duplicates from Singly Linked List
    SinglyLinkedList list1 = new SinglyLinkedList();
    // 12->11->12->21->41->43->21
    list1.addLast(12);
    list1.addLast(11);
    list1.addLast(12);
    list1.addLast(21);
    list1.addLast(41);
    list1.addLast(43);
    list1.addLast(21);
    System.out.println();
    for (int i = 0; i < list1.size(); i++) System.out.print(list1.get(i) + "\t");
    System.out.println();
    list1.removeDuplicates();
    for (int i = 0; i < list1.size(); i++) System.out.print(list1.get(i) + "\t");
  }
}
