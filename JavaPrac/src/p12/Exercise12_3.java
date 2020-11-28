package p12;

import java.util.Scanner;

public class Exercise12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//use 2 arrays listed 
		
		//prompt user to enter an integer between 1 and 12
		Scanner input = new Scanner(System.in);
		System.out.println("enter number between 1 and 12");
		try {
			int count = 0;
			boolean flag = true;
			while (flag) 
			{
				if (input.hasNextInt())
				{
					int number = input.nextInt();
					displayMonthDay(number);
					flag = false;
				}
				else
				{
					System.out.println("input must be an int, try again");
					input.next();
					
				}
				
			}
			
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			System.out.println("wrong number");
		}
		//display the months and its number of days  corresponding to the integer entered
		//program should display "wrong number" if the user enters a wrong number by catching ArrayIndexOutOfBoundsException
		
		//arrayindexoutofboundsexception is an unchecked runtime exception
		
	}
	
	public static void displayMonthDay(int number) throws ArrayIndexOutOfBoundsException {
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int[] dom = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println(months[number-1] + " " + dom[number-1]);
	}

}
