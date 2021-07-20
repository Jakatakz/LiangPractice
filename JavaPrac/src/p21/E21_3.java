package p21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class E21_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file1 = new File(args[1]);
		if (!file1.exists()) {
			System.out.println("file doesn't exist...exiting");
			System.exit(1);
		}
		else {
			System.out.println("file exists");
		}
		
		try {
			file1.createNewFile();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file1)))) {
			String strRead;
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			
			LinkedHashMap<String, String> Map1 = new LinkedHashMap<>();
			while ((strRead = in.readLine()) != null) {
				sb1.append(strRead);
				attendance(sb1,sb2);
			}
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
			
	}
	
	static void attendance(StringBuilder sb1, StringBuilder sb2) {
		int length = sb1.length();
		String strRaw = sb1.toString();
		String[] fullName = strRaw.split("\\d[0-9]");
		String[] attendanceDaysStringArray = strRaw.split("\\w[A-z]");
		int attendanceDays = Integer.parseInt(attendanceDaysStringArray.toString());
		System.out.println("testing attendanceDays integer");
		System.out.println(attendanceDays);
		System.out.println("end testing attendanceDays integer");
		System.out.println("testing fullName...");
		for (String a: fullName)
			System.out.println(a);
		System.out.println("end testing fullName");
		String firstName = fullName[0];
		String lastName = fullName[1];
		
		
	
		//alpha arrow 0
	}
	
	
	
	
	

}
