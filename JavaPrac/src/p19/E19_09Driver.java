package p19;

import java.util.ArrayList;

public class E19_09Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList<Integer> list1 = new ArrayList<>();
			list1.add(1);
			list1.add(2);
			list1.add(3);
			list1.add(4);
			list1.add(5);
			list1.add(6);
			System.out.println(list1);
			E19_09.sort(list1);
			System.out.println(list1);
			EE19_08.shuffle(list1);
			System.out.println(list1);
			E19_09.sort(list1);
			System.out.println(list1);
		
	}

}
