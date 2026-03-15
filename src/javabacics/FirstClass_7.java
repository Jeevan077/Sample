package javabacics;

public class FirstClass_7 {

	public void print()
	{
		System.out.println("I am Jeevan");
	}
	
	public static void add()
	{
		System.out.println(3+2);
	}
	public static void main(String[] args) {
		// TO Access the own method need to create Object of your class name
		//Only Inside main method should call the own method
		// If you need to Access the own method without creating the object, you should add static to method name.
		
		// Create Object only inside main method to access your own method
		//Method is non-static so we should create object of the class to call this method
		
		FirstClass_7 obj=new FirstClass_7();
		obj.print();
		
		//Method is static so no need to create Object for the class to call this method.
		//In same class only method name is enough to call the method
		//In Another class need to specify the class name to call static methods.
		
		add(); //Static method can be accessed without creating the object
		//Can call class name if you want 
		//Should call class name if you are calling this add method from another class.
		FirstClass_7.add();  //Can only call the class name and no need to create object.
		}

}
