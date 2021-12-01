package sec05.exam01;

public class Student extends People {//People 클래스를 Student 클래스에 상속받는다.
    public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

}
