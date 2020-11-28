package p12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length != 1) 
		{
			System.out.println("need 1 argument, should be file, ex: Exercise12_13.java");
			System.exit(1);
		}
		
		//use tester1213.txt
		File file1 = new File(args[0]);
		if (!file1.exists())
		{
			System.out.println("file does not exist");
			System.exit(2);
		}
		
		int numberOfCharacters = 0;
		int numberOfWords = 0;
		int numberOfLines = 0;
		String str = "";
		try (Scanner input = new Scanner(file1))
		{
			while (input.hasNextLine())
			{
				str=input.nextLine();
				System.out.println(str);
				numberOfCharacters += str.toCharArray().length;
				String[] strWords = str.split("\\s+");
				numberOfWords += strWords.length;
				numberOfLines++;
			}
			System.out.println(numberOfCharacters + "\n" + numberOfWords + "\n" + numberOfLines);
		} catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(numberOfCharacters + "\n" + numberOfWords + "\n" + numberOfLines);
		
		
	}

}
