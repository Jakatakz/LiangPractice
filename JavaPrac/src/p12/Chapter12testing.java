package p12;

public class Chapter12testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try 
		{
		Loan loan1 = new Loan();
		System.out.println(loan1.toString());
		System.out.println(loan1.getAnnualInterestRate() + "\n" + loan1.getLoanAmount() + "\n" + loan1.getNumberOfYears());
		Loan loan2 = new Loan(0,0,0);
		System.out.println(loan2.toString());
		System.out.println(loan2.getAnnualInterestRate() + "\n" + loan2.getLoanAmount() + "\n" + loan2.getNumberOfYears());
		} catch (IllegalArgumentException ex)
		{
			ex.printStackTrace();
			System.out.println("testcaught");
		}
		
	}

}
