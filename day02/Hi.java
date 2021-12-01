//1. 패키지 선언문 (최상단 위치)
//package 패키지명; 소문자로 시작
package day02;
//2. import 문(라이브러리에 있는 클래스를 사용하고자 할 때)
//대표적 라이브러리는 System
import java.lang.System;
import java.lang.String;//import는 패키지 선언문 아래 위치.
//import 패키지명.클래스명;
//기본적으로 java.lang 패키지는 자동 import.

//3.클래스 선언문
//public class 클래스명 {... }
//클래스명과 파일명은 대소문자까지 같아야 한다.
//Hi.java 
public class Hi//class header
{
	//main() method => 자동차의 엔진같은 존재.
	//                 프로그램의 시작과 끝.
	
	//!외우기!
	public static void main(String[] args) {
	
	//출력문 작성하기
	//'김소월' 님의 "진달래꽃"
	//나보기가 역겨워 가실 때에는...
	System.out.println("\'김소월\'님의 \"진달래 꽃\"");
	//문자 출력시 " "
	System.out.println("나보기가 역겨워 가실 때에는...");
	//syso + ctrl +space bar
		
	
	}
   
}
