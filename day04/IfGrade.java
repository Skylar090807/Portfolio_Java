package day04;
import java.util.*;

public class IfGrade {

	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			
			System.out.println("국어 점수 입력=>");
			float kor = sc.nextFloat();
			System.out.println("국어: "+kor+"점");
			
			System.out.println("영어 점수 입력=>");
			float eng = sc.nextFloat();
			System.out.println("영어: "+eng+"점");
			
			System.out.println("수학 점수 입력=>");
			float math = sc.nextFloat();
			System.out.println("수학: "+math+"점");
			
			float aver= (kor+eng+math)/3;
			System.out.println("========================");
			System.out.println("평균 점수: "+aver+"점");
//			지역변수는 반드시 초기값을 선언해야 한다.
			char hak=' '; //스페이스 바(공백문자) 초기 값 선언
			if(aver>=80 && aver<90) {
				hak='B';
			}else if(aver>=90 && aver<=100) {
				hak='A';
			}else if(aver>=70 && aver <80) {
				hak='c';
			}else if(aver>=60 && aver <70) {
				hak='D';
			}else if(aver<60) {
				hak='F';
			}else {
				System.out.println("잘못된 점수입니다.");
				return;
				//아래 문장을 실행하지 않고 메소드를 호출한 쪽으로 되돌아간다.
			}
			System.out.println("학점: "+hak);
			
//			내가 작성한 코드
/*			if (aver>=90) {
				System.out.println("A입니다.");
			} else if (aver>=80) {
				System.out.println("B입니다.");
			}else if (aver>=70) {
				System.out.println("C입니다.");
			}else if (aver>=60) {
				System.out.println("D입니다.");
			} else {
				System.out.println("F입니다.");
			}		
*/		

	}

}
