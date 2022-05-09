class student
{
student()
{
System.out.println("parent class method...");
}
}
class divides extends student
{
divides()
{
System.out.println("child class method execute..");
}
public static void main(String args[])
{
divides d=new divides();
d.disp();
}
}