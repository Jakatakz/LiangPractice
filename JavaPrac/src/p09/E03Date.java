package p09;

import java.util.Date;

public class E03Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1 = new Date();
		for (int i = 0,k=10000; i < 8; i++, k*=10)
		{
			d1.setTime(k);
			System.out.println(d1.toString());
		}
		
	}

}
