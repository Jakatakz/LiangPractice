package p11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//prompt user to enter 2 lists, each with five integers
		//ex list 1: 2,3,1,5 list2: 3,4,6 {2,3,1,5,3,4,6}
		Scanner input = new Scanner(System.in);
		System.out.println("enter numbers for first list, 5 integers");
		ArrayList<Integer> list1 = new ArrayList<>();
		int count = 0;
		while (count < 5)
		{
			if (input.hasNextInt()) {
				list1.add(input.nextInt());
				count++;
			}
			else 
			{
				input.nextLine();
				System.out.println("msut be integer, try again");
				
			}
		}
		System.out.println("list1: " + list1.toString());
		System.out.println("enter numbers for second list, 5 integers");
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.println("count: " + count);
		count = 0;
		System.out.println("count: " + count);
		while (count < 5)
		{
			if (input.hasNextInt()) {
				list2.add(input.nextInt());
				count++;
			}
			else
			{
				input.nextLine();
				System.out.println("must be integer, try again");
			}
		}
		System.out.println("list2: " + list2.toString());
		//display their union, numbers are seperated by exactly 1 space
		
		System.out.println("combined list: ");
		for (Integer a: union(list1, list2))
			System.out.print(a + " ");
		//union(list1, list2);
	}
	
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		return list3;
	}

}
