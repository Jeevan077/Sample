package exceptionHandling;

public class StringIndexOutOfBound_9 {

	public static void main(String[] args) {
		String name ="Jeevan";
		try
		{
		String sub=name.substring(0, 7);
		System.out.println(sub);
		}
        catch(StringIndexOutOfBoundsException e)
		{
        	System.out.println("StringIndexOutOfBoundsException Occoured");
		}
	}

}
