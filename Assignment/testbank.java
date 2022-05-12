class bank
{
void interest()
{
System.out.println("welcome to bank portal....");
}
}
class Axis extends bank
{
void interest()
{
super.interest();
System.out.println("welcome Axis to bank portal....");
}
}
class Icic extends Axis
{
void interest()
{
System.out.println("welcome Icic to bank portal....");
}
}
class testbank
{
public static void main(String args[])
{
Icic I=new Icic();
I.interest();
Axis A=new Axis();
I.interest();
}
}
