import java.util.Scanner;

class emppay
{
    String name;
    double salary;
    double da;
    double hra;
    double it;
    double grossSal;
    double netSal;
    
    emppay(String n, double s)
	{
        name = n;
        salary = s;
        da = 0;
        hra = 0;
        it = 0;
        grossSal = 0;
        netSal = 0;
    }
    
    void calculate() {
        da = salary * 10.0 / 100;
        hra =  salary * 05.0 / 100;
        it = salary * 03.0 / 100;
        grossSal = salary + da + hra;
        netSal = grossSal - it;
    }
    
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Dearness Allowance: " + da);
        System.out.println("House Rent Allowance: " + hra);
        System.out.println("income tax: " + it);
        System.out.println("Gross Salary: " + grossSal);
        System.out.println("Net Salary: " + netSal);
    }
    
    public static void main(String args[]) 
	{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String empName = in.nextLine();
        System.out.print("Enter Salary: ");
        double empSal = in.nextDouble();
        
        emppay p = new emppay(empName, empSal);
        p.calculate();
        p.display();
    }
}