package com.ddlab.thread.blockingQueue1;

class Producer extends Thread {
    private LinkedBlockingQueueCustom<Integer> bq;

    public Producer(LinkedBlockingQueueCustom<Integer> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        for( int i = 0 ; i < 10 ; i++ )
            try {
                bq.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}

class Consumer extends Thread {
    private LinkedBlockingQueueCustom<Integer> bq;

    public Consumer(LinkedBlockingQueueCustom<Integer> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        for( int i = 0 ; i < 10 ; i++ )
            try {
                Integer val = bq.take();
                System.out.println("--->"+val);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}

public class TestProducerConsumerBlockingQueue {
    public static void main(String[] args) {
        LinkedBlockingQueueCustom<Integer> bq = new LinkedBlockingQueueCustom<>(1);
        Producer producer = new Producer(bq);
        Consumer consumer = new Consumer(bq);
        producer.start();
        consumer.start();



    }
}
