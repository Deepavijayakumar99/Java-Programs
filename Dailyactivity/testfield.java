class employee
{
int sal=30000;
void disp()
{
System.out.println("employee salary is:"+sal);
}
}
class permanentemp extends employee
{
double hike=0.6;
void disp1()
{
System.out.println("employee salary is:"+(sal+(sal*hike)));
}
}
class tempoaryemp extends employee
{
double hike=0.4;
void disp2()
{
System.out.println("employee salary is:"+(sal+(sal*hike)));
}
}
class testfield
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