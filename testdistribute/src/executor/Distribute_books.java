package executor;

import entity.Students_books;

public class Distribute_books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			
			Students_books s = new Students_books();
			s.setBooks(100);
			
			System.out.println("Total nummber of students : "+s.getStudents());
			System.out.println("Total nummber of books : "+s.getBooks());
			System.out.println("each students should get atleast "+s.getDist_books());
			

		}

	

	}


