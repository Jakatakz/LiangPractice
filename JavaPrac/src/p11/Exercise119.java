package p11;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;
public class Exercise119 {

	public static void main(String[] args) {
	
		//use two array lists to store row and column indices with the most 1's
		System.out.println("enter the array size n : " );
		Scanner input = new Scanner(System.in);
		int arraySize = input.nextInt();
		int[][] rngArray = createMatrixNxN(arraySize);
		displayMatrixNxN(rngArray);
	
		ArrayList<Integer> largestRows = new ArrayList<>();
		ArrayList<Integer> largestColumns = new ArrayList<>();
		//rows with most 1's
		findLargestRowIndex(rngArray, largestRows);
		System.out.println(largestRows.isEmpty());
		System.out.println("largest row index's: " + largestRows);
		findLargestColumnIndex(rngArray, largestColumns);
		System.out.println("largest column index's: " + largestColumns);
		
	}
	
	public static int[][] createMatrixNxN(int arraySize) {
		int[][] rngArray = new int[arraySize][arraySize];
		for (int i= 0; i < rngArray.length; i++) {
			for (int k = 0; k < rngArray[i].length; k++) {
				rngArray[i][k] = (int)((Math.round(Math.random())));
				System.out.print("-" + rngArray[i][k]);
			}
			System.out.println();
		}
		return rngArray;
	}
	
	public static void displayMatrixNxN(int[][] rngArray) {
		System.out.println("display: \n");
		for (int i = 0; i < rngArray.length; i++) {
			for (int k = 0; k < rngArray[i].length; k++) {
				System.out.print(rngArray[i][k]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void findLargestColumnIndex(int[][] rngArray, ArrayList<Integer> largestColumn) {
		int mostNumberOfOnes = 0;
		int numberOfOnes;
		
		for (int k = 0; k < rngArray.length; k++) {
			numberOfOnes = 0;
			for (int i = 0; i < rngArray[k].length; i++) {
				//System.out.println("check k: " + k);
				//System.out.println("check i: " + i);
				if (rngArray[i][k] == 1)
					numberOfOnes++;
			}
			if (numberOfOnes >= mostNumberOfOnes)
				mostNumberOfOnes = numberOfOnes;
		}
		
		//find the columns with mostNumberOfOnes and add to largestColumns arraylist
		for (int k = 0; k < rngArray.length; k++) {
			numberOfOnes = 0;
			for (int i = 0; i < rngArray[k].length; i++ ) {
				if (rngArray[i][k] == 1)
					numberOfOnes++;
			}
			if (numberOfOnes == mostNumberOfOnes)
				largestColumn.add(k);
		}
		
	}

	
	public static void findLargestRowIndex(int[][] rngArray, ArrayList<Integer> largestRows) {
		int mostNumberOfOnes = 0;
		int numberOfOnes = 0;
		
		for (int i = 0; i < rngArray.length; i++) {
			numberOfOnes = 0;
			for (int k = 0; k < rngArray[i].length; k++) {
				if (rngArray[i][k] == 1) {
					numberOfOnes++;
				}
			}
			if (numberOfOnes >= mostNumberOfOnes)
				mostNumberOfOnes = numberOfOnes;
		}
		System.out.println("most: " + mostNumberOfOnes);
		System.out.println("numberOfOnes: " + numberOfOnes);
		//find rows with mostNumberOfOnes and add to largestRows arraylist
		for (int i = 0; i < rngArray.length; i++) {
			numberOfOnes = 0;
			for (int k = 0; k < rngArray[i].length; k++) {
				if (rngArray[i][k] == 1) {
					numberOfOnes++;
				}
			}
			if (numberOfOnes == mostNumberOfOnes)
				largestRows.add(i);
				//largestRows.add(rngArray[i][0]);
		}
	}
}
