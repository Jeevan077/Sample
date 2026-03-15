package oopsconcept;

public class CalcImplementation {

	public static void main(String[] args) {
		//Single-Level Inheritance
		Calc2 objc=new Calc2();
		objc.add();
		objc.sub();
		Calc2.multi();
		Calc2.div();
		
		
		//Multi-level Inheritance
		
		System.out.println();
		Calc3 objcalc=new Calc3();
		objcalc.add();
		//objcalc.sub();
		//Static method so called without creating the object
		//Only call class name of those static method
		Calc2.multi();
		Calc2.div();
		//Variable can also be accessed from parent class
		System.out.println(objcalc.t);
		
		objcalc.percent();
		
		
		//Hierachical Inheritance
		
		System.out.println();
		Calc4 obj=new Calc4();
		obj.add();
		obj.sub();
		obj.mod();
		
		Calc5 obj1=new Calc5();
		obj1.add();
		obj1.sub();
		Calc5.cos();
		}

}
