package p19;

import java.util.ArrayList;

public class E02_GenericStack<E> extends ArrayList<E>{
  //private java.util.ArrayList<E> list = new java.util.ArrayList<>();

  public int getSize() {
    return size();
  }

  public E peek() {
    return get(getSize() - 1);
  }

  public void push(E o) {
    add(o);
  }

  public E pop() {
    E o = get(getSize() - 1);
    remove(getSize() - 1);
    return o;
  }

  public boolean isEmpty() {
    return super.isEmpty();
  }
  
  @Override
  public String toString() {
    return "stack: " + super.toString();
  }
}