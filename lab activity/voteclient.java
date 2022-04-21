import java.util.Scanner;
class voteclient
{
public static void main(String args[])
{
int age;
Scanner s=new Scanner(System.in);
System.out.print("enter the age=");
age=s.nextInt();
if(age>=18)	
{
System.out.println("eligible to vote");
}
else
{
System.out.println("not eligible to vote");
}
}
}