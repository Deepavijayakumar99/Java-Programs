class emp2
{
int empid;
String name;
static String companyname="ford";
emp2(int e,String n)
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
emp2 e1=new emp2(1,"preetha");
emp2 e2=new emp2(2,"surya");
e1.disp();
e2.disp();
}
}