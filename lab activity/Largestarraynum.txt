import java.util.Scanner;

public class Largestarraynum {

	public static void main(String[] args) {
		int a[]=new int [5];
		int lar=a[0];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
		System.out.println("enter the values of array:");
		a[i]=s.nextInt();
		}
		for(int i=1;i<5;i++)
		{
		if(a[i]>lar)
		{
		lar=a[i];
		}
		}
		System.out.println("largest number is:"+lar);
		}
		


	}



