package exceptionHandling;

public class Multicatch2_6 {

	public static void main(String[] args) {
		try {
			int[] a=new int[5];
			//Arithmetic exception will occour first then array index will occour
			a[5]=4/2;
			}
		//If order is not followed such things are handled by compile time exception
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		//Remaining codes will not execute
		/*
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBoundsException occoured");
			}
			catch(ArithmeticException e)
			{
				System.out.println("Parent Exception occurs");
			}
			*/
			System.out.println("Rest of the code will be executed");
		}
		
	}

	
