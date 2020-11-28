package p11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter 5 numbers and display them in increasing order, store in arraylist");
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		for (int i = 0 ; i < 5; i ++) {
			list1.add(input.nextInt());
		}
		System.out.println(list1.toString());
		sort(list1);
		System.out.println(list1.toString());
	}
	
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
		
	}

}
