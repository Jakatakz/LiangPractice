package p11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> list1 = new ArrayList<>();
		//prompt user to enter 5 numbers
		Scanner input = new Scanner(System.in);
		System.out.println("enter 5 double numberS: ");
		//store them in an arraylist
		for (int i = 0; i < 5; i ++) 
		{
			list1.add(input.nextDouble());
		}

		
		//display their sum
		System.out.println(sum(list1));
	}
	
	//sum of all elements in arraylist
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (double a: list) 
			sum += a;
		return sum;
	}

}
