import java.util.Scanner;
class studentsavg
{
public static void main(String args[])
{
float tam,eng,mat,sci,soc,sum,avg;
Scanner in=new Scanner(System.in);
System.out.print("enter five subject mark:");
tam = in.nextInt();
eng = in.nextInt();
mat = in.nextInt();
sci = in.nextInt();
soc = in.nextInt();
sum=tam+eng+mat+sci+soc;
avg=sum/5;
System.out.println("sum of all five subjects:"+sum);
System.out.println("average of five subjects:"+avg);
}
}