package p11;

import java.util.Date;

public class exercise112Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();
		Person person2 = new Person("jack");
		System.out.println(person1);
		System.out.println(person2);
		System.out.println("address: " + person1.getAddress());
		System.out.println("address: " + person2.getAddress());
		person1.setPhoneNumber("32342535");
		person2.setPhoneNumber("555-555-5555");
		System.out.println(person1.getPhoneNumber());
		System.out.println(person2.getPhoneNumber());
		System.out.println(person1.getEmailAddress());
		System.out.println(person2.getEmailAddress());
		System.out.println(person1);
		System.out.println(person2);
		
		System.out.println("\n---\n");
		Student student1 = new Student();
		Student student2 = new Student("jack", "Freshman");
		Student student3 = new Student("Cat", "sophmore");
		
		System.out.println(student1);
		System.out.println("s1 name, status" + student1.getName() +"\n"+student1.getStatus());
		student1.setStatus("bleh");
		System.out.println(student1.getStatus());
		student1.setStatus("Senior");
		System.out.println(student1.getStatus());
		
		System.out.println(student2);
		System.out.println(student2.getStatus());
		System.out.println(student2.getName());
		
		System.out.println(student3);
		System.out.println(student3.getStatus());
		System.out.println(student3.getName());
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee("jack");
		Employee employee3 = new Employee("Cat", "Office 1", 100000.50, new Date());
		
		System.out.println("EMPLOYEE1");
		System.out.println(employee1);
		System.out.println(employee1.getDateHired());
		System.out.println(employee1.getName());
		
		System.out.println("EMPLOYEE2");
		System.out.println(employee2);
		System.out.println(employee2.getDateHired());
		System.out.println(employee2.getName());
		System.out.println(employee2.getSalary());
		System.out.println("EMPLOYEE3");
		System.out.println(employee3);
		System.out.println(employee3.getDateHired());
		System.out.println(employee3.getName());
		
		Faculty fac1 = new Faculty();
		Faculty fac2 = new Faculty(5, "fadfasdf");
		System.out.println(fac1);
		System.out.println(fac1.getName());
	}

}
