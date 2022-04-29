import java.util.Scanner;
class bikerider
{
String ridername;
int days;
int charge;
String bikeno;
void input()
{
Scanner S = new Scanner(System.in);
System.out.println("enter rider name:");
ridername = S.nextLine();
System.out.println("enter bike number:");
bikeno = S.nextLine();
System.out.println("enter no of days:");
days=S.nextInt();
}
void compute()
{
if(days<=5)
{
charge=days*500;
}
else if(days<=10)
{
charge=5*500+(days-5)*400;
}
else
{
charge=5*500+5*400+(days-10)*200;
}
}
void disp()
{
System.out.println("ridername is:"+ridername);
System.out.println("bikenumber:"+bikeno);
System.out.println("no of days u want to hire:"+days);
System.out.println("charge for bike:"+charge);
}
public static void main(String args[])
{
bikerider b=new bikerider();
b.input();
b.compute();
b.disp();
}
}


