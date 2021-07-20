package p19;

public class E19_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E02_GenericStack<String> stk0 = new E02_GenericStack();
		stk0.push("London");
		stk0.push("Paris");
		stk0.push("Berlin");
		
		E02_GenericStack<Integer> stk1 = new E02_GenericStack();
		stk1.push(1);
		stk1.push(2);
		stk1.push(3);
		
		System.out.println(stk0.toString());		//stk1.toString();
		System.out.println(stk1.toString());
	}

}
