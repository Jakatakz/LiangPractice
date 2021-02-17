package p19;

import java.util.Arrays;

public class GenericStack<E> {
  //private java.util.ArrayList<E> list = new java.util.ArrayList<>();
	private int capacity = 10;
	private int size;
	private E[] list = (E[]) new Object[capacity];
  
  public int getSize() {
    return list.length;
  }

  public E peek() {
	  //return last element in array
	  if (size == 0)
		  return null;
	  else
		  return list[size-1];
  }

  public void push(E o) {
    list[size++] = o;
    if (size == capacity)
    {
    	E[] tempArray = (E[])(new Object[capacity *= 2]);
    	System.arraycopy(list, 0, tempArray, 0, list.length);
    	list = tempArray;
    }
  }

  public E pop() {
    if (size == 0)
    	return null;
    else
    	return list[--size];
  }

  public boolean isEmpty() {
    return size == 0;
  }
  
  @Override
  public String toString() {
    return "stack: " + Arrays.toString(list);
  }
}