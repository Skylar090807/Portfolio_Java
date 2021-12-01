package day02;

public class DataType {

	public static void main(String[] args) {
		System.out.println("1. 자바의 자료형---------");
		System.out.println("1) 정수형************");
		/*byte 1byte :-2^7 ~ 2^7-1 (-128 ~127)
		 * short 2byte: -2^15 ~ 2^15 -1 
		 * int 4byte:-2^31 ~ 2^31-1
		 * long 8byte:-2^63 ~ 2^63-1
		 * byte < short < int < long
		 * 
		 */
		 byte a=10; //자바
		 //자료형 변수이름= 값;
		 
		 System.out.println(a);
		 byte b=-128;
		 byte c=127;
		 System.out.println("b: "+b);
		 System.out.println("c: "+c);
		 
		 //byte d를 선언 값 128을 넣으세요.
		 //byte d=128;
		 //결과는 오류.
		 //byte 범위를 넘어서기 때문. int로 인식.
		 short d=128;
		 System.out.println("d: "+d);
		 short e= -5000;
		 System.out.println("e: "+e);
		 
		 int i= 4547487;
		 System.out.println("i: "+i);
		 
		 long j=800L;//접미사L을 붙임.
		 long k=8000000L;
		 System.out.println("j: "+j);
		 System.out.println("k: "+k);
		 
		 int x=1000000000;//0이 9개
		 long y=10000000000L;//0이 10개
		 //L을 붙이지 않으면 int로 인식.
		 
		 //정수형의 default는 int
		 //출력문
		 System.out.println("x: "+x);
		 System.out.println("y: "+y);
		 
		 int n=010;//8진수로 인식.(0을 접두어로 붙임)
		 System.out.println("n: "+n);
		 int m=011;
		 System.out.println("m: "+m);
		 
		 int z=0xa5;	//16진수로 인식.(0x를 접두어로 붙인다)
		 System.out.println("z: "+z);
		 
		 int s=0b1101;
		 //2진수로 인식. 0b를 접두어로 붙임.
		 System.out.println("s: "+s);
		 
		 
		 
		 

	}

}
