package p13;

public class Square extends GeometricObject implements Colorable {

	private double side;
	
	Square()
	{
		this(0);
	}
	
	Square(double side)
	{
		this.side = side;
	}
	
	public void howToColor() {
		// TODO Auto-generated method stub
		System.out.println("color all four sides");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side*4;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

}
