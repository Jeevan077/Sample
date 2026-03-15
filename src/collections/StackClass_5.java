package collections;

import java.util.Stack;

public class StackClass_5 {

	public static void main(String[] args) {
		
		Stack <String> flowers=new Stack<> ();
		//To add elements in stack we use Push method
		flowers.push("Rose");
		flowers.push("SF");
		flowers.push("Sunflower");
		flowers.push("Lily");
		//List Interface allows duplicate values so added Rose again
		flowers.push("Rose");
		flowers.push("Jasmine");
		
		System.out.println("Stack Class is : " + flowers);
		
		//To remove Last elements from the stack we use pop method
		
		String ele=flowers.pop();
		System.out.println(ele);
		System.out.println("Stack class after removal of last element is : " + flowers);
		
		//To get the last element from Stack we use peek method
		//This is getting the element from top of the stack
		String ele2=flowers.peek();
		System.out.println(ele2);
		
		//Search an element in stack
		int pos=flowers.search("Lily");
		System.out.println("Position of Lily is : " +pos);
		
	}

}
