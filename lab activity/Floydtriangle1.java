import java.util.Scanner;

public class Floydtriangle1 {

	public static void main(String[] args) 
	{
		 int n,num=1, a, b;
	 
		      
		      Scanner in = new Scanner(System.in);
		      System.out.println("Enter the number of rows of floyd's triangle ");
		      n = in.nextInt();
		      System.out.println("Floyd's triangle are :-");
		      for ( a = 1 ; a <= n ; a++ )
		      {
		         for ( b = 1 ; b <= a; b++ )
		           {
		              System.out.print(num+" ");
		              num++;
		           }
		          System.out.println();
		      }    
	          System.out.println();
	      }
	}


