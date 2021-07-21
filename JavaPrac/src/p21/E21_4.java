package p21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class E21_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a text file name");
		Scanner input = new Scanner(System.in);
		String textFileName = input.nextLine();
		File file1 = new File(textFileName);
		if (!file1.exists()) {
			System.out.println("file doesn't exist...exiting");
			System.exit(1);
		}
		
		HashSet<Character> vowelsSet = new HashSet<>(Arrays.asList('A','E','I','O', 'U'));
		
		try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file1)))) {
			int countConsonants = 0;
			int countVowels = 0;
			int chk;
			while ( (chk = in.read()) != -1) {
				char ch = (char) chk;
				if (Character.isLetter(ch)) {
					if (vowelsSet.contains(Character.toUpperCase(ch))) {
						countVowels++;
					}
					else
						countConsonants++;
				}
			}
			System.out.println("# of vowels: " + countVowels + "\n#of consonants: " + countConsonants);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}

}
