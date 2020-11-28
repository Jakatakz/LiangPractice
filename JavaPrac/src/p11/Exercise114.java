package p11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a sequence of numbers, 0 ends");
		ArrayList<Integer> list1 = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		while (input.hasNextInt()) {
			int number = input.nextInt();
			if (number != 0) {
				list1.add(number);
			}
			else
				break;
		}
		
		System.out.println("largest number: " + max(list1));
		
	}
	
	public static Integer max(ArrayList<Integer> list) {
		Collections.sort(list);
		return list.get(list.size()-1);
	}

}
