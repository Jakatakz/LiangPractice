package p11;

import java.util.Date;

public class Employee extends Person {

	private String office;
	private double Salary;
	private Date dateHired;
	
	Employee() {
	}
	
	Employee(String name) {
		super(name);
	}
	
	Employee(String name, String office, double Salary, Date datehired) {
		super(name);
		this.office = office;
		this.Salary = Salary;
		this.dateHired = datehired;
	}
	
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
	
	@Override
	public String toString() {
		return "Employee " + this.getName();
	}
	
	
}
