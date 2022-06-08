package executor;

import entity.Studentsbooks;

public class Distributionbooks {

	public static void main(String[] args) {
		Studentsbooks s=new Studentsbooks ();
		s.setStudents(20);
		s.setBooks(100);
		System.out.println("Total number of students:"+s.getStudents());
		System.out.println("Total number of books :"+s.getBooks());
		System.out.println(" Each students should get atleast :"+s.getDistribute_books());
		
	}

}
