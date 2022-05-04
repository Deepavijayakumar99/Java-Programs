class parent
{
void disp()
{
System.out.println("parent class excute");
}
}
class child extends parent
{
void disp1()
{
System.out.println("child class excute");
}
}
class Grandchild extends child
{
void disp2()
{
System.out.println("Grandchild class excute");
}
}
class Testmultilevel
{
public static void main(String arg[])
{
Grandchild g=new Grandchild();
g.disp();
g.disp1();
g.disp2();
}
}