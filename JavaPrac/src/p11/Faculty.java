package p11;

public class Faculty extends Employee{

	private double officeHours = 0;
	private String rank = "none";
	
	protected static final int LECTURER = 1;
	protected static final int ASSISTANT_PROFESSOR = 2;
	protected static final int ASSOCIATE_PROFESSOR = 3;
	protected static final int PROFESSOR = 4;
	
	Faculty() {
	}
	
	Faculty(double officeHours, String rank) {
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public double getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(double officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "Faculty " + this.getName();
	}
	
	
}
