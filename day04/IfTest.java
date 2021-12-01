package day04;
import java.util.*;

public class IfTest {

	public static void main(String[] args) {
//		조건문 if문
		/*
		 * [1]
		 * if(조건식){
		 *      실행할 문장;
		 * 
		 * }
		 */
		int a=5;
		if(a>2) {
			System.out.println(a+" 는 2보다 큽니다.");
		}
		System.out.println("****************************");
		
		/*
		 * [2]
		 * if(조건식){
		 *    실행문1;
		 * }else{
		 *    실행문2;
		 * }
		 */
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요=> ");
		int b=sc.nextInt();
		System.out.println("b: "+b);
//		사용자가 입력한 값 b가 양수면 "양수입니다", 음수면 "음수입니다"를 출력하는 프로그램 작성.
		if(b>0) {
			System.out.println(b+"양수입니다.");
			System.out.println("########");
		}
		else{
			System.out.println(b+"음수입니다. 또는 0입니다.");
			System.out.println("@@@@@@@@");
		}
		System.out.println("Bye Bye~~~~");
       
		

	}

}
