package com.ddlab.rnd.threads1;

public class ProducerConsumerTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Fruit f = new Fruit();
        Producer p = new Producer(f);
        Consumer c = new Consumer(f);
        p.start();
        c.start();
    }
}
