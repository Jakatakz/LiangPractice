package p12;

import java.io.File;
import java.util.Scanner;

public class Exercise12_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length != 2)
		{
			System.out.println("usage: (name) (file)");
			System.exit(1);
		}
		
		File file1 = new File(args[1]);
		if (!file1.exists())
		{
			System.out.println("file doesn't exist");
			System.exit(2);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter name");
		String name = input.next();
		input.close();
		
		
		//read tester1214.txt, find line number for name, return it and 
	
		
		//write name to that line number
		//int positionNumber = writeInFile(name, file1);
		//System.out.println(positionNumber);
		
	}
	
	/*
	 * public static int getPositionNumber(String name, File file) {
	 * 
	 * }
	 * 
	 * public static int writeInFile(String name, File file) {
	 * 
	 * }
	 */
}
