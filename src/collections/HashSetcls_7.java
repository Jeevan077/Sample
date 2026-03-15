package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetcls_7 {

	public static void main(String[] args) {
		
		//Hashset does not maintain the order
		HashSet <Integer> num=new HashSet<> ();
		
		//All methods are same as list
		//Add elements to Hashset
		num.add(2);
		num.add(3);
		num.add(5);
		num.add(0);
		num.add(50);
		num.add(7);
		//num.add(50);      //SET interface does not allow duplicate Interface
		System.out.println("HashSet Class is : " +num);
		
		//Removing elements from Hashset
		num.remove(3);
		System.out.println("Hashset after removing is : " +num);
		
		//Iterating elements of Hashset using Iterator
		Iterator<Integer> itr=num.iterator();
		System.out.println("Printing the HashSet using Iterator : ");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
