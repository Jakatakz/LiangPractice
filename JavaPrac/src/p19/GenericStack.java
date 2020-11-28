package p19;

import java.util.Arrays;

public class GenericStack<E> {
  //private java.util.ArrayList<E> list = new java.util.ArrayList<>();
  
	private int capacity = 5;
  //unsafe
  private E[] arr1 = (E[]) new Object[capacity];
  private int size;
  
  public int getSize() {
    return arr1.length;
  }

  public E peek() {
    return arr1[arr1.length-1];
  }

  public void push(E o) {
    arr1[size++] = o;
    if (size == arr1.length)
    {
    	E[] tmp = (E[]) new Object[capacity *= 2];
    	System.arraycopy(arr1, 0, tmp, 0, arr1.length);
    	arr1 = tmp;
    }
  }

  public E pop() {
    if (size == 0)
    	return null;
    else
	  return arr1[--size];
  }

  public boolean isEmpty() {
    return size == 0;
  }
  
  @Override
  public String toString() {
    return "stack: " + Arrays.toString(arr1);
  }
  
  
}