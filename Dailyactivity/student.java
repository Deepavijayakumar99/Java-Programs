class student
{
int rollno;
String sname;
int mark;
student(int r,String s)
{
rollno=r;
sname=s;
}
student(int r,String s,int m)
{
rollno=r;
sname=s;
mark=m;
}
void disp()
{
System.out.println(rollno +" "+sname+" "+mark);
}
public static void main(String args[])
{
student stu=new student(1,"preetha");
student stu1=new student(2,"praba",100);
stu.disp();
stu1.disp();
}
}

