package oopsconcept;

public class Calc8 {

	public void add() {
		System.out.println(2+2);
	}
	//While we specefing the same method in same class it will give compile time error
	//So this is called as Compile time polymorphism
	//Which is also called as Method overloading
	public void add(int x) {
		System.out.println(5+x);
	}
	public void add (int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Calc8 objcal=new Calc8();
		objcal.add();
		objcal.add(2);
		objcal.add(2, 12);
	}

}
