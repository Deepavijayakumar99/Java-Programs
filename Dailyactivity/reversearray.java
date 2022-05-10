import java.util.Scanner;
class reversearray
{
public static void main(String args[])
{
int a[]=new int [5];
Scanner s=new Scanner(System.in);
for(int i=0;i<5;i++)
{
System.out.println("enter the values array:");
a[i]=s.nextInt();
}
System.out.println(" array number in reverse order :");
for(int i=4;i>=0;i--)
{
System.out.println(a[i]);
}
}
}

