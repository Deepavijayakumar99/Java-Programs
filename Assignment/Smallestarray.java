import java.util.Scanner;
public class Smallestarray
{
public static void main(String args[])
{
int a[]=new int[5];
int min=a[0];
Scanner s=new Scanner(System.in);
for(int i=0;i<5;i++)
{
	
System.out.println("enter the values of array:");
a[i]=s.nextInt();
}
min=a[0];
for(int i=0;i<5;i++)
{
if(min>a[i])
{
min=a[i]; 
}
}
System.out.println("minimum number is:"+min);
}
}