import java.util.Arrays;
class sortingelement
{
public static void main(String args[])
{
int a[]={10,3,5,7,80};
System.out.println("before removing the elements:"+ Arrays.toString(a));
int index=1;
for(int i=index;i<a.length-1;i++)
{
a[i]=a[i+1];
}
System.out.println("after removing the elements:"+ Arrays.toString(a));
}
}