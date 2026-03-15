package exceptionHandling;

public class Throws_8 {

	//Throws keyword tells that exception should be handled by the calling method
	//Without Throw keyword Throws wont execute
	public void div (int a, int b) throws ArithmeticException 
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		Throws_8 obj=new Throws_8();
		try {
			obj.div(20, 0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("The value of b is Zero");
		}
		
		//obj.div(20, 4);
		
		int d=40+10;
		System.out.println(d);

	}
	
}
