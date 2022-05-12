interface I
{
void disp();
}
class childs implements I
{
public void disp()
{
System.out.println("Interface method..");
}
public static void main(String args[])
{
childs c=new childs();
c.disp();
}
}
