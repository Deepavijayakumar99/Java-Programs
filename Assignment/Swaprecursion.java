import java.util.Scanner;

public class Swaprecursion {

	
		int swap(int x, int y)
		{
			int temp;
			temp=x;
			x=y;
			y=temp;
		
			System.out.println("Numbers after swapping : "+x+ " " +y);
			return swap(x,y);
		}
			
			public static void main(String[] args) {
				int a,b;
				Scanner s = new Scanner(System.in);
				a= s.nextInt();
				b= s.nextInt();
				System.out.println("Numbers before swapping : "+a+ " " +b);
				
				Swaprecursion r = new Swaprecursion();
				r.swap(a,b);
				

			}

		
	}


