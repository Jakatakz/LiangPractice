package p11;
import java.util.Collections;
import java.util.Scanner;
public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter 5 strings and display them in reverse order");
		MyStack ms1 = new MyStack();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i ++) 
			ms1.push(input.nextLine());
		System.out.println(ms1.toString());
		Collections.reverse(ms1);
		System.out.println(ms1.toString());
		
	}

}
