package com.ddlab.algol.completed;

import java.util.Arrays;

public class ArrayBasedQueue<E> { // FIFO

    private int defaultCapacity = 10;
    private int size;
    private Object[] elements;

    public ArrayBasedQueue() {
        elements = new Object[defaultCapacity];
    }

    private void ensureCapacity() {
        elements = Arrays.copyOf(elements, size * 2);
    }

    public void offer(E e) {
        if (size == elements.length)
            ensureCapacity();
        elements[size++] = e;
    }

    public int getSize() {
        return size;
    }

    private int front = 0;
    public E poll() {
        front++;
        E e = (E) elements[front - 1];
        size--;

        return e;
    }

    public E getElement(int index) {
        return (E) elements[index];
    }

    public static void main(String[] args) {

        ArrayBasedQueue queue = new ArrayBasedQueue();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");

        System.out.println(queue.poll());
        System.out.println(queue.poll());

        for (int i = 5; i < 25; i++) {
            String val = String.valueOf(i);
            queue.offer(val);
        }

        for (int i = 0; i < queue.getSize(); i++) {
            System.out.println("Element --->" + queue.getElement(i));
        }
    }
}
