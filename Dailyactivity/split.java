class student
{
int regno=20;
}
class split extends student
{
int regno=30;
void disp()
{
System.out.println(super.regno);
}
public static void main(String args[])
{
split s=new split();
s.disp();
}
}