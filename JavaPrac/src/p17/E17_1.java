package p17;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class E17_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter file name");
		String fileNameString = input.next();
		fileNameString = fileNameString + ".txt";
		File file1 = new File(fileNameString);
		boolean append = file1.exists();
		
		try (PrintWriter printer1 = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file1, append) ) ))
		{
			for (int i = 0; i < 150; i++)
			{
				printer1.print((int)(Math.random() * Integer.MAX_VALUE) + " ");
			}
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}

}
