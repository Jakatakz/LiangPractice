package p11;

import java.util.ArrayList;
import java.util.Scanner;
public class RepeatAdditionQuiz11_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//rewrite listing 55.1 to alert the user if an answer is entered again, (use an array list to store answers)
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		System.out.println("what is " + number1 + " + " + number2 +"?");
		ArrayList<Integer> wrongAnswers = new ArrayList<>();
		int answer = input.nextInt();
		while (number1 + number2 != answer) {
			if (wrongAnswers.contains(answer))
			{
				System.out.println("you've already used " + answer);
				answer = askAgain(number1, number2, input);
			}
			else
			{
				wrongAnswers.add(answer);
				answer = askAgain(number1, number2, input);
			}
			
			//int answer = input.nextInt();
		}
		
		System.out.println("correct");
	}
	
	public static int askAgain(int number1, int number2, Scanner input) {
		System.out.println("wrong answer, try again, what is " + number1 + " + " + number2 + "?");
		return input.nextInt();
	}

}
