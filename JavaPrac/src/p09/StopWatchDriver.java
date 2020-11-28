package p09;

import java.util.Random;

public class StopWatchDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rng1 = new Random();
		int[] array1 = new int[100000];
		for (int i = 0; i < 100000; i ++)
		{
			array1[i] = rng1.nextInt();
		}
		
		StopWatch sw1 = new StopWatch();
		sw1.start();
		//sort 100k numbers using selection sort
		for (int k = 0; k < array1.length-1; k++)
		{
			int min = array1[k];
			int minIndex = k;
			for (int i = k+1; i < array1.length; i++)
			{
				if (min > array1[i])
				{
					min = array1[i];
					minIndex = i;
				}
			}
			
			if (minIndex != k)
			{
				array1[minIndex] = array1[k];
				array1[k] = min;
			}
			
		}
		
		
		
		sw1.stop();
		System.out.println(sw1.getElapsedTime());
		
	}

}
