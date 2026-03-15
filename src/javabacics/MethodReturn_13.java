package javabacics;

public class MethodReturn_13 {

	//Returning the value from the method
	public int add()
	{
		int x=2+3;
		//whatever the datatype we are returning that should be in the own method
		return x;
	}
	
	public String Fullname()
	{
		String Fullname="Jeevan" + " Sanjay";
		return Fullname;
	}
	public static void main(String[] args) {
		MethodReturn_13 obj=new MethodReturn_13();
		System.out.println(obj.add());
		String name=obj.Fullname();
		System.out.println(name);

	}

}
