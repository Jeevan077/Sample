package exceptionHandling;

public class Exception_3 {

	//ArrayIndexOutOfBoundsException
	public static void main(String[] args) {
		/*
		String s[]= {"Rose","Jasmine"};
		try {
		System.out.println(s[4]);
	}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The String is error so ArrayIndexOutOfBoundsException is occoured");
		}
		*/
		String s[]= {"Rose","Jasmine"};
		try {
		System.out.println(s[4]);
	}
		catch (Exception e) // When we are not sure about exceptions, not recommended
		{
			System.out.println(e);
		}
		//rest of the code
	}

}

/*
 * Important Points to remember:
 * catch specefic Exception
 * Keep the Exception handle simple
 * When we are not sure about what kind of exception it is at that time we can use Exception e instead of specefic exception.
 */
