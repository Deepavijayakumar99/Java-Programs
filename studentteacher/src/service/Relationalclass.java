package service;

import entity.Student;
import entity.Teacher;

public class Relationalclass {

	public static void giveclass(Student s)
	{
		System.out.println("the teacher is teaching to"+s.getName());
	
		
	}
	public static void takeclass(Teacher t)
	{
		System.out.println(" the name of teacher who teacher"+t.getTname());
	}

}
