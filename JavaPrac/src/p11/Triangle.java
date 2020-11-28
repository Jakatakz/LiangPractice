package p11;

import p12.IllegalTriangleException;

public class Triangle extends GeometricObject {

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	Triangle() throws IllegalTriangleException {
		this(0,0,0);
	}
	
	//throw new illegaltriangleexception parameters change depending on the if statement
	Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		if (side1+side2 < side3)
			throw new IllegalTriangleException(side1, side2,side3);
		else if (side1+side3 < side2)
			throw new IllegalTriangleException(side1, side3, side2);
		else if (side2+side3 < side1)
			throw new IllegalTriangleException(side2, side3, side1);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	@Override
	public double getArea() {
		double s = (side1 + side2+side3)/2.0;
		return Math.pow(s*(s-side1) * (s-side2)*(s-side3), 0.5);
	}

	@Override
	public double getPerimeter() {
		double perimeter = side1+side2+side3;
		return perimeter;
	}
	
	@Override 
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

	
	
}
