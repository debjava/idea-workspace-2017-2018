package com.blockingqueue2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by PIKU on 9/10/2015.
 */
public class Test {

    public static void main(String[] args) {

        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(1);

        Thread producer = new Thread(new Producer1(bq));

        Thread consumer = new Thread(new Consumer1(bq));

        producer.start();
        consumer.start();

//        HashSet
    }
}
