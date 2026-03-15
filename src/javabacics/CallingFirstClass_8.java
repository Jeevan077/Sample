package javabacics;

public class CallingFirstClass_8 {

	public static void main(String[] args) {
		
		//Calling FirstClass_7 from this class
		//Everytime while calling other class create object of the calling class
		//Object names can be different and it doenst matter
		//Classname should be correct
		FirstClass_7 obj=new FirstClass_7();
		obj.print();
		
		FirstClass_7 objF=new FirstClass_7(); 
		objF.print();

		//Calling static own method from FirstClass_7 class
		//In Another class need to specify the class name to call static methods.
		FirstClass_7.add();
	}

}
