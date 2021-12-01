package day05;
import java.util.*;

public class ForTest3 {

	public static void main(String[] args) {
//		[5]1~100까지의 수 중 17로 나누어 떨어지는 수만 출력.
//		[6]for루프 이용해서 구구단 7단 출력.
//      [7]알파벳 대문자 출력.		
		
//		[5]
		for(int i=1;i<=100;i++) {
			if(i%17==0) {
				System.out.println(i);
			}
		}
		
		
		
//		[6]
		Scanner sc=new Scanner(System.in);
		System.out.println("구구단 몇단을 수행할까요?");
		int dan=sc.nextInt();

		for(int i=1; i<=9; i++){

		System.out.println(dan + "*" + i + "=" + (dan*i));
		}

//      [7]
		for(char a='A'; a<='Z';a++) {
			System.out.print(a+", ");
		}
		System.out.println();
		
		for(int i=65;i<=90;i++) {
			System.out.print((char)i+",");
		}
			
		
	}

}
