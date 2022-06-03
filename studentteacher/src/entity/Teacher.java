package entity;

public class Teacher {
	private String tname;
	private String subjectname;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String tname, String subjectname) {
		super();
		this.tname = tname;
		this.subjectname = subjectname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	@Override
	public String toString() {
		return "Teacher [tname=" + tname + ", subjectname=" + subjectname + "]";
	}
}
	
		