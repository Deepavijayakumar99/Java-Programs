import java.util.Scanner;

public class Compiletimepoly 
{
	void add(int a , int b) {
			int c = a+b;
			System.out.println("Sum is : "+c);
		}
		void add(int a, int b, int c) {
			int d = a+b+c;
			System.out.println("Sum is: "+d);
		}

		public static void main(String[] args) {
			Compiletimepoly  t = new  Compiletimepoly ();
			 Scanner s = new Scanner(System.in);
			 System.out.println("Enter the three numbers : ");
			 int a = s.nextInt();
			 int b = s.nextInt();
			 int c = s.nextInt();
			 t.add(a,b);
			 t.add(a,b,c);

	}

}
