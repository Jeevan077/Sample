package javabacics;

public class Operators_1 {

	public static void main(String[] args) {
		//Addition
		
		int num1=500;
		int num2=200;
		int result= num1+num2;
		System.out.println(result);
		
		//Subtraction
		int a=12;
		int b=7;
		int c=a-b;
		System.out.println("The result is : " +c);
		
		//Converting String to Integer, only if String is an Number
		//String should be declared inside double quotes and its kind of word
		
		String s1="12";
		String s2="10";
		int a1=Integer.parseInt(s1);
		int a2=Integer.parseInt(s2);
		System.out.println(a1+a2);
		
		//Incrementing the value by 1, ++ should be given before the varible
		//This is Pre Incrtemented.
		int ab=1;
		int cd=2;
		System.out.println(++ab);
		
		//Comparsion Operators or Relational operator
		
		int aa=7;
		int bb=12;
		System.out.println(aa>bb);
		System.out.println(aa<bb);
		System.out.println(aa>=bb);
		System.out.println(aa<=bb);
		System.out.println(aa!=bb);
		System.out.println(aa==bb);
		System.out.println();
		
		//Logical Operators
		
				boolean x=true;
				boolean y=false;
				System.out.println(x&&y);
				System.out.println(x||y);
				
				//Usage of float and double
				//Need to Type case Float and double if using anywhere
				//Only decimal numbers are specified in Float and Double
				
				int q=5;
				int t=10;
				float p=(float)q/t;
				//Small decimal numbers saved by float
				//one more method to use float data type
				float u=25.67f;
				System.out.println(p);
				System.out.println(u);
				//Large decimal numbers saved by double
				double s=(double)47000000.67000000 ;
				System.out.println(s);
				
				//Concatinating Two Names 
				
				String firstname="Jeevan";
				String secondname="Sanjay";
				System.out.println("My full name is : " + firstname + " " + secondname);
				
	}

}
