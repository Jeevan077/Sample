package exceptionHandling;

public class Exception_2 {

	//NullPointerException
	public static void main(String[] args) {
		
		String s=null;
		System.out.println(s);
		
		try
		{
			System.out.println(s.length());
		}

		catch (NullPointerException e)
		{
			System.out.println("The String is Null so NullPointerException Occoured");
		}
		int c=2+5;
		System.out.println(c);
	}

}
