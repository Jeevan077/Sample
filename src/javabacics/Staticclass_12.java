package javabacics;

public class Staticclass_12 {

	  static int count=0;  // when variable is defined as static it is a class level variable ,, not instance variable 
		// instance level variables are variables which reset values from one instance(object) to another. 
		//static variables retain the values from one instance(object) to another
		 //Instance variables do not retain the values , but resets from one object to another 
		 public void increment() {
			count++;
		}
		
		public static void main(String[] args) {
			Staticclass_12 objSt=new Staticclass_12();
			objSt.increment();
			System.out.println("objSt : Count " +count );

			Staticclass_12 objSt1=new Staticclass_12();
			objSt1.increment();
			System.out.println("objSt1 : Count " +count );
			
			//Instance variable resets the value again and again whereas static variable doesnot resets the value
			Staticclass_12 objSt2=new Staticclass_12();
			objSt2.increment();
			System.out.println("objSt2 : Count " +count );
		}

}
