package p13;
public class E13_06 
{
	public static void main(String[] args) 
	{
		ComparableCircle c1 = new ComparableCircle(3);
		ComparableCircle c2 = new ComparableCircle(5);
		ComparableCircle cMax = (ComparableCircle)GeometricObject.max(c1, c2);
		System.out.println(GeometricObject.max(c1,c2));
		System.out.println("cMax: " + cMax);
		
		Rectangle r1 = new Rectangle(9,6);
		GeometricObject GMax = GeometricObject.max(c1, r1);
		System.out.println("c1 area: " + c1.getArea());
		System.out.println("GMax: " + GMax);
	}
}
	 class ComparableCircle extends Circle {
	
		ComparableCircle()
		{
		}
		
		ComparableCircle(double radius)
		{
			super(radius);
		}
	}

