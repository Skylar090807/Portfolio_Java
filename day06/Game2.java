package day06;
import java.util.*;

public class Game2 {
	
	public static void showMenu(){
		System.out.println("*********Game v1.1**********");
		System.out.println("1. 가위 2.바위 3.보 9.종료");
		System.out.println("****************************");
		System.out.println("숫자를 입력하세요: ");
		System.out.println("****************************");
	}

	public static void main(String[] args) {//main() JVM 호출
		Scanner sc=new Scanner(System.in);
		
		//showMenu() 호출하기.
		int no=0;
		
		
		do {
		Game2.showMenu();
		no=sc.nextInt();//사용자 입력
		//컴퓨터가 랜덤하게 (1,2,3)중 하나를 발생.
		int com=(int)(Math.random()*3+1);
		
		//[1]사용자가 (1,2,3) 없는 번호 입력 "입력 오류! 메뉴에 있는 번호를 입력하세요."
		//게임 계속 진행.
		if(no==9) break;
		if(no<1 || no>3) {
			System.out.println("입력 오류! 메뉴에 있는 번호를 입력하세요.");
			continue;
		}
		System.out.println("가위바위보 결과...");
		
		
		//[2]사용자가 비긴 경우
		String msg="";
		if(no==com) {
			msg="무승부.";
		}else if((no==1&&com==3)||(no==2&&com==1)||(no==3&&com==2)) {
			msg="승리";
		}else {
			msg="졌습니다.";
		}
		//   사용자가 이긴 경우 (no==1 com==3), (no==2 com==1),(no==3 com==2)
		//   사용자가 진 경우
		System.out.println("com: "+com);
		System.out.println("user: "+no);
		System.out.println(msg);
		
		
		
		//사용자가 입력한 값이 9이면 종료.
		}while(true);
		System.out.println("Game Finished");
 
	}//main()

}//class
