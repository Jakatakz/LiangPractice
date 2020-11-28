package p17;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P17_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file1 = new File("Exercise17_02.dat");
		boolean apnd = false;
		if (file1.exists())
			apnd = true;
		try (
		DataOutputStream s1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file1, apnd)));
	)
		{
			for (int i = 0 ;i < 100; i ++)
			{
				s1.writeInt( (int)(Math.random() * 100) );
			}
			
		}
		catch (FileNotFoundException ex)
		{
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
