package p11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		//prompt user to enter 10 intgers 
		Scanner input = new Scanner(System.in);
		System.out.println("enter 10 integers: ");
		
		//store in a list
		for (int i = 0; i < 10; i++) {
			list1.add(input.nextInt());
		}
		
		//remove duplicate
		removeDuplicate(list1);

		//display the distinct integers in their input order and seperated by exactly 1 space.
		// distinct integer = if they appear, only show them once
		displayDistinct(list1);
		

		
		
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> tempList = new ArrayList<>();
		System.out.println("list size: " + list.size() + "\ntempList size: " + tempList.size());
		for (int i = 0; i < list.size(); i++)
		{
			if (!tempList.contains(list.get(i))) {
				tempList.add(list.get(i));
			}
		}
		list.clear();
		list.addAll(tempList);
		System.out.println(list.toString());
	}
	
	public static void displayDistinct(ArrayList<Integer> listd) {
		System.out.println("in displaydisntinct method: " + listd.size());
		for (int i = 0; i < listd.size(); i++)
			System.out.print(listd.get(i) + " ");
		System.out.println();
		System.out.println(listd.get(0));
		System.out.println(listd.toString());
		for (Integer a: listd)
			System.out.print(a + " ");
	}

}
