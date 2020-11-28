package p12;

public class Exercise12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleCalculator calc1 = new SimpleCalculator();
		System.out.println(args.length);
		System.out.println(args[0] + " " + args[1] + " " + args[2]);
		try {
		calc1.calculate(args);
		} catch (NumberFormatException ex)
		{
			System.out.println("incorrect input");
			ex.printStackTrace();
			
		}
		System.out.println("end");
	}
	

}
