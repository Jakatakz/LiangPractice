package p11;

import p09.Account;

public class Exercise113Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acct1 = new Account();
		CheckingAccount chekAcct1 = new CheckingAccount();
		SavingsAccount savAcct1 = new SavingsAccount();
		
		acct1.deposit(5000);
		System.out.println(acct1);
		chekAcct1.deposit(5000);
		chekAcct1.withdraw(501);
		chekAcct1.withdraw(500);
		chekAcct1.withdraw(499);
		System.out.println(chekAcct1);
		savAcct1.deposit(5000);
		savAcct1.withdraw(235);
		savAcct1.withdraw(1000);
		System.out.println(savAcct1);
		
		
	}

}
