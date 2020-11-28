package p12;

public class SimpleCalculator2 {
	
	SimpleCalculator2() {
		
	}

	public void calculate(String[] args) {
		if (args.length != 3) {
			System.out.println("usage: java calc operand1 operator operator2");
			System.exit(1);
		}
	
		boolean flag = false;
		if (!isNumeric(args[0]))
		{
			System.out.println("operand : " + args[0] + " is not numeric");
			System.exit(2);
		}
		if (!isNumeric(args[2]))
		{
			System.out.println("operand : " + args[2] + " is not numeric");
			System.exit(3);
		}
		
		
		int result = 0;
		
		switch(args[1].charAt(0)) {
			case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				break;
			case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
				break;
			case 'x': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
				break;
			case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
				break;
			
		}
		
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	
	
		
		
	

	}
	
	public boolean isNumeric(String s) {
		for (char c: s.toCharArray())
		{
			if (c < '0' || c > '9')
				return false;
		}
		return true;
	}
}
