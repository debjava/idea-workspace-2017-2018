package com.ddlab.rnd.linkedlist.type1;

public class TestSinglyLinkedList1 {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.addLast(3);
    list.addFirst(2);
    list.addFirst(1);

    list.addLast(4);
    list.addLast(5);

    int size = list.size();
    System.out.println("Size of List : " + size);
    //    list.displayAll();

    for (int i = 0; i < size; i++) {
      System.out.print(list.get(i) + " ");
    }

    list.addLast(6);
    System.out.println("\n");
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }

    System.out.println("\nAfter Deleting First ...");
    list.deleteFirst();
    for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");

    System.out.println("\nAfter Deleting Last ...");
    list.deleteLast();
    for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");

    list.deleteLast();
    System.out.println();
    for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");

      list.addFirst(1);
      list.addLast(6);
      list.addLast(7);
      list.addLast(8);
      list.addLast(9);
      list.addLast(62);
      System.out.println();
      for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");
      list.insertAtPosition("XXX",2);
      System.out.println();
      for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");
  }
}
