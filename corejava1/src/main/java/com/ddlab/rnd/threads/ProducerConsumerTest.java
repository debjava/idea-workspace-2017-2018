package com.ddlab.rnd.threads;

import java.util.concurrent.TimeUnit;

public class ProducerConsumerTest {
   public static void main(String[] args) {
      MyQueue queue = new MyQueue();
      Producer p1 = new Producer(queue, 1);
      Consumer c1 = new Consumer(queue, 1);
      p1.start(); 
      c1.start();
   }
}
class MyQueue {
   private int contents;
   private boolean available = false;
   
   public synchronized int consume() {
      while (!available) {
         try {
            TimeUnit.SECONDS.sleep(1);
            wait();
            System.out.println("waited inside consume");
         } catch (InterruptedException e) {}
      }
      System.out.println("Inside consume ...., going to notify()");
      available = false;
      System.out.println("Consumer has already consumed "+contents+" , now turn for producer");
      // notifies the Producer thread
      notifyAll();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      return contents;
   }

   public synchronized void produce(int value) {
      while (available) {
         try {
            TimeUnit.SECONDS.sleep(1);
            wait();
            System.out.println("waited inside produce");
         } catch (InterruptedException e) { } 
      }
      System.out.println("Inside produce ...., going to notify()");
      contents = value;
      available = true;
      System.out.println("Producer has already produced "+contents+" , now turn for Consumer");
      //notifies the consumer thread
      notifyAll();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }
}

class Consumer extends Thread {
   private MyQueue queue;
   private int number;
   
   public Consumer(MyQueue c, int number) {
      queue = c;
      this.number = number;
   }
   public void run() {
      int value = 0;
      for (int i = 0; i < 5; i++) {
         value = queue.consume();
//         System.out.println("Consumer #" + this.number + " got: " + value);
      }
   }
}
class Producer extends Thread {
   private MyQueue queue;
   private int number;
   public Producer(MyQueue c, int number) {
      queue = c;
      this.number = number;
   } 
   public void run() {
      for (int i = 0; i < 5; i++) {
         queue.produce(i);
//         System.out.println("Producer #" + this.number + " put: " + i);
         try {
            TimeUnit.SECONDS.sleep(1);
         } catch (InterruptedException e) { }
      } 
   }
} 