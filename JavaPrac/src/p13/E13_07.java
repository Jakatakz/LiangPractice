package p13;

public class E13_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create array of 5 geometricObjects
		GeometricObject[] o1={new Square(5), new Circle(5), new Square(3), new Square(10), new Rectangle(6,4)};
		
		//for each object in the array, display its area , invoke its howToColor method if its colorable
		for (GeometricObject a: o1)
		{
			System.out.println(a.getClass());
			System.out.println(a.getArea());
			if (a instanceof Colorable)
				((Colorable)a).howToColor();
			System.out.println();
		}
	}

}
