package oopsconcept;

public class Calc1 {
	
	int t=7;
	public void add()
	{
		System.out.println("Result of addition = " + (2+4));
		//Inside one method we can call other method too
		sub();
	}
	
	public void sub()
	{
		System.out.println("Output of sub = " + (3-2));
	}

	

}
