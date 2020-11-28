package p09;

import java.util.Random;

public class E04Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r1 = new Random(1000);
		for (int i = 0; i < 50;i ++)
		{
			System.out.print(r1.nextInt(100) + " ");
		}
		
	}

}
