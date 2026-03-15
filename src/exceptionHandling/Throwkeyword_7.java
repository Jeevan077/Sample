package exceptionHandling;

public class Throwkeyword_7 {
	
	//Concrete method or own method named Checkage
	//Method name = Checkage
	//Declaring it as static so no need to create an object in main method
	public static void Checkage(int age)
	{
		if(age>60)
		{
			//It will throw the UncheckException
			throw new ArithmeticException("You are a senior citizen");
		}
	}

	public static void main(String[] args) {
		
		Checkage(65);
		System.out.println("The rest of the code is executed");

	}

}
