package p17;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E17_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file1 = new File("Exercise17_02.dat");
		boolean append = file1.exists();
		try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file1, append))))
		{
			System.out.println("before write: " + file1.length());
			for (int i = 0; i < 150; i ++)
			{
				output.write((int)(Math.random() * Integer.MAX_VALUE));
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
		
		System.out.println("after write: " + file1.length());
		
	}

}
