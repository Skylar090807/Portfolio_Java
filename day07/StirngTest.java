package day07;

public class StirngTest {

	public static void main(String[] args) {
		//java.lang.String 클래스
		//public char charAt(int index)
		//: index 위치의 문자 1개를 추출해서 반환.
		
		//public int length()
        //문자열의 길이를 반환.
		
		//non-static method 접근 시 "객체명.메소드명()"
		
		String str="Good Job~";//9자
		
		int len=str.length();
		System.out.println(str+"의 길이: "+len);
		
		char c= str.charAt(5);
		System.out.println(c);
		
		//[문제1] str의 문자를 반복문 돌면서 1개씩 추출해서 char타입 배열에 저장
		char[] crr=new char[str.length()];
		
		for(int i=0; i < str.length(); i++) { 
			char ch=str.charAt(i);
			System.out.println(ch);
			crr[i]=ch;
			 
		}
		
		//Enhanced for loop(확장 for 루프)
		//for(변수선언문: 자료구조){ 실행문...}
		System.out.println("*****************************");
		
		for(char x:crr) {
			System.out.println(x+": "+Character.isUpperCase(x));
		}
		
		System.out.println();
		
		//[문제2] str2 문자 1개씩 추출해서 각 숫자를 더한 값 1+2+3+4+5 출력
		String str2 = "12345"; 
		int sum = 0; 
		for(int i=0; i < str2.length(); i++) { 
			 int ch= str2.charAt(i) - '0';
			 System.out.println(ch);
			 sum+=ch;
		} 
		System.out.println("sum="+sum); 
		
		//[문제3] java의 정석 연습문제 4-13
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		//String value = "12o34"; 
		String value=sc.next();
		char ch = ' '; 
		boolean isNumber = true;
		
		//반복문과 charAt(int i)를 이용해서 문자열의 문자를
		//하나씩 읽어서 검사한다  
		
		for(int i=0; i < value.length() ;i++) { 
			//if(!Character.isDigit(ch)){ }
			if (!(value.charAt(i) >= '0' && value.charAt(i) <= '9')) {

				isNumber = false;

				break;

			}
		
		} 
	
		if (isNumber) { 
			System.out.println(value+" 는 숫자입니다 ."); 
		} else { 
		System.out.println(value+" 는 숫자가 아닙니다 .");  
		}
	
		
	}//main

}//class
