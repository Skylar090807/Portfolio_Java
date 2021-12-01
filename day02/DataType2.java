package day02;

public class DataType2 {
	public static void main(String[] args) {
		System.out.println("2. 실수형----------");
//		ctrl+/ 주석 단축키
//	    float(4) <double(8)
//		float:단정밀도. 소수점 이하 7자리
//		double:배정밀도. 소수점 이하 15~16자리.(default)
		float a=1.234F;
//		float 형은 부동소수점일 경우 반드시 접미사F를 붙인다.
//		F를 붙이지 않으면 double로 인식.
		float b=500;
		System.out.println("a: "+a);
//		ctrl+alt+방향키 아래 :복사
//		ctrl+d :선택라인 삭제
		System.out.println("a: "+a);
		System.out.println("b: "+b);
//		작은 유형의 값을 큰 자료형으로 받으면 자동형변환된다.
//		(promotion - 자동형변환)
		
		double c=a;//promotion
		System.out.println("c: "+c);
		
		double d1=45678.123456789D;//default이기 때문에 d붙이지 않아도 됨.
		System.out.println("d1: "+d1);
		
		double d2= 0.45E-7;//0.45*10^-7
		double d3=300e3;//300*10^3
//		e,E: 과학적 지수
//		e는 10의 제곱 
		System.out.println("d2: "+d2);
		System.out.println("d3: "+d3);
		
//		float f1=100e-1; 오류
//		오류해결: float f1=100e-1f 접미사 f를 붙임.
		float f1=100e-1f;
		System.out.println("f1: "+f1);
		
		
		
		
	}

}
