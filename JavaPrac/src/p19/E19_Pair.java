package p19;

public class E19_Pair<T> {		//this would be 2 diff datatypes, encapsulate two objects of the SAME so, maybe T only, was T, T2 before.

	private T obj1;
	private T obj2;
	
	public E19_Pair() 
	{
	}
	
	public E19_Pair(T obj1, T obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public static <E extends Comparable<E>> E getSmallestValue(E obj1, E obj2)
	{
		E result;
		if (obj1.compareTo(obj2) > 0)
			result = obj2;
		else 
			result = obj1;
		return result;
	}
	
	public T getObj1() {
		return obj1;
	}

	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}

	public T getObj2() {
		return obj2;
	}

	public void setObj2(T obj2) {
		this.obj2 = obj2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//E19_Pair<Integer, Integer> o1 = new E19_Pair<>(1,2);
		E19_Pair<Integer> o1 = new E19_Pair<>(1,2);
		System.out.println(o1.getObj1());
		System.out.println(o1.getObj2());
		System.out.println(getSmallestValue(o1.getObj1(), o1.getObj2()));
		
		
	}

}
