package p11;

public class Account118Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account118 acct1 = new Account118("George",1122,1000);
		acct1.setAnnualInterestRate(1.5);
		acct1.deposit(30);
		acct1.deposit(40);
		acct1.deposit(50);
		acct1.withdraw(5);
		acct1.withdraw(4);
		acct1.withdraw(2);
		System.out.println(acct1);
		acct1.displayTransactions();
		
		
	}

}
