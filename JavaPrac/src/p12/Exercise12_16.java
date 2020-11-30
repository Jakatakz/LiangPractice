package p12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_16 {

	
	//revise program to save the changes into the original file
	public static void main(String[] args) throws Exception {
	    // Check command line parameter usage
	    if (args.length != 3) {
	      System.out.println(
	        "Usage: java ReplaceText sourceFile  oldStr newStr");
	      System.exit(1);
	    }

	    // Check if source file exists
	    File sourceFile = new File(args[0]);
	    if (!sourceFile.exists()) {
	      System.out.println("Source file " + args[0] + " does not exist");
	      System.exit(2);
	    }

	    String saveString = "";
	    try 
	    {        
	    Scanner input = new Scanner(sourceFile);
	      while (input.hasNext()) {
	        String s1 = input.nextLine();
	        String s2 = s1.replaceAll("\\b"+args[1]+"\\b", args[2]);
	        saveString += s2 + " \n";
	        System.out.println("1: " + saveString);
	      }
	      input.close();
	      PrintWriter output = new PrintWriter(sourceFile);	//this truncates file to zero if file already exists
	      output.print(saveString);
	      output.close();
	    } catch (FileNotFoundException ex)
	    {
	    	ex.printStackTrace();
	    }
	    System.out.println("2: " + saveString + "\nfile size: " + sourceFile.length());
//	    try
//	    {
//	    	System.out.println("3: " + saveString  + "\nfile size: " + sourceFile.length());
//	    	PrintWriter output = new PrintWriter(sourceFile);	//this truncates file to zero if file already exists
//	    	output.append(saveString);
//	    	System.out.println("4: " + saveString  + "\nfile size: " + sourceFile.length());
//	    }
//	    catch (FileNotFoundException ex)
//	    {
//	    	ex.printStackTrace();
//	    }
	  }

}
