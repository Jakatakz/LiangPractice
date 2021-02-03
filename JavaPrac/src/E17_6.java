import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import p17.Loan17_6;

public class E17_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loan17_6 loan1 = new Loan17_6();
		Loan17_6 loan2 = new Loan17_6();
		Loan17_6 loan3 = new Loan17_6();
		Loan17_6 loan4 = new Loan17_6();
		Loan17_6 loan5 = new Loan17_6();
		
		File file1 = new File("E17_08.dat");
		
		try (ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream(file1)))
		{
			out1.writeObject(loan1);
			out1.writeObject(loan2);
			out1.writeObject(loan3);
			out1.writeObject(loan4);
			out1.writeObject(loan5);
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
