class parent
{
void disp()
{
System.out.println("parent class invoke...");
}
}
class child extends parent
{
void disp1()
{
System.out.println("child class invoke...");
}
}
class Testinheritance
{
public static void main(String args[])
{
child p=new child();
p.disp();
p.disp1();
}
}