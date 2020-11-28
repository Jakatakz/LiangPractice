package p12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length != 2)
		{
			System.out.println("wrong usage: java Exercise12_11 John filename");
			System.exit(1);
		}
		File fileName1 = new File(args[1]);
		
		System.out.println(fileName1);
		System.out.println(fileName1.getAbsolutePath());
		if (!fileName1.exists()) 
		{
			System.out.println(fileName1 + " file does not exist, creating file...");
			try 
			{
				fileName1.createNewFile();
			} catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
		else if (fileName1.exists())
		{
			System.out.println(fileName1 + " already exists!");
		}
		
		
		String str = "";
		String test = "";
		try (Scanner input = new Scanner(fileName1))
		{
			System.out.println("str: \n" + str);
			test = "x";
			while (input.hasNextLine())
			{
				str += input.nextLine();
				System.out.println(str);
			}
			str = str.replace("John", "");
			System.out.println("str.replace: \n" + str);
		} catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(test);
		try (PrintWriter print1 = new PrintWriter(fileName1))
		{
			System.out.println("before print: \n" + str);
			print1.print(str);
		} catch (FileNotFoundException ex) 
		{
			
		}
	}

}
