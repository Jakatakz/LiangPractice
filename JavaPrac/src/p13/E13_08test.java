package p13;

public class E13_08test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		E13_08 eStack1 = new E13_08();
		System.out.println("before push. eStack1 size: " + eStack1.getSize());
		eStack1.push(5);
		eStack1.push(3);
		System.out.println("after push. eStack1 size: " + eStack1.getSize());
		E13_08 eStack2 = (E13_08) eStack1.clone();
		System.out.println("eStack2 size: " +  eStack2.getSize());
		
		eStack2.push(2);
		System.out.println("eStack1 size: " + eStack1.getSize());
		System.out.println("eStack2 size: " + eStack2.getSize());
	}

}
