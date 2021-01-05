package p13;

import java.util.Scanner;

public class Exercise13_1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//prompt user to enter 
		System.out.println("enter a triangle with three sides: ");
		try (Scanner input = new Scanner(System.in))
		{
			double side1 = 0;
			double side2 = 0;
			double side3 = 0;
			boolean exitCase = true;
			
			String color;
			boolean isFilled = false;
			
			while (exitCase)
			{
				
				if (input.hasNextDouble())
				{
				for (int i = 1; i <= 3; i++)
				{
					
					if (i == 1)
					{
						System.out.println("entered side " + i + ":");
						side1 = input.nextDouble();
						System.out.println("side1: " + side1);
					}
					else if (i == 2)
					{
						System.out.println("enter side " + i + ":");
						side2 = input.nextDouble();
						System.out.println("side2: " + side2);
					}
					else
					{
						System.out.println("enter side " + i + ":");
						side3 = input.nextDouble();
						System.out.println("side3: " + side3);
						exitCase = false;
						System.out.println("exiting");
					}
				}
			}
			}
				System.out.println("side1: " + side1);
			System.out.println("what color do you want the triangle to be: (i.e. white(default), blue, green, yellow, red, black, purple)");
			color = input.next();
			System.out.println("do you want the triangle to be filled with this color? enter y/n");
			String answer = input.next();
			if (answer.charAt(0) == 'y')
				isFilled = true;
			else 
			{
				if (answer.charAt(0) == 'n')
					isFilled = false;
			}
			
			
			//my area formula i guess is wrong
			Exercise13_1Triangle t1 = new Exercise13_1Triangle(side1, side2, side3, color, isFilled);
			System.out.println("area: " + t1.getArea() + "\nperimter: " + t1.getPerimeter() + "\ncolor: " + t1.getColor() + "\nis Filled? " + t1.isFilled());
		}
		//3 sides of a triangle
		//a color
		//boolean value to indiciate if filled or not
		
	}

}
