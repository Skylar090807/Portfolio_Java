package day04;
import java.util.*;

public class IfTest2 {

	public static void main(String[] args) {
//		[1] if~ else �� �̿��ϱ�.
//		Scanner�� �̿��ؼ� ������ �ϳ� �Է� �ް�
//		�Է¹��� ���� ¦���̸� "Even", Ȧ���̸� "Odd"
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���=> ");
		int num=sc.nextInt();
		System.out.println("num: "+num);
		
		if(num%2==1) {
			System.out.println("Odd");
		 
		}
		else {
			System.out.println("Even");
		}
		
//		[2] �� ���α׷��� ���׿�����(���ǿ�����)�� �̿��ؼ� Ǯ�����.
		String str=(num%2==0)? "Even":"Odd";
		System.out.println(str);
	}

}
