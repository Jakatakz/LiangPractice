package p13;

public class E13_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course c1 = new Course("Math");
		c1.addStudent("joe");
		Course c2 = (Course)c1.clone();
		c1.addStudent("bob");
		
		
		System.out.println("c1\ncourseName: " + c1.getCourseName() + "\n" 
				+ c1.getStudents() +"\n#ofstudents: " + c1.getNumberOfStudents());
		
		System.out.println("c2\ncourseName: " + c2.getCourseName() + "\n" 
				+ c2.getStudents()+"\n#ofstudents: " + c2.getNumberOfStudents());
		
		System.out.println(c1.getStudents()==c2.getStudents());
		System.out.println(c1==c2);
		System.out.println(c1.getCourseName()==c2.getCourseName());
	}

}
