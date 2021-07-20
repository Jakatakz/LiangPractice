package p19;

public class E19_testing<E> {

	public static void main(String[] args) {
		Integer[] integers = {1,2,3,4,5};
		String[] strings = {"London", "Paris", "New York", "Austin"};
		
		E19_testing.<Integer>m(integers);
		E19_testing.<String>m(strings);
		
	}
	public static <E> void m(E[] o1)
	{
		for (E a: o1)
			System.out.print(a + " ");
		System.out.println();
	}

}
