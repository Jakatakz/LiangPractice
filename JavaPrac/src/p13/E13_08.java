package p13;
import java.util.ArrayList;

//rewrite to perform a deep copy of the list field

//MyStack class
public class E13_08 implements Cloneable {
  private ArrayList<Object> list = new ArrayList<>();

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public int getSize() {
    return list.size();
  }

  public Object peek() {
    return list.get(getSize() - 1);
  }

  public Object pop() {
    Object o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  public void push(Object o) {
    list.add(o);
  }

  @Override /** Override the toString in the Object class */
  public String toString() {
    return "stack: " + list.toString();
  }
  @Override
  public Object clone()
  {
	  E13_08 eStack = null;
	  try
	  {
		  eStack = (E13_08)super.clone();
		  
	  } 
	  catch (CloneNotSupportedException ex)
	  {
		  ex.printStackTrace();
	  }
	  eStack.list = (new ArrayList<>(list));
	return eStack;
  }
}