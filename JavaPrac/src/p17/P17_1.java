package p17;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class P17_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean apnd = false;
		
		File file1 = new File("Exercise17_01.txt");
		//file1.createNewFile(); //checks for existence of file, if not, then creates file
		if (file1.exists())
			apnd = true;
		System.out.println("apnd: " + apnd);
		try
		{
			System.out.println("apnd: " + apnd);
			PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file1, apnd)));
			for (int i = 0; i < 100; i++)
			{
				//pw.write("asdf ");
				pw.write(  (int)(Math.random() * 100) + 0 + " ");
			}
			pw.close();
			
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		
	}

}
