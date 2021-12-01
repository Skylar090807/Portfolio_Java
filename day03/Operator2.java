package day03;

public class Operator2 {

	public static void main(String[] args) {
//		3. 비트별 not 연산자: ~
//		값을 비트(0,1)로 바꿔 연산.
//		~가 붙으면 0=1, 1=0 
		int a=42;
		System.out.println("a: "+a);
		System.out.println("a: "+(~a));
		/*
		 * 42
		 * 21...0
		 * 10...1
		 *  5...0
		 *  2...1
		 *  1...0
		 *  42=2진수 101010
		 *  int형 표현 32byte
		 *   42=00000000 00000000 00000000 00101010
		 *  ~42=11111111 11111111 11111111 11010101->-43
		 *
		 */
		
		System.out.println("4. 논리부정 연산자:!");
//		!: true는 false로, false는 true로 바꿈.
//		논리값이나 논리식 앞에 사용.
		boolean b=true;
		System.out.println(b);
		System.out.println(!b);
		System.out.println(2>3);
		System.out.println(!(2>3));
		
//		= :대입연산자
//		== :값이 같은지 비교. true or false
//		!= : 다르면 true 같으면 flase
		int x=5;
		double y=5.0;
		System.out.println(x==y);
		System.out.println(x!=y);
		
 
	}

}
