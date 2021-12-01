package day03;

public class Casting {

	public static void main(String[] args) {
//		promotion(자동형변환):작은 유형에서 큰 유형으로 자동변환.
//		Casting(강제형변환):큰 유형에서 작은 유형으로 강제변환.
//		                 이 때 캐스팅 연산자()를 이용.
/*
 * byte < short <int <long <float <double
 *        char  
 */
		byte b=58;
		float f=b;
		System.out.println("b: "+b);
		System.out.println("f: "+f);
		
		double d=789.123;
		short s=(short)d;//강제형변환
//		Casting 변수=(자료형)값; 데이터 손실 발생할 수 있다.
		System.out.println("d: "+d);
		System.out.println("s: "+s);
		
//		연습문제
		char ch='A';
		int x=ch;
//		출력 결과 :promotion
		System.out.println("ch: "+ch);
		System.out.println("x: "+x);
		
		
		int y=66;
		char c=(char)y;
//		Casting 해보기
//		결과 출력
		System.out.println("y: "+y);
		System.out.println("c: "+c);
		
		byte i=5;//-128 ~ 127
		byte j=3;
		byte k=(byte)(i+j);//연산일 경우 소괄호로 묶음.
		//int k=i+j; //int 보다 큰 자료형 가능.
		/*Java는 int형 이하의 자료형(byte, short, char)을 연산하면
		 * 자동으로 int형으로 형변환 된다.
		 * 
		 */
		System.out.println("i: "+i+", j: "+j);
		System.out.println("k: "+k);
		
		char y2=(char)(ch+5);//char + int -> int
		System.out.println(y2);
		
		int xx=1;
		float yy=2;
		double zz=xx*yy;
//		float 값을 double형 변수에 할당.
//		int보다 큰 자료유형과 연산하면 큰 자료유형으로 promotion됨.
		System.out.println(zz);
		
		
		
	}

}
