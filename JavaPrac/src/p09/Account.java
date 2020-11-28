package p09;

import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account()
	{
		dateCreated = new Date();
	}
	
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate / 100;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate()
	{
		return (getAnnualInterestRate() / 12);
	}

	public double getMonthlyInterest()
	{
		return balance * getMonthlyInterestRate();
	}
	
	public void withdraw(double amount)
	{
		double newBalance = getBalance() - amount;
		setBalance(newBalance);
	}
	
	public void deposit(double amount)
	{
		double newBalance = getBalance() + amount;
		setBalance(newBalance);
	}
	
	@Override
	public String toString()
	{
		return "balance: " + getBalance() + ", monthly interest: " + getMonthlyInterest() 
		+ ", monthly interest rate: " + getMonthlyInterestRate() + ", " + getDateCreated();
		
	}
	
	
	
	
}
