package day04;
import java.util.*;

public class SwitchTest {

	public static void main(String[] args) {
		/*
		 * switch(변수 or 수식){ 변수나 수식은 int이하 자료형
		 *                     -byte, short, char, int, String
		 *      case 값1: 실행 문장1; break;
		 *      case 값2: 실행 문장1; break;
		 *      case 값3: 실행 문장1; break;
		 *      ...
		 *      default: 기타 실행문;
		 * }
		 * 주의) 변수, 수식의 결과값과 case문 값은 자료형이 같아야 한다.
		 */
		
		Scanner sc=new Scanner(System.in);
//		1~12월까지 입력받기
//		3,4,5월: "봄입니다"
//		6,7,8월: "여름입니다"
//		9,10,11: "가을입니다"
//		12,1,2: "겨울입니다"
		
		System.out.println("현재 월을 입력하세요=>");
		int month=sc.nextInt();
//		long month=sc.nextLong(); int 이상은 switch문 불가능
		System.out.print(month+"월은 ");
		
		String season="";
		switch(month) {
		case 9,10,11:
			season="가을";
			break;
		case 12,1,2:
			season="겨울";
			break;
		case 3,4,5:
			season="봄";
			break;
		case 6,7,8:
			season="여름";
		    break;
		default:
		    System.out.println("입력 오류! 1월~12월 사이 값을 입력해주세요.");
		    return;
		
		 
		}
		System.out.println(season+"입니다");

	}

}
