package abstractInterface;

public class Sportsbike_Interface_2 implements MotorbikeInterface_1, MotorbikeInterface2_4th {

	@Override
	public void brake() {
		System.out.println("I apply my brake");
		
	}

	@Override
	public void speed() {
		System.out.println("My speed is 100kmph");
		
	}

	@Override
	public void color() {
		System.out.println("The color is red");
		
	}

	@Override
	public void lightcolor() {
		System.out.println("light color is white");
		
	}

	@Override
	public void length(int l) {
		System.out.println("Length of the bike is = " + l);
		
	}

	
}
