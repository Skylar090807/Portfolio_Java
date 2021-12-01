package day04;
import java.util.*;

public class IfTest2 {

	public static void main(String[] args) {
//		[1] if~ else 문 이용하기.
//		Scanner를 이용해서 정수를 하나 입력 받고
//		입력받은 값이 짝수이면 "Even", 홀수이면 "Odd"
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요=> ");
		int num=sc.nextInt();
		System.out.println("num: "+num);
		
		if(num%2==1) {
			System.out.println("Odd");
		 
		}
		else {
			System.out.println("Even");
		}
		
//		[2] 위 프로그램을 삼항연산자(조건연산자)를 이용해서 풀어보세요.
		String str=(num%2==0)? "Even":"Odd";
		System.out.println(str);
	}

}
