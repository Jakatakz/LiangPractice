package p09;

public class FanDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fan f1 = new Fan();
		Fan f2 = new Fan();
		f1.setSpeed(3);
		f1.setRadius(10);
		f1.setColor("yellow");
		f1.setOn(true);
		
		f2.setSpeed(2);
		//radius 5, color blue and off is already default
		
		System.out.println("\nFan 1:\n" + f1.toString() 
		+ "\nFan 2:\n" + f2.toString());
	}

}
