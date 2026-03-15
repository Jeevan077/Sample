package javabacics;

public class ConstructorClass_10 {
	// Constructor in java is a special method in a class that is used to initialize objects
		//The constructor gets called only when an object of a class is created 
		//it can be used to set initial values to some variables 
		
		// Constructor takes same name as the class name in which it is defined 
		// Constructor can not have a return type not even void return type 

	//Declare the variable before creating own or Inbuilt method
	//x is Class level variable defined inside the class
	int x;
	public ConstructorClass_10()  //default Constructor
	{
		 x=5;
		 //We can print sysout here too
		//System.out.println(x);
	}
	public ConstructorClass_10(int x)  //Parameterized Constructor
	{
		this.x=x+2;
		//Here x denoted the variable inside parameterized constructor
		System.out.println(x); //Output =7
		//Here this.x denotes the variable inside Constructor class
		//Im passing x value as 7 in main method so output is 9
		System.out.println(this.x); //Output =9
		
	}
	public ConstructorClass_10(int t, int y)  //Parameterized Constructor
	{
		this.x=t+y;
	}
	
	public void print()   // Concrete Method or own method
	{
		System.out.println("The value of x = " + x);
	}
	
}
