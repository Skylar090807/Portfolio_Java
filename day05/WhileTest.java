package day05;



public class WhileTest {

	public static void main(String[] args) {
		/* 변수 초기화식;
		 * while(조건식){
		 *     반복 실행할 문장;
		 *     증감식;
		 * }
		 * 조건이 true면 반복실행 문장을 실행.
		 * 조건이 false면 반복문을 벗어난다.
		 * 
		 * 
		 */
		
		int a=1;
		while(a<5) {
			System.out.println("Hello : "+a);
			a++;
		}
		System.out.println("-The End- :"+a);
		
		int b=3;
		while(b>0) {
			System.out.println("Java: "+b);
			b-=2;
		}
		System.out.println("-The End- :"+b);
		
//		while(true) {
//			System.out.println("무한 루프");
//		}드래그 ctrl+/ =전체 주석 만들기

//		[1]while 루프를 이용해서 100~1까지 3의 배수 출력.
//		[2]while 루프를 이용해서 구구단 3단 출력.
//		[3]while 루프를 이용해서 구구단 전체를 출력하되 아래와 같은 형태로 출력.
		/*
		 * 2x1=2  3x1=3  4x1=4  
		 */
		
		//[1]
		int k=100;
		while(k>0) {
			if(k%3==0) {
				System.out.println(k);
			}
			k--;
		}
		
		//[2]
		int dan=3;
		int j=1;
		while(j<10) {
			System.out.println(dan+"x"+j+"="+dan*j);
			j++;
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		//[3]while 중첩
		int l=1;
		while(l<10 ) {//행의 조건
			int m=2;
			while (m<10) {
				System.out.print(m+"x"+l+"="+(l*m)+"\t");
				m++;
			}
			l++;
			System.out.println();
		}
		
		
		System.out.println("-------------------------------------------------------------------------");
		

		
		
	}//main()

	
}//class
