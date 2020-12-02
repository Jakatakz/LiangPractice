package p12;

public class Exercise12_17 {
	public static void main(String[] args) {
		//create game
		String defaultTextFile = "Exercise1217Hangmantext.txt";	//already created file
		/*
		 * words to test inside the file
		   Toad
		   Abode
		   Cat
		   Simple Words
		   three words total
		   test
		 */
		Exercise12_17Hangman game1 = new Exercise12_17Hangman(defaultTextFile);
	}

}
