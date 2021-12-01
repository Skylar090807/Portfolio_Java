package day04;

public class Operator5 {

	public static void main(String[] args) {
//		Shift 연산자: >>, <<, >>>
//		-비트 이동
		int a=3;
//		비트로 바꾸어 연산.
//		3   : 00000000 00000000 00000000 00000011
//		3>>2: 00000000 00000000 00000000 00000000
//		3<<2: 00000000 00000000 00000000 00001100
		System.out.println("a>>2: "+(a>>2));
		System.out.println("a>>1: "+(a>>1));
		System.out.println("a<<2: "+(a<<2));
		System.out.println("a>>>2: "+(a>>>2));
		System.out.println("--------------------");
/*      [1] >>: 오른쪽으로 비트 수 만큼 이동. 왼족에 남은 빈칸은 부호비트로 채운다.
 *      [2] <<: 왼쪽으로 비트 수 만큼 이동. 오른쪽에 남은 빈칸은 0으로 채운다.
 *      [3}>>>: 오른쪽으로 비트 수 만큼 이동. 왼쪽에 남은 빈칸은 0으로 채운다.(양수로 만듬)
 * 
 */
//		음수 표현

		int b=-3;
		System.out.println("b>>2: "+(b>>2));
		System.out.println("b>>>2: "+(b>>>2));
		System.out.println("b<<2: "+(b<<2));

	}

}
