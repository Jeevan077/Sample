package abstractInterface;

public abstract class Motorbike_1 {

	//Absctarct allows both abstract method and normal method
	public void brake()      //Method with body are also called as Concrete Methods.
	{
		System.out.println("I apply brake");
	}
	
	/*
	//Common features was written with the keyword Abstarct as method name.
	//For this Motorbike we cant able to declare speed and color because these are common feature.
	// abstract method are the methods which are not implemented but just declared
		//abstract methods can be declared only in the abstract class
		//Abstract class can have both - normal methods and abstract method
		//Abstraction allows us to hide unnecessary details and show the needed information 
		//e.g speed of mountainBike and sports bike are hidden ,, and implemented in another class as per need
	
	//When to go for abstract
	//Code Reusability
	//Define common methods
	//enforce methods implementation.
	 * 
	 */
	
	abstract void speed();
	abstract void color();
	
	
}

