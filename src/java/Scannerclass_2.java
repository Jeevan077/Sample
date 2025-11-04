package java;

import java.util.Scanner;

public class Scannerclass_2 {

	public static void main(String[] args) {
		

		Scanner myObj=new Scanner (System.in);
		System.out.println("Enter the username :");
		String name=myObj.nextLine();
		System.out.println(name);
		
		System.out.println("Enter your age :");
		int age=myObj.nextInt();
		System.out.println(age);
		
		System.out.println("Enter your roll number :");
		int rollnumber=myObj.nextInt();
		System.out.println(rollnumber);
		
		System.out.println("Enter Your Gender :");
		String Gender=myObj.next();
		System.out.println(Gender);
		
		System.out.println("Enter Your Date of Birth :");
		String dob=myObj.next();
		System.out.println(dob);
		
		System.out.println("Your monthly salary :");
		float salary=myObj.nextFloat();
		System.out.println(salary);

	}

}
