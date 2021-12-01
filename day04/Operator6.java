package day04;

public class Operator6 {

	public static void main(String[] args) {
		System.out.println("조건연산자(삼항 연산자)-------------");
		/*변수 선언문 = (조건식)? 값1:값2;
		 * -조건식이 true 면 값1을 변수에 대입.
		 * -조건식이 false면 값2를 변수에 대입.
		 * 주의) 선언된 변수와 값1, 값2는 같은 자료형이어야 한다.
		 */
		int a=50;
		int b=60;
		int c=(a<b)? a:b;
//		String c=(a<b)? a+"":b+"";
		System.out.println("c: "+c);
		
		System.out.println("할당 연산자(연산 후 대입연산자)---------");
//		+=, -=, /=, %=, >>=, <<=, >>>=, ...
		int i=3;
		i+=2; //i=i+2;
		System.out.println("i: "+i);
		
//		실습 문제
//		[1]
		int j=9;
		j-=3; // j= j-3;
		System.out.println("j: "+j);
		
//		[2]
		int k=7;
		k*=8; // k= k*8;
		System.out.println("k: "+k);
		
//		[3]
		k/=3; //k= k/3;
		System.out.println("k: "+k);
		
//		[4]
		k%=4;//k= k/4의 나머지;
		System.out.println("k: "+k);


	}

}
