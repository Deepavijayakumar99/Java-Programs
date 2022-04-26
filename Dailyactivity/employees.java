class employees
{
String ename;
int empid;
employees(String e,int i)
{
ename=e;
empid=i;
}
void disp()
{
System.out.println(ename+" "+empid);
}
public static void main(String args[])
{
employees emp1=new employees("preetha",34);
emp1.disp();
}
}