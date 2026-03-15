package collections;

import java.util.Vector;

public class Vectorclass_4 {

	public static void main(String[] args) {
		
		Vector <String> flowers=new Vector<> ();
		flowers.add("Rose");  
		flowers.add("Sunflower");
		flowers.add("Lily");
		flowers.add("Jasmin");
		System.out.println("Vector class is : " + flowers);
		
		//All other methods are same as ArrayList
		//only difference is vector is synchoranized and arraylist is not synchoranized.

	}

}
