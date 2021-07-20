package p20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p20_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file1 = new File("targetFile1");
		String s = "";
		
		try {
			boolean fileCreatedFlag = file1.createNewFile();
			System.out.println("flag: " + fileCreatedFlag);
		} catch (IOException ex)
		{
			ex.printStackTrace();
		}

		//System.out.println("Delete contents of file?...can implement if needed otherwise ignore");
		
		if (file1.length() == 0) {
			try (PrintWriter printer1 = new PrintWriter(file1)) {
				printer1.print("duplicates allowed alpha beta gamma + \n foxtrot charlie");
				
			} catch (FileNotFoundException ex)
			{
				ex.printStackTrace();
			}
		}
		else {
			//else read from file
			try (Scanner reader1 = new Scanner(file1)) {
				while (reader1.hasNextLine()) 
				{
					s += reader1.nextLine();
				}
			} catch (FileNotFoundException ex)
			{
				ex.printStackTrace();
			}
		}
		
		//coulda just done a void method but i suppose if i wanted to use the list elsewhere.
		System.out.println(displayWords(s));
		
	}
	
	//method - words must start with a letter.
	/*
	 * static String[] checkStartWithLetter(String[] s) { int count = 0; String[]
	 * sReturn = new String[s.length]; for (int i = 0; i < s.length; i ++) {
	 * System.out.println("count: " + count); count++; if
	 * (Character.isLetter(s[i].charAt(0))) sReturn[i] = s[i]; } return sReturn; }
	 */
	
	//method - display all the words (duplicates allowed) in alphabetical order)
	static ArrayList<String> displayWords(String s) {
		ArrayList<String> listS = new ArrayList<>();
		String[] sArray = s.split(" ");
		for (String a: sArray)
			System.out.print(a + " ");
		//method - word must start with a letter
		//sArray = checkStartWithLetter(sArray);
		for (String a: sArray) {
			listS.add(a);
		}
		System.out.println("list before sorting descendding alphabetical order");
		System.out.println(listS.toString());
		Collections.sort(listS, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		System.out.println("After\n" + listS.toString());
		return listS;
	}

}
