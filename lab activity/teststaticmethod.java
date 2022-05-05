class Student
{  
int rollno;  
String name;  
static String college = "APOLLO";  
static void change()
{  
college = "VIT";  
}  
Student(int r, String n)
{  
rollno = r;  
name = n;  
}  
void display(){System.out.println(rollno+" "+name+" "+college);
}  
}  
class teststaticmethod
{  
public static void main(String args[])
{  
Student.change();
Student s1 = new Student(101,"Ammu");  
Student s2 = new Student(102,"Deepa");  
Student s3 = new Student(103,"Preetha");  
s1.display();  
s2.display();  
s3.display();  
}  
}