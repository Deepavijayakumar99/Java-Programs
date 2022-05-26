class Outerclass1
{
int a=209;
void disp()
{
class Innerclass
{
void disp1()
{
System.out.println(a);
}
}
Innerclass i=new Innerclass();
i.disp1();
}
public static void main(String args[])
{
Outerclass o=new Outerclass();
o.disp();
}
}