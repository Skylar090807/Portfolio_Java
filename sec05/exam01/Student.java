package sec05.exam01;

public class Student extends People {//People Ŭ������ Student Ŭ������ ��ӹ޴´�.
    public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

}
