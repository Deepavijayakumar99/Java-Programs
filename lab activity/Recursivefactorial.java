import java.util.Scanner;

import java.util.Scanner;
public class Recursivefactorial {
	
	static int fact(int a, int b)
	 {
		 if(a==1)
		 {
			return (1); 
		 }
		 else
		 {
			 return (a*(a-1));
			 
		 }
	 }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int fact=1;
		for(int i = fact ; i<=a;i++) 
		{
			 fact = fact*i;		
		}
		System.out.println("Factorial without recursion: "+fact);
		System.out.println("Factorial with recursion: "+fact(a,b));
		
		
		
		Recursivefactorial r = new Recursivefactorial();
	
	
		
	}

}
