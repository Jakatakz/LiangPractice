package p13;

import java.util.ArrayList;

public class Exercise13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1 = new ArrayList<>();
		for (int i = 0; i< 10; i++)
		{
			list1.add(i);
		}
		average(list1);
		
	}
	
	//method averages an arrayylist of integers
	public static void average(ArrayList<Integer> list) 
	{
		Integer sum = 0;
		int count = 0;
		for (int a: list)
		{
			sum += a;
			count++;
		}
		System.out.println("average: " + sum/count);
	}

}
