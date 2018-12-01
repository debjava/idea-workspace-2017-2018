package com.blockingqueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
 
public class ArrayBlockingQueueTest {
    private static BlockingQueue<String> bq = new ArrayBlockingQueue<String>(1);
 
    class PutThread implements Runnable {
 
        @Override
        public void run() {
            try {
                int i = 0;
                while (true) {
                    bq.put("A" + i);
                    System.out.println("Producer has put: A" + i);
                    i++;
                    Thread.sleep(1000);
                }
            } catch (final Exception e) {
                e.printStackTrace();
            }
 
        }
    }
 
    class TakeThread implements Runnable {
 
        @Override
        public void run() {
            try {
                while (true) {
                    final String data = bq.take();
                    System.out.println("Consumer has consumed.." + data);
                }
            } catch (final Exception e) {
                e.printStackTrace();
            }
        }
    }
 
    public static void main(final String... args) {

        final Thread pt = new Thread(new ArrayBlockingQueueTest().new PutThread());

 
        final Thread tt = new Thread(new ArrayBlockingQueueTest().new TakeThread());

        pt.start();
        tt.start();
    }
} 