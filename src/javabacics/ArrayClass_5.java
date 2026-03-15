package javabacics;

public class ArrayClass_5 {

	public static void main(String[] args) {
		
		String[] flowers ={"Jasmine", "Rose", "Lily", "Jasbera"}; //String type Array
		int[] Numbers= {1,2,3,4}; //Numerical Array
		
		//Printing String array with For loop
		System.out.println("Output of String array is : ");
		int l=flowers.length;
		
		for(int i=0;i<l;i++) {
			System.out.println(flowers[i]);
		}
		
		//Replacing The String array with for loop
		flowers[2]="Hibera";
		System.out.println();
		System.out.println("Replaced String array is : ");
        int replace=flowers.length;
		
		for(int i=0;i<replace;i++) {
			System.out.println(flowers[i]);
		}
		
		//Printing Numerical Array using For loop
		System.out.println();
		int num= Numbers.length;
		System.out.println("Output of Numerical Array is : ");
		for(int j=0;j<num;j++) {
			System.out.println(Numbers[j]);
		}
		
		//Replacing Numerical array
		Numbers[2]=5;
		System.out.println();
		int num1= Numbers.length;
		System.out.println("Output of Replaced Numerical Array is : ");
		for(int j=0;j<num1;j++) {
			System.out.println(Numbers[j]);
		}
		}
		
}


