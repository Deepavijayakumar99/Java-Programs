abstract class plant
{
abstract public void disp();
public void show()
{
System.out.println("plant produced flower..");
}
}
class flower extends plant
{
public void disp()
{
System.out.println("flower is beautiful...");
}
}
class ad
{
public static void main (String args[])
{
flower f=new flower();
f.disp();
f.show();
}
}