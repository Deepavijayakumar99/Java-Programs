import java.util.Scanner;
class switchclass
{
public static void main(String args[])
{
int num1,num2;
int operator;
Scanner s=new Scanner(System.in);
System.out.println("enter two numbers:");
num1=s.nextInt();
num2=s.nextInt();
System.out.println("enter the value of operator: + - * /");
System.out.println("choose the  operator");
operator=s.next().charAt(0);
switch(operator)
{
case'+':System.out.println("addition of two numbers:"+(num1+num2));
        break;
case'-':System.out.println("subtraction of two numbers:"+(num1-num2));
        break;
case'*':System.out.println("multiplication of two numbers:"+(num1*num2));
        break;
case'/':System.out.println("division of two numbers:"+(num1/num2));
        break;
default:
       System.out.println("invalid number");
}
}
}	   