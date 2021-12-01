package sec05.exam01;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("È«±æµ¿", "123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
		
		System.out.println("---------------------------------------");
		
		Teacher csh = new Teacher("ÃÖ½ÂÈñ", "123456-7890123",101,"¼­¿ï½Ã");
		System.out.println("name: "+csh.name);
		System.out.println("ssn: "+csh.ssn);
		System.out.println("TeacherNo: "+csh.TeacherNo);
		System.out.println("Address: "+csh.addr);
		

	}

}
