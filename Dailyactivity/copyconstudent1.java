class copyconstudent1
{
int rollno;
String name;
copyconstudent1(int r,String n)
{
rollno=r;
name=n;
}
copyconstudent1()
{
}
void disp()
{
System.out.println(rollno+" "+name);
}
public static void main(String args[])
{
copyconstudent1 c=new copyconstudent1(80,"preetha");
copyconstudent1 c1=new copyconstudent1();
c1.rollno=c.rollno;
c1.name=c.name;
c.disp();
c1.disp();
}
}
