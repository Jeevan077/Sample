package collections;

import java.util.ArrayList;

public class ListToarraycls_10 {

	public static void main(String[] args) {
		
		ArrayList <String> languages=new ArrayList<> ();
		languages.add("C");
		languages.add("C++");
		languages.add("Python");
		languages.add("Java");
		
		System.out.println("Arraylist : " +languages);
		//System.out.println(languages.size());
		
		int l=languages.size();
		System.out.println("Arraylist size : "+l);
		//Converting Array List to Array
		String[] arr=new String[l];
		languages.toArray(arr);    //.toArray is used to convert arraylist to array
		
		//Traversing elements through for each loop
		System.out.println();
		System.out.println("Coverting Array List to Array :");
		for(String lan:arr)
		{
			System.out.println(lan);
		}
		

	}

}
