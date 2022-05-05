class employee
{
int empname;
int sal=30000;
void disp()
{
System.out.println("employee name preetha ");
System.out.println("employee salary is:"+sal);
}
}
class permanentemp extends employee
{
double hike=0.5;
void disp1()
{
System.out.println("permanent employee salary hike is:"+(sal+(sal*hike)));
}
}
class tempoaryemp extends employee
{
double hike=0.3;
void disp2()
{
System.out.println("tempoary employee salary hike is:"+(sal+(sal*hike)));
}
}
class testemployeehike
{
public static void main(String args[])
{
permanentemp p=new permanentemp();
tempoaryemp t=new tempoaryemp();
p.disp();
p.disp1();
t.disp();
t.disp2();
}
}

