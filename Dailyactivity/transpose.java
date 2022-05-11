class transpose
{
public static void main(String args[])
{
int a[][]={{10,20},{40,60}};
int b[][]=new int[2][2];
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.println(a[i][j]+" ");
}
System.out.println();
}
System.out.println("after elements transpose are:");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
b[i][j]=0;
b[i][j]=a[j][i];
System.out.println(b[i][j]+" ");
}
System.out.println();
}
}
}

