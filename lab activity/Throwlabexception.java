import java.util.Scanner;

public class Throwlabexception {

	
		void add(int a , int b)
		{
			int sum = a+b;
			if (sum <100)
			{
				System.out.println("Result :" +sum+" sum is less than 100");
			}
			else
			{
			throw new ArithmeticException("Sum is greater than 100");
			
				
			}
					}


		

		public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers :");
	int a = sc.nextInt();
	int b = sc.nextInt();
	Throwlabexception t = new Throwlabexception ();
	t.add(a,b);


		}
	}
	