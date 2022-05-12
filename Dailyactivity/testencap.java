class student
{
private int mark;
public int getmark()
{
return mark;
}
public void setmark(int mark)
{
this.mark=mark;
}
}
class testencap
{
public static void main(String args[])
{
student s=new student();
s.setmark(45);
System.out.println("the mark is:"+s. getmark());
}
}