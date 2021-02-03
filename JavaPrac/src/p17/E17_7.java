package p17;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class E17_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//read from E17_08.dat file, accidently named E17_6 file to be E17_08.dat
		File file1 = new File("E17_08.dat");
		double loanAmountTotal = 0;
		try (ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(file1)))
		{
				Loan17_6 loan;
				while ((loan = (Loan17_6)in1.readObject()) != null)
				{
					loanAmountTotal += loan.getLoanAmount();
				}
			
		}
		catch (EOFException ex)
		{
			System.out.println("eof");
			System.out.println("loanAmountTotal: " + loanAmountTotal);
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
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
