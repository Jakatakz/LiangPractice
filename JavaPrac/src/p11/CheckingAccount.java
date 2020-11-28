package p11;

import p09.Account;

public class CheckingAccount extends Account {

	private static final double withdrawLimit = 500;
	
	CheckingAccount() {
	}
	
	CheckingAccount(int id, double balance) {
		super(id,balance);
	}
	
	@Override
	public void withdraw(double amount) {
		if ((amount) <= withdrawLimit)
			this.setBalance(this.getBalance()-amount);
		else
			System.out.println("can't exceed withdrawLimit: 500");
		
		System.out.println("after withdraw in checkingAcct: " + this.getBalance());
	}
	
	@Override
	public String toString()
	{
		return "balance: " + this.getBalance();
	}
}
