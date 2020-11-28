package p12;

public class IllegalTriangleException extends Exception {

	private double sideA;
	private double sideB;
	private double sideC;	//the error side
	
	public IllegalTriangleException(double sideA, double sideB, double sideC) {
		super(sideA + " + " + sideB + " must be bigger than " + sideC);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	public double getSideA() 
	{
		return sideA;
	}
	
	public double getSideB()
	{
		return sideB;
	}
	
	public double getSideC()
	{
		return sideC;
	}
}
