package p13;

import java.util.ArrayList;

public class E13_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeometricObject[] list1 = {new Circle(5), new Circle(10), new Rectangle(5,5), new Rectangle(10,10)};
		System.out.println("sum of all areas: " + sumArea(list1));
	}
	
	public static double sumArea(GeometricObject[] a)
	{
		double sumOfAreas = 0;
		for(GeometricObject b: a)
		{
			sumOfAreas+=b.getArea();
		}
		return sumOfAreas;
	}

}
