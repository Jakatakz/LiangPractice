//package p13;
//
//import java.util.Scanner;
//public class P13TriangleTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		System.out.println("enter 3 sides of a triangle, a color, and a boolean value to indicate "
//				+ "if the triangle is filled");
//		double[] side = new double[3];
//		String color = "WHITE";
//		boolean isFilled = false;
//		
//		Scanner input = new Scanner(System.in);
//		for (int i = 0; i < 3; i ++)
//		{
//			System.out.println("enter side " + i + "");
//			while (!input.hasNextDouble())
//			{
//				input.next();
//				System.out.println("enter a double");
//			}
//			side[i] = input.nextInt();
//		}
//		System.out.println("enter a color");
//		while(!input.hasNext("[a-zA-Z]+"))
//		{
//			input.next();
//			System.out.println("enter a-zA-z, a color.");
//		}
//		color = input.next();
//		
//		System.out.println("enter true if triangle is filled with the color, otherwise enter false");
//		while(!input.hasNextBoolean())
//		{
//			input.next();
//			System.out.println("enter true if triangle is filled with color, otherwise false");
//		}
//		isFilled = input.nextBoolean();
//		
//		//System.out.println(side[1]);
//		P13Triangle t1 = new P13Triangle(side[0], side[1], side[2]);
//		t1.setColor(color);
//		t1.setFilled(isFilled);
//		System.out.println(t1.getArea());
//		System.out.println(t1.getPerimeter());
//		System.out.println(t1.getColor());
//		System.out.println(t1.isFilled());
//	}
//
//}
