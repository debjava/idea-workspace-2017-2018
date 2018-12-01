package com.ddlab.rnd.linkedlist.type1;

public class TestLoopInSinglyLinkedList {
  public static void main(String[] args) {
    LoopInSinglyLinkedList list = new LoopInSinglyLinkedList();
    for (int i = 0; i < 10; i++) {
      list.addLast(i);
    }
    list.createALoop();
    //      list.print();//System will hang
    System.out.println(list.isCyclic());
  }
}
