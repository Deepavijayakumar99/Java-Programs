class student
{
student()
{
System.out.println("parent class method...");
}
}
class division extends student
{
division()
{
System.out.println("child class method execute..");
}
public static void main(String args[])
{
division d=new division();
d.disp();
}
}