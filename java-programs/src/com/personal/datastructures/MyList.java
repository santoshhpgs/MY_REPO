package com.personal.datastructures;

import java.util.Arrays;

public class MyList<E> {
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object elements[];

	public MyList() {
		elements = new Object[DEFAULT_CAPACITY];
	}

	public void add(E e) {
		if (size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = e;
	}

	public void add(E object, int index) {
		if (size == elements.length) {
			ensureCapacity();
		}
		System.arraycopy(elements, index, elements, index + 1, size - index);
		elements[index] = object;
		++size;
	}

	public E get(int i) {
		if (i >= elements.length || i < 0) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		return (E) elements[i];
	}

	private void ensureCapacity() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	@Override
	public String toString() {
		return "MyList [elements=" + Arrays.toString(elements) + "]";
	}

}
