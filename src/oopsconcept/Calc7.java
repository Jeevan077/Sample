package oopsconcept;

public class Calc7 extends Calc6{
	
	public void add()
	{
		System.out.println(10+10);
	}

	public static void main(String[] args) {
		
		Calc7 objcal=new Calc7();
		//This method is called Method OverRiding
		//This is also called as Run-time polymorphism
		objcal.add();   //Only add method of Calc7 is visible

	}

}
