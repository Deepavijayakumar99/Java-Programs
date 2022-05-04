class college
{
String name="APOLLO";
}
class student extends college
{
int rollno=1;
public static void main(String args[])
{
student s=new student();
System.out.println("the name of college:"+s.name);
System.out.println("the rollno is:"+s.rollno);
}
}
