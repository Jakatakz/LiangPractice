package p21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class E21_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//display in ascending order, names of those students who have attended at least 1 day of the course
		
		//text file(s) is/are passed as command line arguments
		String arg1 = args[1];
		File file1 = new File(arg1);
		if (file1.exists())
			System.out.println("file exists");
		try {
			file1.createNewFile();
			System.out.println("file created");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file1)))) {
			System.out.println("inside try resources");
			int count = 0;
			LinkedHashSet<String> mapAttendance = new LinkedHashSet<>();
			//System.out.println("file length: " + file1.length());
			String linex;
			while ((linex = in.readLine()) != null)
			{
				//String linex = in.readLine();
				System.out.println("linex: " + linex);
				//testLinex(linex);
				attendedAtLeastOneCourseIncrement(linex, mapAttendance);
				//String[] strNumberOfDays = linex.split("[a-z]");
				//String[] strNames = linex.split("[0-9]");
				count++;
			}
			System.out.println("count: " + count);
			System.out.println("Students who have attended at least one day of the course: " + mapAttendance);
			
		} catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}
	
	static void testLinex(String linex) {
		String[] strNumberOfDays = linex.split("[a-z]");
		StringBuilder sbNumberOfDays = new StringBuilder();
		for (String a: strNumberOfDays)
			sbNumberOfDays.append(a);
		String newerString = sbNumberOfDays.toString();
		System.out.println(newerString + " adsfasdfasdfasdfsadf");
		System.out.println("sb = " + sbNumberOfDays);
		System.out.println(strNumberOfDays.toString());
		String[] strNames = linex.split("[0-9]");
		System.out.println("testing...");
		for (String a: strNumberOfDays)
			System.out.print(a);
		System.out.println("\n--------");
		for (String a: strNames)
			System.out.println(a);
	}
	
	static void attendedAtLeastOneCourseIncrement(String linex, LinkedHashSet<String> mapAttendance) {
		String[] strNumberOfDays = linex.split("[a-z]");
		StringBuilder sbNumberOfDays = new StringBuilder();
		for (String a: strNumberOfDays)
			sbNumberOfDays.append(a);
		String newNumberOfDaysString = sbNumberOfDays.toString().trim();
		//System.out.println("Newnumberofdaaysstring: " + newNumberOfDaysString);
		int numberOfDays = Integer.parseInt(newNumberOfDaysString);
		//System.out.println("numberOFDAYS: " + numberOfDays);
		String[] strName = linex.split("[0-9]");
		StringBuilder sbStrName = new StringBuilder();
		for (String a: strName)
			sbStrName.append(a);
		String newStrName = sbStrName.toString().trim();
		//String name = strName.toString().trim();
		if (numberOfDays>=1) {
			mapAttendance.add(newStrName);
		}
		System.out.println(mapAttendance);
			
		
	}

}
