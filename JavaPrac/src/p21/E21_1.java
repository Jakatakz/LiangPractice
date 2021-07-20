package p21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class E21_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> stack1 = new HashSet<>(Arrays.asList("Chemistry", "Mathematics", "Biology", "English"));
		HashSet<String> stack2 = new HashSet<>(Arrays.asList("Biology", "English", "Geography", "Physics"));
		HashSet<String> stack2Clone = new HashSet<>(stack2);
		HashSet<String> stack1Clone = new HashSet<>(stack1);
		System.out.println("stack2Clone contains: " + stack2Clone);
		System.out.println("stack1Clone contains: " + stack1Clone);
		
		//only present in firsst stack
		stack2.retainAll(stack1);
		
		//should print stack1 = chemistry, mathematics, biology, english
		//should print stack2 = biology, english
		System.out.println("Only present in first stack: stack1 =  " + stack1 + "\nOnly present in first stack: stack2: stack2 = " + stack2);
		
		//only present in the second stack
		stack1Clone.retainAll(stack2Clone);
		System.out.println("only present in second stack: stack2 = " + stack2Clone + "\nonly present in second stack: stack1 = " + stack1Clone);
		//should be biology, english, geography physics
		//should be biology, english
		
		//subjects that are present in both stacks (union)
		HashSet<String> stack1Clone1 = (HashSet<String>)stack1.clone();
		HashSet<String> stack2Clone2 = (HashSet<String>)stack2Clone.clone();
		System.out.println("\nstack1Clone1: " + stack1Clone1);
		System.out.println("stack2Clone2: " + stack2Clone2);
		stack1Clone1.addAll(stack2Clone2);
		System.out.println("stack1Clone1 after add all: " + stack1Clone1);
	}

}
