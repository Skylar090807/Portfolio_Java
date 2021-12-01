package day03;
import java.util.Scanner;//콘솔창에서 값 입력

public class Operator3 {

	public static void main(String[] args) {
//  이항 연산자
//		+, -, *, /, %
		Scanner sc=new Scanner(System.in);
		System.out.println("정수1을 입력하세요");
		int a=sc.nextInt();
		System.out.println("a: "+a);
		
		System.out.println("정수2를 입력하세요");
		int b=sc.nextInt();
		System.out.println("b: "+b);
		
		System.out.println("a+b"+(a+b));
		System.out.println("a-b"+(a-b));
		System.out.println("a*b"+(a*b));
		System.out.println("a/b"+(a/b));
		System.out.println("a%b"+(a%b));
		System.out.println("-------------");
		
//		비교 연산자
		/* 1) < : 작은가? 작을 경우 true
		 * 2) <= : 작거나 같은가?
		 * 3) > : 큰가?
		 * 4) >= : 크거나 같은가?
		 * 5) == : 같은가?
		 * 6) != : 다른가?
		 */
		
		  System.out.println("a<b: "+(a<b));
		  System.out.println("a<=b: "+(a<=b));
		  System.out.println("a>b: "+(a>b));
		  System.out.println("a>=b: "+(a>=b));
		  System.out.println("a==b: "+(a==b));
		  System.out.println("a!=b: "+(a!=b));
		  
		

	}

}
