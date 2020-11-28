package p12;

public class SimpleCalculator {
	
	SimpleCalculator() {
		
	}

	public void calculate(String[] args) {
		if (args.length != 3) {
			System.out.println("usage: java calc operand1 operator operator2");
			System.exit(1);
		}
		
		try {
		
		int result = 0;
		
		switch(args[1].charAt(0)) {
			case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				break;
			case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
				break;
			case 'x': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
				break;
			case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
		}
		
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	
	} catch (NumberFormatException ex) {
		ex.printStackTrace();
		System.out.println("wrong input");
	}
		
		
	

	}
}
