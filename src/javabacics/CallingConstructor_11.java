package javabacics;

public class CallingConstructor_11 {

	public static void main(String[] args) {


		ConstructorClass_10 objcon=new ConstructorClass_10();
		//System.out.println(objcon.x);
		objcon.print();
		
		ConstructorClass_10 objcon1=new ConstructorClass_10(7);
		
		ConstructorClass_10 objcon2=new ConstructorClass_10(3,8);
		
		//Sysout can be mentioned in main method or in constructor method too
		//But Object should be created under main method
		System.out.println(objcon2.x);
	}

}
