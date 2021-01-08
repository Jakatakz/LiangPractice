package p13;

public class E13_11test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create octagon object with side value 5, display area, perimeter
		Octagon o1 = new Octagon(5);
		System.out.println("area: " + o1.getArea() + "\nperimeter: " + o1.getPerimeter());
		//create new object using clone method, compare 2 objects using compareTo
		Octagon o2 = (Octagon) o1.clone();
		System.out.println("area: " + o2.getArea() + "\nperimeter: " + o2.getPerimeter());
		System.out.println(o2.compareTo(o1));
	}

}
