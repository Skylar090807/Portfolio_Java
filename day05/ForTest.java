package day05;

public class ForTest {
	int a=10;//인스턴스(전연)변수.

	public static void main(String[] args) {
		int b=1;//지역변수. main()method block내에서 사용 가능.
		/* 반복문 - for 루프문
		 * for(변수초기화;조건식;증감식)
		 * {
		 *      반복 실행할 문장;
		 * }
		 * -조건식이 true면 반복 실행할 문장 수행.
		 * -조건식이 false면 반복문을 벗어남.
		 */
		for(int i=1;i<=10;i++) {//i 지역변수 scope(유효범위)는 for문 안에서.
			System.out.println("Hello World!"+i);
			
		}//for
		System.out.println("###############");
		
		int j=5;//j의 scope는 선언된 순간부터 main() block 끝까지.
		for(;j>0;j--) {//초기화 이미 선언되었을 때 생략가능.
			System.out.println("Hi Java!"+j);
		}
		System.out.println("@@@@@@@@@@@@@@@");
		
		for(int i=1;i<10;i+=3) {
			System.out.println("i: "+i);
			
		}
		System.out.println("***************");
		
		for(;;) {
			System.out.println("무한 루프");//콘솔 창 레드버튼으로 강제종료.
		}

	}//main

}//class
