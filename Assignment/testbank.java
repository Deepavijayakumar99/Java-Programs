class bank
{
int rateofinterest()
{
return 0;
}
void interest()
{
System.out.println("welcome to bank portal....");
}
}
class Axis extends bank
{
void interest()
{
int rateofinterest()
{
return 3;
}
System.out.println("welcome Axis to bank portal....");
}
}
class Icic extends Axis
{
void interest()
{
int rateofinterest()
{
return 4;
}
System.out.println("welcome Icic to bank portal....");
}
}
class testbank
{
public static void main(String args[])
{
Icic I=new Icic();
Axis A=new Axis();
System.out.println("Icic rateofinterest:");
System.out.println("Axis rateofinterest:");
}
}
