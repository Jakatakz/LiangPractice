package p17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P17_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		File file1 = new File("17_3.dat");
		try (DataOutputStream s1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file1, true))))
		{
			int randomNumOfIntegers = ( (int) (Math.random() * 10) + 1);
			for (int i = 0;i < randomNumOfIntegers; i++)
			{
				int insert = ( (int)(Math.random() * 100) );
				s1.writeInt( insert);
				System.out.println(insert);
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
		
		try (DataInputStream r1 = new DataInputStream(new BufferedInputStream(new FileInputStream(file1))))
		{
			int numberOfInt = r1.available() / 4;	//1 int is 4 bytes
			for (int i = 0;i < numberOfInt;i++)
			{
				sum+=r1.readInt();
			}
			System.out.println("sum: " + sum);
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
	}

}
