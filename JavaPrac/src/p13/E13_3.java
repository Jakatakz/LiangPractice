package p13;

import java.util.ArrayList;
import java.util.Collections;

public class E13_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write the following method that sorts an arrayList of numbers
		ArrayList<Number> list1 = new ArrayList<>();
		list1.add(5.3);
		list1.add(3.2);
		list1.add(8);
		list1.add(1);
		System.out.println("before: ");
		for (Number a: list1)
			System.out.print(a + " ");
		System.out.println();
		sort(list1);
		System.out.println("after: ");
		for (Number a: list1)
			System.out.print(a + " ");
		System.out.println();
	}
	
	public static void sort(ArrayList<Number> list)
	{
		//cant sort Number , doesnt implement comparable
		
		//Collections.sort(list);
		ArrayList<Number> tempList = new ArrayList<>();
		Number min;
		int minIndex;
		for (int i = 0; i < list.size(); i++)
		{
			min = list.get(i);
			minIndex = i;
			for (int k = i+1; k<list.size(); k++)
			{
				if (min.doubleValue() > list.get(k).doubleValue())
				{
					min = list.get(k);
					minIndex = k;
					System.out.println("min : " + min);
					
				}
			}
			if (minIndex != i)
			{
				list.set(minIndex,  list.get(i));
				list.set(i, min);
			}
		}
		System.out.println("\n-----");
		for (Number a: tempList)
			System.out.println(a);
		System.out.println("------");
		list = tempList;
	}

}
