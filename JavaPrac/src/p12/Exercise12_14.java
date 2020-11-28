package p12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12_14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		if (args.length != 1)
		{
			System.out.println("usage: 1 file");
			System.exit(1);
		}
		
		System.out.println(args[0]);
		File file2 = new File(args[0]);
		if (!file2.exists())
		{
			
			System.out.println("file doesnt exist");
			System.exit(2);
			
		}
		
		//file2 text file must be placed in the project folder, not the src folder or a package !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		if (file2.exists())
		{
			System.out.println(file2.getAbsoluteFile());
			System.out.println(file2 + " exists\nsize is: " + file2.length());
			System.out.println(file2.getPath());
			System.out.println(file2.isFile());
			System.out.println(file2.canRead());
		}
		//return position number
		System.out.println("enter a name from file to return position of: ");
		String name = "everyone";
		System.out.println("position of: " + name + " in file is: " + readInFile(name, file2) + " starting from 0");
	}
	
	public static int readInFile(String line, File file) 
	{
		System.out.println("name: " + line);
		//returns position number of a line in the specified file, or -1 if there is no such line or file.
		String str = "";
		int lineNumber = 0;
		int state = -1;		//default state -1, no such line or file
		System.out.println(file.length());
		try (Scanner input = new Scanner(file))
		{
	
			while (input.hasNextLine())
			{
				String word = input.nextLine();
				System.out.println(word);
				if (word.equals(line))
				{
					state = lineNumber;
				}
				else
				{
					
					lineNumber++;
				}
			}
			
		} catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		return state;
	}

}
