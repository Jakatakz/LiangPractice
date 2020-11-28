package p09;

public class AccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc1 = new Account(1122, 20000);
		acc1.setAnnualInterestRate(4.5);
		acc1.withdraw(2500);
		acc1.deposit(3000);
		System.out.println(acc1.toString());
	}

}
