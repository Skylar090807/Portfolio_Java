package day05;
import java.util.*;

public class ForTest3 {

	public static void main(String[] args) {
//		[5]1~100������ �� �� 17�� ������ �������� ���� ���.
//		[6]for���� �̿��ؼ� ������ 7�� ���.
//      [7]���ĺ� �빮�� ���.		
		
//		[5]
		for(int i=1;i<=100;i++) {
			if(i%17==0) {
				System.out.println(i);
			}
		}
		
		
		
//		[6]
		Scanner sc=new Scanner(System.in);
		System.out.println("������ ����� �����ұ��?");
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
