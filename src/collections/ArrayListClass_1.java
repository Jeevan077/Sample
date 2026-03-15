package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClass_1 {

	 /* Arraylist : It allows us to create resizable arrays.
	   * As we can adjust the capacity of the arraylist it is also known as dynamic array
	   */
	public static void main(String[] args) {
		// Creating Integer type Array List
		//Syntax
		//ArrayList<Integer> al=new ArrayList<> ();  //We cannot use primitive data type in Collections eg:- int

		// Creating String type Array List
		//Syntax
		ArrayList<String> alS=new ArrayList<> ();
		
		//Add elements to ArrayList
		alS.add("Rose");  //0th Index
		alS.add("Sunflower");
		alS.add("Lily");
		alS.add("Jasmin");
		
		System.out.println("ArrayList : " + alS);
		
		//Reading the elements from the ArrayList
		String f=alS.get(2);
		System.out.println("Element at Index 2 is : " + f);
		
		//Changing the elements of ArrayList
		alS.set(1, "Mogra");
		System.out.println("ArrayList after Replaced is : " + alS);
		
		//Removing elements
		alS.remove(3);
		System.out.println("ArrayList after Removing one element is : " + alS);
		
		//Removing all the elements
		
		//alS.removeAll(alS);    //Will return true if elements are removed successfully
		//System.out.println("Arraylist after all elements Removed is : " + alS);
		
		//alS.clear();   //This also remove all the elements but it does not return true
		
		System.out.println("Size of the ArrayList is : " +alS.size());   //To Check size of the ArrayList
		
		//Sorting the ArrayList
		//Soting means Arranging the elements in Ascending or Descendning order
		//Arranging elememts in Ascending order
		alS.sort(Comparator.naturalOrder());
		System.out.println("ArrayList after sort : " +alS);
		
		//Arranging elememts in Descending order
		alS.sort(Comparator.reverseOrder());
		System.out.println("ArrayList after reverse sort : " +alS);
		
		//Checking If ArrayList is Empty
		System.out.println(alS.isEmpty());  //It will return True or False
		
		//Checking If ArrayList Contains Any Items:
		System.out.println(alS.contains("Lily"));  //It will return true or false
		
		//Approach 1:
		//Traversing the ArrayList using Simple for loop
		int size=alS.size();
		System.out.println();
		for (int i=0;i<size;i++)
		{
			System.out.print(alS.get(i));
			//If you want to insert commos
			System.out.print(" ");
		}
		
		//Approach 2:
		//Traversing the ArrayList using Advanced for loop
		//It is also called as for each loop
		System.out.println();
		System.out.println();
		System.out.println("Printing arraylist using Advanced For loop : ");
		//Need to get every elements or items into a variable and use them
		//We will specify the object of the class and we save the items one by one to the String variable
		//We cannot modify the elements of arraylist using foreach loop
		for(String flower :alS)     //Syntax
		{
			System.out.println(flower);
		}
		
		//Approach 3: Using Iterator
		//Ierator starts from 1 element lesser than the first element, so hasnext method is used in while loop.
		//Data type here we should specify arraylist data type
		//alS is whatever the arraylist object we created should be mentioned
		//itr is the instance or object for Iterator
		//Iterator can modify the arraylist
		ListIterator <String> itr=alS.listIterator();  //Syntax
		
		//Parent class of ListIterator is Iterator
		//Iterator <String> itr=alS.iterator();
		System.out.println();
		System.out.println("Printing the arraylist using Iterator : ");
		
		//hasnext method is used to check the next items in the list
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//If need to convert array list to array use .toarray method
	}
	

}
