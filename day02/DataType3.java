package day02;

public class DataType3 {
	public static void main(String[] args) {
//		main+ctrl+space bar :main method 단축키
		System.out.println("3.문자형---------");
//		char 2byte: 0 ~ 2^16-1 (65535)
//		short 2byte: -2^15 ~ 2^15-1
		char c1='A';
//		char type은 유니코드 체계 사용.(\u0000)
		char c2='\uff57';
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		char c3='家';
//		char c4='가나다'; 에러
		String s1="가나다";
//		String은 기본자료형이 아님. reference type.
		System.out.println("c3: "+c3);
		System.out.println("s1: "+s1);
		
		
	    char c4='A';
//	    char type 연산에 사용되면 int로 promotion.
	    System.out.println(c4+1);
//	    A:아스키코드 값 65
//	    A+1=65+1 이므로 c4+1연산은 66
        
	    
	    System.out.println("4. 논리형-------");
//	    boolean : true or false
	    boolean bool=true;
	    boolean bool2=false;
	    boolean bool3=2<3;
	    
	    System.out.println("bool: "+bool);
	    System.out.println("boo2: "+bool2);
	    System.out.println("boo3: "+bool3);
	    
	    
		
		
		
	}

}
