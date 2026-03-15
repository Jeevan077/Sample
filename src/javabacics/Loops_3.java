package javabacics;

import java.util.Scanner;

public class Loops_3 {

	public static void main(String[] args) {
		// simple if else
		
		int age =25;
		if (age>60)
		{
			System.out.println("I am a senior Citizen");
		}else
		{
			System.out.println("I am still Young");
		}
		//Nested If-else
		
		//Using scanner method in Nested-Ifelse
		Scanner myobj=new Scanner (System.in);
				System.out.println("Enter the time: ");
				int time=myobj.nextInt();
				if (time<10)
				{
					System.out.println("Good Morning");
				}
				else if (time<18)
				{
					System.out.println("Good day");
					}
				else
				{
					System.out.println("Good Night");
				}
				
				//switch
				System.out.println("Enter the day :"); //Scanner Method
				int day=myobj.nextInt();
				
				//int day =5; //Normal method
				switch (day)
				{
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Saturday");
					break;
				case 7:
					System.out.println("Sunday");
					break;
				default:
					System.out.println("Have a good day");
					break;
	}
	}
}
