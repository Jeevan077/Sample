package collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemapcls_12 {

	public static void main(String[] args) {
		// Treemap maintains the ascending order similiar to tree set
		//This is the only difference between Hashmap and Treemap
		

		TreeMap <Integer,String> objmap=new TreeMap <Integer,String> ();
		
		objmap.put(05, "Erode");
		objmap.put(15, "Bangalore");
		objmap.put(02, "Chennai");
		objmap.put(12, "Kolkata");
		objmap.put(25, "Mumbai");

		System.out.println(objmap);

		System.out.println();
		System.out.println("Iterator result of Ascending Treemap is :");
		for (Entry<Integer, String> m : objmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		//Descending order
		System.out.println();
		System.out.println("Results in Decending order is : " + objmap.descendingMap());
		
		//To put values in Ascending order
		
		System.out.println();
		System.out.println("Values in Ascending order :");
		
		//Stream is the method to get the string values in sequential order which are mentioned as values in Treemap
		//Sorted is to get its natural order
		//We are using foreach() to traverse the Treemap elements
		//:: is the terminal operator of the stream which consumes the stream one by one and give in ascending order.
		objmap.values().stream().sorted().forEach(System.out::println);
		
	}

}
