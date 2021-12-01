package sec05.exam01;

public class Teacher extends People {
	
    public int TeacherNo;
    public String addr;
	
	public Teacher(String name, String ssn, int TeacherNo,String addr) {
		super(name, ssn);
		this.TeacherNo = TeacherNo;
		this.addr=addr;
	}

}
