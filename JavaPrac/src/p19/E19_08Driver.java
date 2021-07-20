package p19;
import java.util.ArrayList;
public class E19_08Driver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("AAA");
		list1.add("BBB");
		list1.add("CCC");
		list1.add("DDD");
		list1.add("EEE");
		list1.add("FFF");
		System.out.println(list1);
		EE19_08.shuffle(list1);
		System.out.println(list1);
		
	}

}
