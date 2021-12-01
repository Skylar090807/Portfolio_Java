package day03;
import java.util.Date;

public class ReferenceType {

	public static void main(String[] args) {
		System.out.println("--Reference Type--------");
		/*참조형
		 * 1)클래스형
		 * 2)인터페이스형
		 * 3)배열
		 * -참조형은 반드시 new 연산자로 객체를 생성해서 사용해야 한다.
		 * 예외) Sting은 자주 사용하므로 기본자료형 처럼 문자열 값을 
		 *      직접 할당 허용.
		 * 
		 */
		String s1=new String("Hello");
//		import java.lang.String 기본 값으로 선언하지 않아도 됨.
		String s2="반갑습니다~~";
//		new 사용않고 값에 큰따옴표 사용.
		Date d1=new Date();
//		java.util.Date
		Object o1=new Object();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(d1);
		System.out.println(o1);
//		java.lang.Object@2eee9593
//		@는 et의미. 2eee9593(16진수)
		
		int n1=100;
//		기본자료형 값(literal) 을 직접 할당.
		System.out.println(n1);
	}

}
