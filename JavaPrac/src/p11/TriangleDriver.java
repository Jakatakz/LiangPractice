package p11;

import java.util.Scanner;

import p12.IllegalTriangleException;

public class TriangleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter three sides of the triangle: ");
		Scanner input = new Scanner(System.in);
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		try 
		{
			Triangle t1 = new Triangle(side1, side2, side3);
			System.out.println("enter a color, boolean value indicating whether" 
					+ " the triangle is filled with color");
			String color = input.next();
			t1.setColor(color);
			t1.setFilled(input.nextBoolean());
			System.out.println(t1);
			System.out.println(t1.getArea());
			System.out.println(t1.getPerimeter());
		} catch (IllegalTriangleException ex)
		{
			ex.printStackTrace();
			System.out.println("testcaught");
		}
		
	}

}
