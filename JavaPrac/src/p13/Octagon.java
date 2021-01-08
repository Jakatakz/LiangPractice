package p13;

public class Octagon extends GeometricObject implements Cloneable {

	private double side;
	//assume all eight sides of the octagon are equal length
	//
	

	Octagon()
	{
		this.side = 0;
	}
	
	Octagon(double side)
	{
		this.side = side;
	}
	
	@Override
	public Object clone()
	{
		Octagon o = null;
		try 
		{
			o = (Octagon) super.clone();
			//no deep copy for objects necessary
		} catch (CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
		return o;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (2+ (4 / Math.sqrt(2)) ) * side * side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side * 8;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

}
