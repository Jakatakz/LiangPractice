package p19;

public class E19_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericStack<Integer> numberStack = new GenericStack<>();
		for (int i = 0; i < 50; i++)
		{
			numberStack.push(i);
		}
			System.out.println("Current Size" + numberStack.getSize());
	        System.out.println("Is stack empty? " + numberStack.isEmpty());
	        System.out.println("Pop: " + numberStack.pop());
	        System.out.println("Pop: " + numberStack.pop());
	        System.out.println("Current Size " + numberStack.getSize());
	        System.out.println("Popping all from stack...");
	}

}
