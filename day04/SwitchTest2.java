package day04;
import java.util.*;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-------Cafe Menu-----------");
		System.out.println("아메리카노: 2000원");
		System.out.println("카페라떼, 카푸치노, 에스프레소:3500원");
		System.out.println("생과일주스: 4000원");
		System.out.println("----------------------------");
		
		System.out.println("무슨 음료를 드릴까요?");
		String menu= sc.next();//sc.next();스트링 입력
		System.out.println("menu: "+menu);
		System.out.println("몇 잔 드릴까요?");
		int cup=sc.nextInt();
		
		int price=1;//단가
		switch(menu) {
		case "아메리카노":
			price=2000;
			break;
		case "까페라떼","카푸치노","에스프레소":
			price=3000;
		    break;
		case "생과일주스":
			price=4000;
			break;
		default:
			System.out.println("없는 메뉴입니다. 다시 선택하세요.");
			return;
		
			
		
		}
		System.out.println("1. 선택한 음료: "+menu);
		System.out.println("2. 수     량 : "+cup);
		System.out.println("3. 단     가 : "+price+"원");
		System.out.println("4. 결제   총액: "+(price*cup)+"원");
		

	}

}
