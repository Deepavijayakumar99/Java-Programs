package execute;

import entity.Student;
import entity.Teacher;
import service.Relationalclass;

public class Mainmethod
{
	public static void main(String arg[])
	
	{

	Student s=new Student();
	s.setId(1);
	s.setName("depa");
	Teacher t=new Teacher();
	t.setTname("mercy");
	t.setSubjectname("java");
	Relationalclass.giveclass(s);
	Relationalclass.takeclass(t);
	}
	

}
