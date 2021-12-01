package day02;
import java.util.Date;

public class MyDemo {
	//main method작성
	public static void main(String[] args) {
	//public과 static 순서 변경 가능.  args는 변수 이름
		System.out.println("--Date 객체를 생성해봅시다----");
		//java.util 패키지의 Date class 사용.
		Date today = new Date();
		System.out.println(today);
	}

}
