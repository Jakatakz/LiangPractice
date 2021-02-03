package p17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class E17_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file1 = new File("File17_5.dat");
		int[] arr1 = {1,2,3,4,5,6};
		try (ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream(file1)))
		{
			out1.writeObject(arr1);
			out1.writeObject(new java.util.Date());
			out1.writeDouble(105.);
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
