package javabacics;

public class Forwhile_4 {

	public static void main(String[] args) {
		// For loop
		
		//Printing Numbers 1 to 10
		for (int i=1;i<=10;i++) {
			System.out.println(i);
		}

		//While Loop
				// Do something until specified condition is reached
				//Printing numbers 0 to 4
				int x=0;
				System.out.println("Output of while loop is : ");
				while(x<5)
				{
					System.out.println(x);
					x++;
				}
				
				//Printing 10 to 0
				
				int y=10;
				System.out.println("Output of second while loop is : ");
				while(y>=0) {
					System.out.println(y);
					y--;
				}
				
				//DO WHILE LOOP
				
			// Loop is always executed atleast once even if the condition is false
			//Because the code is executed before the condition is tested.
				
				//Printing number from 0 to 4
				int a=0;
				System.out.println("Output of Do while loop is : ");
				do
				{
					System.out.println(a);
					a++;
				} while(a<5);
			
	}

}
