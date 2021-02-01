package p17;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class E17_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write text file with lines of characters, 
		if (args.length != 2)
		{
			System.out.println("needs to be 2 args, welcome1.java? and welcome1.utf");
			System.exit(1);
		}
		File file1 = new File(args[0]);
		try//probably should have made this a try with resources and declared all resources here
		{
			if (!file1.exists())
			{
				try (PrintWriter out1  = new PrintWriter(file1))
				{
					//out1.print("abcd line 1\nefgh line 2");
					out1.println("abcd line 1");
					out1.println("efgh line 2");
				}
			}
			else
			{
				System.out.println("press 1 to continue, 2 to delete file and exit program");
				try (Scanner input = new Scanner(System.in))
				{
					int continueOrDeleteFile = input.nextInt();
					if (continueOrDeleteFile == 2)
					{
						file1.delete();
						System.exit(2);
					}
				}
			}
		} 
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		//read lines of characters from a text file
		//write each line as a UTF string into a binary
		
		try (BufferedReader in1 = new BufferedReader(new FileReader(file1));
				DataOutputStream out1 = new DataOutputStream(new FileOutputStream(args[1])))
		{
			String s;
			int fileSize = 0;
			while ((s = in1.readLine()) != null)
			{
				out1.writeUTF(s);
				fileSize += s.length();
			}
			System.out.println("size of text file: " + fileSize + " bytes");
			System.out.println("size of the binary file: " + out1.size() + " bytes"); //different sizes due to first two bytes written to the outputstream for writeutf (for each line)
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		//DISPLAY the size of the text file and the binary file
		//use java E17_4 Welcome1.java Welcome1.utf to run prgoram
	}

}
