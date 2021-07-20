package p20;

public class p20tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List<String> cities 
		= java.util.Arrays.asList("Atlanta", "Savannah", "New york", "Dallas");
		
		cities.sort((s1,s2) -> s1.compareToIgnoreCase(s2));
		
	}

}
