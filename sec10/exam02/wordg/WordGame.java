package sec10.exam02.wordg;

import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 int num;
		 int n=0;
		 String word ="크로뮴";//프로그램 첫 단어 설정
		 String lastWord, newWord;
		 Player []player;
		 
		 System.out.println("-----------------------------------------");
		 System.out.println("************The Word Game****************");
		 System.out.println("-----------------------------------------");
		 System.out.println();
		 System.out.print("게임에 참가하는 인원은 몇명입니까?  >> ");
		 num = input.nextInt();//참가자 인원 수 입력받은 값 num에 대입
		 player=new Player[num];//참가자 인원 수(num) 만큼 배열 생성 
		 
		 for(int i =0; i<player.length; i++) {//참가자 인원 수 까지 1씩 증가하여 아래 수행
		  System.out.print("참가자의 이름을 입력하세요 >>");
		  player[i] = new Player(input.next()); //참가자 이름을 name에 넣어줌
		 }
		 
		 lastWord = word;
		 System.out.println("시작하는 단어는  "+ lastWord + "입니다.");
		 
		 while(true) {//while 루프 
		  System.out.print(player[n].name + ">> ");
		  newWord = player[n].sayWord(input.next());//player 순서에 맞는 참가자가 입력한 단어를
//		                                              newWord에 대입.
		  if(player[n].succeed(lastWord)) { //lastWord 값 가지고 Player클래스 불린 메소드 실행
		   lastWord = newWord; //newWord를 lastWord로 대입
		   n++; //참가자 배열 다음 순서로 증가
		    if(n==num) //n은 입력받은 참가자 수와 같으면 0으로 초기화.
		     n=0;
		     continue; //continue 문으로 다시 반복 수행. 
		  }
		   else {//Player 클래스 불린 메소드 결과가 false일 때 실행.
		    System.out.println(player[n].name + "님이 졌습니다.");
		       break;//break문으로 while 루프 빠져나옴.
		   }
		  }
		  input.close();//스캐너 입력 종료.
		  System.out.println("----------------------------------------");
		  System.out.println("Maker: 최승희");
		  
		  
		}//main

	}//class


