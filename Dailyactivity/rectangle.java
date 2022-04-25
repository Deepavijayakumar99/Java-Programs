class testclass1
{
int length=10,breath=20;
void disp(int l,int b)
{
length=l;
breath=b;
}
void show()
{
int area =length*breath;
System.out.println("area of rectangle"+area);
}
}
class rectangle{
public static void main(String args[])
{
testclass1 t = new testclass1();
t.show();
}
}
