package com.ddlab.algol.completed;

import java.util.Arrays;

public class MyList
{
	private int size;
	private int defaultCapacity = 10;
	private Object[] elements;

	public MyList()
	{
		elements = new Object[defaultCapacity];
	}

	public void add(Object x)
	{
		if( elements.length == size )
			ensureCapacity();
		elements[size++] = x;
	}

	private void ensureCapacity()
	{
		elements = Arrays.copyOf(elements, (elements.length*2) );
	}

	public Object get( int index )
	{
		return elements[index];
	}

	public void delete( Object obj )
	{
		for( int i = 0 ; i < elements.length ; i++ )
		{
			if( elements[i].equals(obj))
			{
				elements[i] = null;
				size--;
				condenseArray(i);
				break;
			}
		}
	}

	public int size()
	{
		return size;
	}

	private void condenseArray( int start )
	{
		for( int i = start ; i < size ; i++ )
			elements[i] = elements[i+1];
	}

	public void trimArray() {
		elements = Arrays.copyOf(elements, size);
	}

	public static void main(String[] args)
	{
		MyList list = new MyList();

		for( int i = 0 ; i < 13 ; i++ )
		{
			list.add( new Integer(i));
		}

		System.out.println("Size ::: "+list.size());

		list.delete( new Integer(5));
		System.out.println("Size ::: "+list.size());
		list.delete( new Integer(7));
		System.out.println("Size ::: "+list.size());
		for( int i = 0 ; i < list.size() ; i++ )
		{
			System.out.println(list.get(i));
		}
	}
}
