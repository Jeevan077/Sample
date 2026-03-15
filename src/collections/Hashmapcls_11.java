package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmapcls_11 {

	/*
	 * Hashmap implements map interface - Data is stored in key value pairs which Key is
	 * unique. We update, delete and search the data in map by using keys only
	 * 
	 * HashMap Class implements Map Interface It is not synchronized //Multiiple
	 * classes try to access HashMap so it will give wrong results Basically only
	 * one class access at a time after completing its actions which need to perform
	 * next class will access. Usually, Classes are synchronized but Hashmap is not
	 * synchronized. It also allows Null Keys, but only one is allowed. It contains
	 * only unique keys. It does not maintain the order
	 */

	public static void main(String[] args) {

		/*
		 * HashMap <Integer,String> objmap=new HashMap<Integer,String> ();
		 * 
		 * //put method is used to add items in HashMap
		 * 
		 * objmap.put(05, "Erode"); objmap.put(15, "Bangalore"); objmap.put(02,
		 * "Chennai"); objmap.put(12, "Kolkata"); objmap.put(25, "Mumbai");
		 * 
		 * System.out.println(objmap);
		 * 
		 * //Iterate the elements using foreach lop 
		 * //Way of Accessing Hashmap is little
		 * different 
		 * //Iterator will give the output without any curly brackets and each
		 * elements in seprate line 
		 * System.out.println();
		 * System.out.println("Iterator result of Hashmap is :"); 
		 * for(Map.Entry m:objmap.entrySet()) 
		 * { 
		 * System.out.println(m.getKey() + " " + m.getValue()); 
		 * }
		 */

		/*
		 * // Inserting duplicate keys
		 * 
		 * HashMap<Integer, String> objmap = new HashMap<Integer, String>();
		 * 
		 * // Keys should be unique here // If we use duplicate keys he values will et
		 * updated accordingly
		 * 
		 * objmap.put(05, "Erode"); objmap.put(15, "Bangalore"); objmap.put(02,
		 * "Chennai"); objmap.put(12, "Kolkata"); objmap.put(25, "Mumbai");
		 * objmap.put(05, "Chennai");
		 * 
		 * System.out.println(objmap);
		 * 
		 * System.out.println(); System.out.println("Iterator result of Hashmap is :");
		 * for (Map.Entry m : objmap.entrySet()) { System.out.println(m.getKey() + " " +
		 * m.getValue()); }
		 */

		//Checking if key exists before put - putIfabsent
		HashMap<Integer, String> objmap = new HashMap<Integer, String>();

		//These all are called as entryset
		objmap.put(05, "Erode");
		objmap.put(15, "Bangalore");
		objmap.put(02, "Chennai");
		objmap.put(12, "Kolkata");
		objmap.put(25, "Mumbai");
		objmap.putIfAbsent(05, "Chennai");  //Checks if key is absent
		objmap.remove(12);   //Removes the key where 12 is present
		//objmap.clear();  //Deletes complete entryset
		objmap.put(07, "Chennai");

		System.out.println(objmap);

		System.out.println();
		System.out.println("Iterator result of Hashmap is :");
		for (Entry<Integer, String> m : objmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		
	}

}
