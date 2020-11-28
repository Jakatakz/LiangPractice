package p17;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class P17_5 implements Serializable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file1 = new File("Exercise17_05.dat");
		
		try
		{
			file1.createNewFile();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		
		try
			( ObjectOutputStream dos1 = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file1))) )
			{
				
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
