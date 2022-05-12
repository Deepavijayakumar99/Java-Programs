import java.util.Scanner;
class acceptadd
{
public static void main(String args[])
{
int a[][]={{10,20},{40,60}};
int b[][]={{20,31},{10,60}};
int sum[][]=new int[2][2];
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
sum[i][j]=a[i][j]+b[i][j];
System.out.println(sum[i][j]+" ");
}
System.out.println();
}
}
}