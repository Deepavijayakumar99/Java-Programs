class college
{
college()
{
System.out.println("the college name is:VIT");
}
}
class dept extends college
{
dept()
{
System.out.println("the dept name is:ECE");
}
}
class divide extends dept
{
divide()
{
System.out.println("the divide is :A");
}
}
class multilevel
{
public static void main(String arg[])
{
divide d=new divide();
}
}