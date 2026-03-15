package javabacics;

public class Stringclass_6 {

	public static void main(String[] args) {
		
		String s ="I am happy";
		System.out.println(s.length());
		System.out.println(s.contains("happy"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(0,5)); //String characters starts from 0.
		System.out.println(s.isEmpty());
		String name="Jeevan";
		String secondname="Sanjay";
		System.out.println(name.concat(secondname));

	}

}
