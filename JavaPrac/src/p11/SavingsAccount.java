package p11;

import p09.Account;

public class SavingsAccount extends Account {

	private static final double withdrawLimit = 0;
	
	SavingsAccount() {
	}
	
	SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	
	@Override
	public void withdraw(double amount)
	{
		if ((amount) >= withdrawLimit)
			this.setBalance(this.getBalance()-amount);
		System.out.println("withdraw: balance> " + this.getBalance());
	}
	
	@Override
	public String toString()
	{
		return "balance: " + this.getBalance();
	}
	
}
