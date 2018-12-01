package com.ddlab.thread.blockingQueue1;

import java.util.LinkedList;
import java.util.List;

public class LinkedBlockingQueueCustom<E> {

    private List<E> queue;
    private int  maxSize ; //maximum number of elements queue can hold at a time.

    public LinkedBlockingQueueCustom(int maxSize){
        this.maxSize = maxSize;
        queue = new LinkedList<E>();
    }

    public synchronized void put(E item)  throws InterruptedException  {
        //check space is available or not.
        if (queue.size() == maxSize) {
            this.wait();
        }
        //space is available, insert element and notify all waiting threads.
        queue.add(item);
        this.notifyAll();
    }

    public synchronized E take()  throws InterruptedException{
        //waits element is available or not.
        if (queue.size() == 0) {
            this.wait();
        }
        //element is available, remove element and notify all waiting threads.
        this.notifyAll();
        return queue.remove(0);

    }
}