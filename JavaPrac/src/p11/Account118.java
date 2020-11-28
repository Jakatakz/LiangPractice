package p11;

import java.util.ArrayList;
import java.util.Date;

public class Account118 {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	private String name;
	private ArrayList<Transaction> transactions;
	
	public Account118()
	{
		dateCreated = new Date();
		transactions = new ArrayList<>();
	}
	
	public Account118(int id, double balance)
	{
		this();
		this.id = id;
		this.balance = balance;
	}
	
	public Account118(String name, int id, double balance) {
		this(id, balance);
		this.name = name;
	}
	
	public String getName() {
		return name;
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
		transactions.add(new Transaction('W', amount, newBalance, "description : withdraw"));
	}
	
	public void deposit(double amount)
	{
		
		double newBalance = getBalance() + amount;
		setBalance(newBalance);
		transactions.add(new Transaction('D', amount, newBalance, "description: deposit"));
	}
	
	public void displayTransactions() {
		String display = "All transactions:\n";
		for (Transaction a: transactions)
			 display += a.toString() + "\n";
		System.out.println(display);
	}
	
	//account summary
	@Override
	public String toString()
	{
		return "Account Summary\nbalance: " + getBalance() + ", monthly interest: " + getMonthlyInterest() 
		+ ", monthly interest rate: " + getMonthlyInterestRate() + ", " + getDateCreated() + "\n\nAccount Summary\nname: " + getName()
		+"\ninterest rate: annual->" + getAnnualInterestRate() + " , monthly -> " + getMonthlyInterestRate() + "\nbalance: " + getBalance();
		
	}
	
	
	
	
}
