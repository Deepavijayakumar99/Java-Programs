package entity;

public class Studentsbooks 
{
	private int students;
	private int  books;
	private int distribute_books;
	public int getDistribute_books() {
		
	
	
		this.distribute_books = books/students;
		return distribute_books;
	}
	public Studentsbooks() {
		super();
		
	}
	public int getStudents() {
		return students;
	}
	public void setStudents(int students) {
		this.students = students;
	}
	public int getBooks() {
		return books;
	}
	public void setBooks(int books) {
		this.books = books;
	}
}