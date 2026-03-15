package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_8 {

	//LinkedHashset does not allow duplicate values
	//Maintains the insertion order
	
	public static void main(String[] args) {
		
		LinkedHashSet <String> num=new LinkedHashSet<> ();
		//Maintains the order whatever we have given
		num.add("Two");
		num.add("Four");
		num.add("Six");
		num.add("Zero");
		num.add("Seven");
		
		//Using Iterator to iterate the elements
		
		Iterator <String> itr=num.iterator();
		System.out.println("Printing the LinkedHashSet :");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	

		System.out.println();
		num.remove("Six");
		System.out.println("The removed LinkedHasset is :" +num);
	}

}
