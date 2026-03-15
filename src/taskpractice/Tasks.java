package taskpractice;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		      System.out.print("Enter a number: ");
		      int num = scanner.nextInt();

		        // Calculate factorial
		        long factorial = 1;
		        for (int i = 1; i <= num; i++) {
		            factorial *= i;
		        }

		        // Print the factorial
		        System.out.println("The factorial of " + num + " is: " + factorial);

		}


}
