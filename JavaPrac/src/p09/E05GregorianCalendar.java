package p09;

import java.util.GregorianCalendar;

public class E05GregorianCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar c1 = new GregorianCalendar();
		int currentYear = c1.get(GregorianCalendar.YEAR);
		int currentMonth = c1.get(GregorianCalendar.MONTH)+1;
		int currentDay = c1.get(GregorianCalendar.DAY_OF_MONTH);
		
		System.out.println(currentMonth + " / " + currentDay + " / " + currentYear);
		c1.setTimeInMillis(123456789765L);
		currentYear = c1.get(GregorianCalendar.YEAR);
		currentMonth = c1.get(GregorianCalendar.MONTH)+1;
		currentDay = c1.get(GregorianCalendar.DAY_OF_MONTH);
		
		System.out.println(currentMonth + " / " + currentDay + " / " + currentYear);
	}

}
