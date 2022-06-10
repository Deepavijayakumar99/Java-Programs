package executor;

import entity.Student;//entity package
import entity.Teacher;

public class Testassociation {

	public static void main(String[] args) {
	Teacher t=new Teacher("preetha");//call method teacher
	 Student s=new  Student ("elango");//call method student
	 System.out.println("The name of teacher is:"+t.getName());
	 System.out.println("The name of student is:"+s.getStudentName());
	 
	
		

	}

}
