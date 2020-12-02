package p12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * programming exercise 7.35
 * Write a hangman game that randomly generates a word and
prompts the user to guess one letter at a time, as presented in the sample run.
Each letter in the word is displayed as an asterisk. When the user makes a correct
guess, the actual letter is then displayed. When the user finishes a word, display
the number of misses and ask the user whether to continue to play with another
word. Declare an array to store words, as follows:
// Add any words you wish in this array
String[] words = {"write", "that",...};

programming exercise 12.17
Rewrite Programming Exercise 7.35. The program reads the
words stored in a text file named hangman.txt. Words are delimited by spaces.
 */


public class Exercise12_17Hangman {

	File hangmanWordsFile;
	ArrayList<String> hangmanWords;
	
	Exercise12_17Hangman()
	{
		this("no file");
	}
	
	Exercise12_17Hangman(String fileName)
	{
		hangmanWordsFile = new File(fileName);
		if (!hangmanWordsFile.exists())
		{
			System.out.println("file doesn't exist, exiting game...");
			System.exit(1);
		}
		else
			startGame();
	}
	
	public void startGame()
	{
		hangmanWords = getWordsFromHangmanTextFile(hangmanWordsFile);
		System.out.println("size of hangmanWords arraylist: " + hangmanWords.size());
		System.out.println("starting game...");
		Scanner input = new Scanner(System.in);
		prompt(hangmanWords, input);
		boolean playMore = true;
		do
		{
		System.out.println("inside startgame do method, : -> playAgain=");
		System.out.println("would you like to play again with another word? y n");

		String answerQ1 = input.next();
		char playAgain = answerQ1.charAt(0);
		System.out.println("actualplayagain="+playAgain);
		if (playAgain  == 'y')
		{
			prompt(hangmanWords, input);
			System.out.println("true=continue!? playmore = : " + playMore);
		}
		else
		{
			playMore = false;
			System.out.println("exiting game...");
		}
		} while (playMore);
		//generate random word
		
		//prompt user to guess 1 letter at a time, each letter is ddisplayed as *, each correct guess reveals letter
		
		//when user finishes a word, display # of misses, ask user whether continue to play with another word
	}
	
	//asterisk the word
	public StringBuilder getAsteriskWord(String randomWord)
	{
		int wordLength = randomWord.length();
		StringBuilder asteriskWord = new StringBuilder();
		for (int i = 0; i < wordLength; i++)
			asteriskWord.append('*');
		return asteriskWord;
	}
	
	public void prompt(ArrayList<String> hangmanWords, Scanner input)
	{
		ArrayList<String> usedStringWordsFromFile = new ArrayList<>();
		//String randomWord = getRandomWord(hangmanWords);
		String randomWord;
		do 
		{
			randomWord = getRandomWord(hangmanWords);
		} while (usedStringWordsFromFile.contains(randomWord));
		usedStringWordsFromFile.add(randomWord);
		
		System.out.println("The word is: " + randomWord);
		
		StringBuilder asteriskWord = getAsteriskWord(randomWord);
		System.out.println("Guess the word: " + asteriskWord + ", one letter at a time");
		
		int numberWrongGuesses=0; //6 loses the game
		
		boolean Solved = true;
		//Scanner input = new Scanner(System.in);
		
		//displays # of misses, reveals letters from asterisks
		while (numberWrongGuesses != 6 && Solved)
		{
			System.out.println("guess next letter");
			char guess = input.next().charAt(0);
			
			numberWrongGuesses += checkGuess(guess, randomWord, asteriskWord);
	
			if (asteriskWord.toString().equals(randomWord))
			{
				System.out.println("solved\nnumber wrong: " + numberWrongGuesses);
				Solved = false;
			}
		System.out.println(asteriskWord);
		}
		//input.close();
		
		
		
	}
	
	//alter asterisk covered word if guess is correct, return if guess is wrong and increment hangmanLoss
	public int checkGuess(char guess, String randomWord, StringBuilder asteriskWord)
	{
		int wrong = 1;
		System.out.println("checkguess");
		for (int i = 0; i < randomWord.length(); i++)
		{
			if (guess == (randomWord.charAt(i)))
			{
				System.out.println("correct guess");
				asteriskWord.setCharAt(i, guess);
				wrong = 0;
			}
			
			
			
		}
		System.out.println(wrong + " wrong");
		return wrong;
	}
	
	//get word/random word from file 
	public ArrayList<String> getWordsFromHangmanTextFile(File hangmanWordsFile) 
	{
		String returnWord;
		ArrayList<String> stringWords = new ArrayList<>();
		Scanner input = null;
		try
		{
			input = new Scanner(hangmanWordsFile);
			while (input.hasNext())
			{
				 stringWords.add(input.next());//could check its a word with regex
			}
		} catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			input.close();
		}
		return stringWords;
	}
	
	//get random word
	public String getRandomWord(ArrayList<String> stringWords)
	{
		Random rnd = new Random();
		return stringWords.get(rnd.nextInt(stringWords.size()));
		//return stringWords.get(rnd.nextInt());
	}
	
	
}
