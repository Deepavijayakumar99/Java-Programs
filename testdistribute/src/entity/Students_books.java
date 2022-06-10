//program  to distribute the book of students equally by accepting no of students using encapsulation
package entity;

import java.util.Scanner;

public class Students_books {
	private int books;//intialize
	private int dist_books;
       
	
       
		Scanner s = new Scanner(System.in);
		int	Students = s.nextInt();
	 System.out.println("Enter no of Students");
	
	public int getDist_books() {
		
		dist_books = books/Students;
		return dist_books;
	}
     public Students_books() {
		super();
		
	}public int getStudents() {
		
		return Students;
	}
	
	public int getBooks() {
		return books;
	}
	public void setBooks(int books) {
		this.books = books;
	}
	
	

	



}




