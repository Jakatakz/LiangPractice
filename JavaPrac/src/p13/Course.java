package p13;
public class Course implements Cloneable {
  private String courseName;
  private String[] students = new String[4];
  private int numberOfStudents;
    
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  public void addStudent(String student) {
    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  public String[] getStudents() {
    return students;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }  

  public String getCourseName() {
    return courseName;
  }  
  
  public void dropStudent(String student) {
    // Left as an exercise in Exercise 10.9
  }
  
  @Override
  public Object clone()
  {
	  Course c1 = null;
	  try {
		c1 = (Course)super.clone();
		c1.students = students.clone(); //the array is set to new String[4] so a new string is deep copied
		c1.courseName = new String(courseName);//deep copy
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return c1;
  }
}