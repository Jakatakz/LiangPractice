package p11;

import java.util.ArrayList;

public class Exercise11_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> charList1 = new ArrayList<>();
		charList1.addAll(toCharacterArray("watever"));
		System.out.println("charlist1\n"+ charList1.toString());
		
	}
	
	public static ArrayList<Character> toCharacterArray(String s) {
		ArrayList<Character> charList = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			charList.add(s.charAt(i));
		}
		return charList;
	}

}
