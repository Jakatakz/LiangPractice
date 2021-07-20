package p21;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class p21tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="water1fff2";
		String[] str2 = str.split("[0-9]"); //->get words
		String[] str3 = str.split("[a-z]"); //->get numbers
		System.out.println(str);
		for (String a: str2)
			System.out.println(a + ".");
		System.out.println("-------");
		for (String a: str3)
			System.out.println(a + ".");
		
	}

}
