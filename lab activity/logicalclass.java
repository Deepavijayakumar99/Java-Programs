import java.util.Scanner;
class logicalclass
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the first num:");
int a=s.nextInt();
System.out.println("enter the second num:");
int b=s.nextInt();
System.out.println("enter the third num:");
int c=s.nextInt();
int d=0;
if((a>b)&&(a>c))
{
d=a+b+c;
System.out.println("addition is:"+d);
}
else
{
System.out.println("condition fail...");
}
if((a>b)||(c<b))
{
System.out.println("true...");
}
else
{
System.out.println("false...");
}
if(!(a<b))
{
System.out.println("true...");
}
else{
System.out.println("false...");
}
}
}
