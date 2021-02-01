package p17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E17_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file1 = new File("Exercise17_03.dat");
		try
		{
			double sum = 0;
			int numberOfFloatingPoints = (int)(Math.random()  * 100);
			System.out.println(numberOfFloatingPoints);
		
			try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file1))))
			{
				
				for (int i = 0 ; i < numberOfFloatingPoints; i ++)
				{
					output.writeDouble((double)(Math.random() * 100));
				}
			}
			
			try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file1) )))
			{
				
				while (true)
				{
					sum += input.readDouble();
					System.out.println(sum);
				}
				
			}

		
		
		
		} catch (EOFException ex)
		{
			ex.printStackTrace();
		} catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		}
}
