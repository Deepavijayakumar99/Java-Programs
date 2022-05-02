class emps
{
int empid;
String name;
static String companyname="ford";
emps(int e,String n)
{
empid=e;
name=n;
}
static void change()
{
companyname="infosys";
}
void disp()
{
System.out.println(empid+" " +name+" "+companyname);
}
public static void main(String args[])
{
emps.change();
emps e1=new emps(1,"preetha");
emps e2=new emps(2,"surya");
e1.disp();
e2.disp();
}
}