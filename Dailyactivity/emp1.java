class emp1
{
int empid;
String name;
String companyname="ford";
emp1(int e,String n)
{
empid=e;
name=n;
}
void disp()
{
System.out.println(empid+" " +name+" "+companyname);
}
public static void main(String args[])
{
emp1 e1=new emp1(1,"preetha");
emp1 e2=new emp1(2,"surya");
e1.disp();
e2.disp();
}
}