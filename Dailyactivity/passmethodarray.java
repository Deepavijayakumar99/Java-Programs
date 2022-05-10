class passmethodarray
{
static void disp(int a[])
{
int min=a[0];
for(int i=0;i<a.length;i++)
if(min>a[i])
min=a[i];
System.out.println(min);
}
public static void main(String args[])
{
int a[]={10,3,1,8};
disp(a);
}
}