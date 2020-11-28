package p11;

public class Student extends Person {

	protected static final String FRESHMAN = "Freshman";
	protected static final String SOPHMORE = "Sophmore";
	protected static final String JUNIOR = "Junior";
	protected static final String SENIOR = "Senior";
	
	protected static final String[] statusArray = {"Freshman", "Sophmore", "Junior", "Senior"};
	
	protected String status = "none";
	
	Student(){
	}
	
	Student(String name, String status) {
		super(name);
		if (statusCheck(status) == true)
			this.status = status;
		else
			this.status = "none";
	}

	public boolean statusCheck(String status)
	{
		boolean result = false;
		System.out.println("beforeresult: " + result);
		for (int i = 0; i < statusArray.length; i++)
		{
			if (status.equals(statusArray[i]))
				result = true;
		}
		System.out.println("afterresult: " + result);
		return result;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (statusCheck(status) == true)
			this.status = status;
		else
			this.status = "none";
	}
	
	@Override
	public String toString() {
		return "Student " + this.getName();
	}
	
	
}
