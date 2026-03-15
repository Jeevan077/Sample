package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistclass_3 {
	
	//Here each Elements is mentioned as Nodes
	//Each node contains Element and address to the next element .
	//Here all methods are same as Arraylist

	public static void main(String[] args) {
	
		LinkedList <String> flowers=new LinkedList<> ();
		flowers.add("Rose");  
		flowers.add("Sunflower");
		flowers.add("Lily");
		flowers.add("Jasmin");

		System.out.println(flowers);
		

		//get method 
		//Flowers object contains entire method which all are in add
		System.out.println(flowers.get(0));
		
		//set method to change the element
		flowers.set(1, "Margo");
		System.out.println("Replaced LinkedList is : " + flowers);
		
		//Iterating Linked list using Iterator
		
		Iterator <String> itr=flowers.iterator();
				System.out.println();
				System.out.println("Printing the Linkedlist using Iterator : ");
				
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				
				
	}

}
