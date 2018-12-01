package com.ddlab.rnd.algo1;

public class MyArrayList {
	private int size;
	private int defaultCapacity = 10;
	private Object[] elements;

	public MyArrayList() {
		elements = new Object[defaultCapacity];
	}

	//Offer() in case of Queue
	public void add(Object x) { // Add Last , push() in case of Stack
		if (elements.length == size)
			ensureCapacity();
		elements[size++] = x;
	}

	public void addFirst(Object x) {
		addAtPosition(0, x);
	}

	public void addAtPosition(int position, Object x) {
		Object[] result = new Object[elements.length + 1];
		for (int i = 0; i < position; i++) {
			result[i] = elements[i];
		}
		result[position] = x;
		for (int i = position + 1; i < result.length; i++) {
			result[i] = elements[i - 1];
		}
		size++;
		if (elements.length == size)
			ensureCapacity();
		elements = result;
	}

	public void insertAtPosition(int position, Object x) {// Insert at some index
		Object destination[] = new Object[elements.length + 1];
		System.arraycopy(elements, 0, destination, 0, position);
		destination[position] = x;
		System.arraycopy(elements, position, destination, position + 1, elements.length - position);
		size++;
		if (elements.length == size)
			ensureCapacity();
		elements = destination;
	}

	public void ensureCapacity() {
		int oldCapacity = elements.length;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		elements = copyOf(elements, newCapacity);
	}

	public void deleteFirst() { // POLL() in case of Queue
		elements = copyOfRange(elements, 1, elements.length);
		size--;
	}

	public void deleteLast() { // POP() in case of Stack
		elements = copyOfRange(elements, 0, elements.length - 1);
		size--;
	}

	public void deleteAtPosition(int index) {
		Object[] result = new Object[elements.length - 1];
		System.arraycopy(elements, 0, result, 0, index);
		System.arraycopy(elements, index + 1, result, index, result.length - index);
		size--;
		elements = result;
	}

	public void delete(Object x) {
		for( int i = 0 ; i < elements.length ; i++ ) {
			if(elements[i].equals(x)) {
				elements[i] = null;
				size--;
				condenseArray(i);
				break;
			}
		}
	}

	private void condenseArray( int start ) {
		for( int i = start ; i < size ; i++) {
			elements[i] = elements[i+1];
		}
	}

	public void trimArray() {
		elements = copyOf(elements, size);
	}

	public void display() {
		trimArray();
		System.out.println("\n");
		for (Object x : elements)
			System.out.print(x + "\t");
	}

	public Object[] copyOfRange(Object[] objs, int from, int to) {
		int len = to - from;
		Object[] copy = new Object[len];
		System.arraycopy(objs, from, copy, 0, Math.min(objs.length - from, len));
		return copy;
	}

	public Object[] copyOf(Object[] objs, int size) {
		Object[] copy = new Object[size];
		System.arraycopy(objs, 0, copy, 0, Math.min(objs.length, size));
		return copy;
	}

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		for (int i = 0; i < 10; i++) {
			list.add("S" + i);
		}
		System.out.println("--------------");
		list.display();

		list.deleteFirst();
		list.display();
		list.deleteLast();
		list.display();
		list.add("S11");
		list.display();
		list.deleteFirst();
		list.display();
		list.addFirst("S-1");
		list.display();
		list.add("S12");
		list.display();
		list.addAtPosition(2, "S1->2");
		list.display();
		list.addAtPosition(1, "S1->1");
		list.display();
		list.deleteAtPosition(3);
		list.display();
		list.insertAtPosition(0, "A1");
		list.display();
		list.delete("S12");
		list.display();
	}
}
