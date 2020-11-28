package p17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class P17_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//welcome.java is basically a .txt file
		//ill just make a random txt file instead.
		File file1 = new File(args[0]);
		File file2 = new File(args[1]);
		String store1 = "";
		if (!file1.exists())
		{
			System.out.println("file doesn't exist to read from");
			System.exit(1);
		}
		try
		{
			file2.createNewFile();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		
		try (Scanner input = new Scanner(new BufferedInputStream(new FileInputStream(file1)));
				DataOutputStream dos1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file2)))) 
		{
			while (input.hasNextLine())
			{
				store1 += input.nextLine();
			}
			System.out.println("length of " + args[0] + ": " + file1.length());
			System.out.println("string: " + store1);
			
			dos1.writeUTF(store1);
			System.out.println(file2.getAbsolutePath());
			System.out.println(dos1.size());
			System.out.println("file2 length " + file2.length());
			
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		} catch (IOException e) {	//closeable interface
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("outside " + file2.length());
	}

}
