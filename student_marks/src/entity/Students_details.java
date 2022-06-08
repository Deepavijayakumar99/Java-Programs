package entity;

public class Students_details
{
	

	private String name;
	private int rollno;
	private int subject1;
	private int subject2;
	private int subject3;
	private int totalmarks;
	
	public Students_details(String name) {
		super();
		this.name = name;
	}

	public Students_details(int rollno) {
		super();
		this.rollno = rollno;
	}

	public Students_details(int subject1, int subject2, int subject3)
	{
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getSubject1() {
		return subject1;
	}

	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}

	public int getSubject2() {
		return subject2;
	}

	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}

	public int getSubject3() {
		return subject3;
	}

	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}
	public void setTotalmarks(int totalmarks)
	{
		this.totalmarks = totalmarks;
	}
	public int getTotalmarks()
	{
		return totalmarks = subject1+subject2+subject3;
		
	}


	
	}
	

	

