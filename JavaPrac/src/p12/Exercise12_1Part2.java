package p12;

public class Exercise12_1Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleCalculator2 calc1 = new SimpleCalculator2();
		System.out.println(args.length);
		System.out.println(args[0] + " " + args[1] + " " + args[2]);
		calc1.calculate(args);
		System.out.println("end");
	}
	

}
