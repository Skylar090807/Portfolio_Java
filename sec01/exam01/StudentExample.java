package sec01.exam01;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();//Student 클래스 이용해 객체 생성 후 s1에 대입
		System.out.println("s1 변수가 Student 객체를 참조.");
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체 참조.");
	}

}
