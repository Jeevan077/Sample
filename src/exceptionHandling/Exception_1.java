package exceptionHandling;

public class Exception_1 {
	
	/*Types of Exceptions:
	 * 1. Checked Exceptions - Raised at compile time
	 * IO Exception ---Input Output Exception
	 * SQL Exception
	 * Parse Exception
	 * Class not found Exception
	 * 
	 * 2.Unchecked Exceptions - Raised at run time
	 * Arithmetic Exceptions
	 * Null Pointer Exceptions
	 * Array Index out of Bounds Exceptions
	 * Illegal Argument Exceptions
	 * 
	 * 3. ERROS  - Not related with the code we write
	 * Out of Memory Error
	 * Stack over flow 	Error
	 * NotClassDefFound Error
	 * 
	 * Various Keywords to handle exceptions:
	 * try
	 * catch
	 * finally 
	 * throw
	 * throws
	 * 
	 * try{
	 * Code that may throw exception
	 * } catch (Exception type e)
	 * Exception handling code
	 * 
	 * Parent of all Exceptions are Exception class
	 * 
	 */
	
	//ArithmeticException

	public static void main(String[] args) {
		
		int a=7;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);  //would not get executed because exception occoured in line num 47
		}
		//e contains the description of the ArithmeticException
		//e is the object of Arithmetic Exception
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("I am developing the banking app");
	}

}
