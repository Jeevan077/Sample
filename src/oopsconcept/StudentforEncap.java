package oopsconcept;

public class StudentforEncap {
	
	/* Encapsulation lets us bundle the variables along with methods
	  * It also hides the data variables by declaring them private
	  * For security reason only we are using Encapsulation
	  * So No main method is used inside this class. If want we can use, but it is not recommended. 
	  */

	private int rollnum;
	private String name;
	
	/*
	 * Can use constructor method also 
	public StudentforEncap (int r, String name)
	{
		rollnum=r;
		this.name=name;
	}
	*/
	
	public void setRollno(int r)
	{
		rollnum=r;
		System.out.println("Roll number is set");
	}
	public int getRollno()
	{
		System.out.println("Roll number is read");
		//Whenever we are using the return we should return the data type in method
		return rollnum;
	}
	public void setname(String name)
	{
		this.name=name;
		System.out.println("The name is set");
	}
	public String getname()
	{
		System.out.print("The name is read to = ");
		return name;
	}
}
