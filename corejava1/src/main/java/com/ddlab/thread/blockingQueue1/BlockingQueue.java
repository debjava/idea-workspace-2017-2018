package com.ddlab.thread.blockingQueue1;

public class BlockingQueue {
    private java.util.Queue queue = new java.util.LinkedList();

    public synchronized Object take() {
        Object msg = null;
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                // Error return the client a null item
                return msg;
            }
        }
        msg = queue.remove();
        return msg;
    }

    public synchronized void put(Object o) {
        queue.add(o);
        // Wake up anyone waiting for something to be put on the queue.
        notifyAll();
    }

    public static void main(String[] args) {
        BlockingQueue bq = new BlockingQueue();
        System.out.println("put(11)");
        bq.put(11);
        System.out.println("put(12)");
        bq.put(12);
        System.out.println("take() > " + bq.take());
        System.out.println("take() > " + bq.take());
    }

}