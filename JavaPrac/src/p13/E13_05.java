package p13;

public class E13_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle(5);
		Circle c2 = new Circle(6);
		
		Circle cMax = (Circle) (GeometricObject.max(c1,c2));
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("max circle: " + cMax);
	}

}
