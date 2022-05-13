import java.util.Scanner;
class Reverse1
{
public static void main(String args[])
{
String a,b="";
int length;
Scanner s=new Scanner(System.in);
System.out.println("the String words:");
a=s.nextline();
length=a.length();
for(int i=length-1;i>=0;i--)
{
char ch;
ch=a.charAt(i);
b=b+ch;
}
System.out.println("reverse the String is:"+b);
}
}