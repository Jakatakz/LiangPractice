package p11;

public class Staff extends Employee {

	private String title;
	
	protected static final String title1 = "title 1";
	protected static final String title2 = "title 2";
	protected static final String title3 = "title 3";
	
	Staff() {
	}
	
	Staff(String name) {
		this(name, "none");
	}
	
	Staff(String name, String title) {
		super(name);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Staff " + this.getName();
	}
	
}
