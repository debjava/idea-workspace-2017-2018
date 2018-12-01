package com.ddlab.thread.threadpool1;
 
public interface CustomQueue<E>{
 
    public void enqueue(E e);
     
    public E dequeue();
     
}