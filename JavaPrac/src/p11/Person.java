package p11;

public class Person {

	private String name = "none";
	private String address = "none";
	private String phoneNumber = "000-000-0000";
	private String emailAddress = "none";
	
	Person() {
	}
	
	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}"))
			this.phoneNumber=phoneNumber;
		else
			System.out.println("Phone Number set incorrectly");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String toString() {
		return "Person " + this.getName();
	}
	
	
	
}
