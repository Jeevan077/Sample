package exceptionHandling;

public class Exception_4 {

public static void main(String[] args) {
		
	//Incrementing b in catch Block
		int a=7;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);  //would not get executed because exception occoured in line num 11
		}
		//e contains the description of the ArithmeticException
		//e is the object of Arithmetic Exception
		catch (ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(a/(b+2));
		}
		System.out.println("I am developing the banking app");
	}
}
