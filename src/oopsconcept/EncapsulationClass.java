package oopsconcept;

public class EncapsulationClass {

	public static void main(String[] args) {
		StudentforEncap obj=new StudentforEncap();
		
		
		obj.setRollno(65);
		System.out.println(obj.getRollno());
		//To put out into a variable
		int roll=obj.getRollno();
		System.out.println("Variable method = " + roll);
		
		obj.setname("Jeevan");
		//String Myname=obj.getname();
		System.out.println(obj.getname());

	}

}
