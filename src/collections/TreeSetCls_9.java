package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCls_9 {
	//In Tree set No duplicate values allowed
	//Here Ascending values are maintained

	public static void main(String[] args) {
		
		TreeSet <String> num=new TreeSet<> ();
		num.add("Two");
		num.add("Four");
		num.add("Six");
		num.add("Zero");
		num.add("Seven");
		
		//Using Iterator to iterate the elements
		
		Iterator <String> itr=num.iterator();
		System.out.println("Printing the String type TreeSet :");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	

		TreeSet <Integer> number=new TreeSet<> ();
		number.add(20);
		number.add(5);
		number.add(7);
		number.add(65);
		
		//Using Iterator to iterate the elements
		
				Iterator <Integer> itr1=number.iterator();
				System.out.println();
				System.out.println("Printing the Integer type TreeSet :");
				while(itr1.hasNext())
				{
					System.out.println(itr1.next());
				}	
				
				//Returns lowest value of the Integer Treeset use pollfirst method
				
				System.out.println();
				
				System.out.println("Lowest Value : " +number.pollFirst());
				
				System.out.println("Highest Value : " +number.pollLast());  //Returns Highest value
				
	}

}
