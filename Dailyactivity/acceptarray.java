import java.util.Scanner;
class acceptarray
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the size of rows:");
int row=s.nextInt();
System.out.println("enter the columns of rows:");
int column=s.nextInt();
int array[][]=new int[row][column];
System.out.println("enter the elements of array:");
for(int i=0;i<row;i++)
{
for(int j=0;j<column;j++)
{
array[i][j]=s.nextInt();
}
}
System.out.println("the elements array are:");
for(int i=0;i<row;i++)
{
for(int j=0;j<column;j++)
{
System.out.println(array[i][j]);
}
}
}
}

