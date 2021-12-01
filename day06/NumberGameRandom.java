package day06;
import java.util.*;

public class NumberGameRandom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		1. 컴퓨터가 랜덤한 정수값 발생시키기(1<= num <101)
		int num=(int)(Math.random()*100+1);
		System.out.println("*********Number Game********");
		System.out.println("게임 시도 7회 안에 숫자를 맞춰보세요.");
		System.out.println();
		
		
//		2.무한루프 돌면서 컴퓨터가 발생한 값을 맞추는 게임 작성.
//		정답 맞추면 반복문 벗어난다.
		int count=0;
	    while(true) {
		    System.out.println("1~100 사이의 정수값 입력하세요: ");
		    int input=sc.nextInt();
		    count++;//게임 시도 횟수
		    //입력받은 값과 정답을 비교해서 메시지 출력.
		    if(count>7) {
		    	System.out.println("실패!!! 게임 시도 횟수는 7번입니다.");
		    }
		    if(input == num) {
		    	System.out.println("정답!!!");
		    	break;
		    }else if(num>input) {
		    	System.out.println("더 큰 수 입력: ");
		    }else {
		    	System.out.println("더 작은 수 입력: ");
		    }
		
		

		
		//단 시도 횟수는 7회로 제한.
		}//while
	    System.out.println();
	    System.out.println("------------------------------");
	    System.out.println("게임시도 횟수: "+count);
	    System.out.println("정답 : "+num);

	}//main()

}//class
