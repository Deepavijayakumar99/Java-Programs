class copyconstudent
{
int rollno;
String name;
copyconstudent(int r,String n)
{
rollno=r;
name=n;
}
copyconstudent(copyconstudent s)
{
rollno=s.rollno;
name=s.name;
}
void disp()
{
System.out.println(rollno+" "+name);
}
public static void main(String args[])
{
copyconstudent c=new copyconstudent(3,"preetha");
copyconstudent c1=new copyconstudent(c);
c.disp();
c1.disp();
}
}
