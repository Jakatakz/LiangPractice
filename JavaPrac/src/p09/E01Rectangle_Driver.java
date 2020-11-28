package p09;

public class E01Rectangle_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		E01Rectangle r1 = new E01Rectangle();
		E01Rectangle r2 = new E01Rectangle(4, 40);
		E01Rectangle r3 = new E01Rectangle(3.5, 35.9);
		
		System.out.println(r1.toString() 
				+ "\n\n" + r2.toString() + "\n\n" 
				+ r3.toString());
		
	}

}
