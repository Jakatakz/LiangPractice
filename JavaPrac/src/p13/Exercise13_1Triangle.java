package p13;

public class Exercise13_1Triangle extends GeometricObject {

	//object should have 3 sides, color and filled properties
	//display the area, perimeter, color, and true or false whether its filled or not
	
	private double side1;
	private double side2;
	private double side3;
	private String color = "white";	//guess white is default value
	private boolean isFilled;
	
	Exercise13_1Triangle()
	{
		this(1,1,1, "white", false);
	}
	
	Exercise13_1Triangle(double side1, double side2, double side3, String color, boolean isFilled)
	{
		this.side1 = side1;
		this.side2=side2;
		this.side3=side3;
		this.color = color;
		this.isFilled = isFilled;
	}
	
	public double getSide1()
	{
		return side1;
	}
	
	public double getSide2()
	{
		return side2;
	}
	
	public double getSide3()
	{
		return side3;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public boolean isFilled()
	{
		return isFilled;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double halfP = getPerimeter() / 2;
		System.out.println(halfP);
		System.out.println(Math.sqrt((halfP *(halfP-side1) * (halfP - side2) * (halfP-side3))));
		return Math.sqrt( ((halfP *(halfP-side1)) * (halfP - side2) * (halfP-side3)) );
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side1+side2+side3;
	}

}
