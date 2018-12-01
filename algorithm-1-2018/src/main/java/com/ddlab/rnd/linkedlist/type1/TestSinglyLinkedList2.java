package com.ddlab.rnd.linkedlist.type1;
//    https://www.geeksforgeeks.org/data-structures/linked-list/#singlyLinkedList
public class TestSinglyLinkedList2 {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    for (int i = 0; i < 10; i++) {
      list.addLast(i);
    }
    for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + "\t");
    System.out.println();
    list.deleteAt(8);
    for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + "\t");
    list.deleteLast();
    list.deleteLast();
    System.out.println();
    for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + "\t");
    list.reversList();
    System.out.println();
    for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + "\t");
    list.recursiveReversList();
    System.out.println();
    for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + "\t");
    System.out.println();
    list.findMiddle();

    System.out.println("Find the 2nd last node ::: " + list.findNthNodeFromLast(2));

    list.reversePairWise();
    System.out.println();
    for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + "\t");
  }
}
