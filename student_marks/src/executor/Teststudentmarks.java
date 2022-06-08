package executor;

import entity.Students_details;

public class Teststudentmarks {

	public static void main(String[] args)
	{
		Students_details s=new Students_details("");
		s.setName("preetha");
		s.setSubject1(79);
		s.setSubject2(80);
		s.setSubject3(90);
		s.getTotalmarks();
		System.out.println("The marks of subject1="+s.getSubject1());
		System.out.println("The marks of subject2="+s.getSubject2());
		System.out.println("The marks of subject3="+s.getSubject3());
		System.out.println("The marks of total="+s.getTotalmarks());
		
		

	}

}
