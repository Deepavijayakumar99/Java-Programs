import java.util.*;

public class Utiltest {

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner s=new Scanner(System.in);
		int  a=s.nextInt();
		System.out.println("the number is:"+a);
		int b[]= {10,6,70};
		Arrays.sort(b);
		System.out.println("elements are:"+Arrays.toString(b));
		s.close();

	}

}
