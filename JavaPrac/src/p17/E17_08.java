package p17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class E17_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file1 = new File("E17_08Actual.dat");
		try (RandomAccessFile r1 = new RandomAccessFile(file1, "rw"))
		{
			int count = (r1.length() !=0) ? r1.readInt() + 1 : 1;
			r1.seek(0);
			r1.writeInt(count);
			System.out.println("count" + count);
			System.out.println("length: " + r1.length());
			System.out.println(file1.length());
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}

}
