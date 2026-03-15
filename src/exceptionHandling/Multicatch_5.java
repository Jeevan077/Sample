package exceptionHandling;

public class Multicatch_5 {

	/* At a time only one exception occurs and at a time only one catch block is executed
	 * All catch blocks must be ordered from most specific to most general.
	 */
	public static void main(String[] args) {
		
		//Different way of declaring a blank array
		//a have 5 items in total
		//But index will only be 4 because array starts from 0
		try {
		//Different way to declare an array
		int[] a=new int[5];
		//Arithmetic exception will occour first then array index will occour
		a[5]=4/2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occoured");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occoured");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Rest of the code will be executed");
	}

}
