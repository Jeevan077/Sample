package exceptionHandling;

public class FinallyClass {

	// Finally block is used in Java to cleanup code such as closing file, closing DB Connection
    //Also Used in logging out of application
	
	public static void main(String[] args) {
		
           try {
        	   int div=40/10;
        	   System.out.println(div);
           }
           catch(NullPointerException e)
           {
        	   System.out.println(e);
           }
           finally //There can be multiple catch blocks but finally will be only one
           {
        	   System.out.println("Must execute in any case");
           }
           System.out.println("Rest of the code is executed");
	}

}
