package day03;
import java.util.Scanner;//�ܼ�â���� �� �Է�

public class Operator3 {

	public static void main(String[] args) {
//  ���� ������
//		+, -, *, /, %
		Scanner sc=new Scanner(System.in);
		System.out.println("����1�� �Է��ϼ���");
		int a=sc.nextInt();
		System.out.println("a: "+a);
		
		System.out.println("����2�� �Է��ϼ���");
		int b=sc.nextInt();
		System.out.println("b: "+b);
		
		System.out.println("a+b"+(a+b));
		System.out.println("a-b"+(a-b));
		System.out.println("a*b"+(a*b));
		System.out.println("a/b"+(a/b));
		System.out.println("a%b"+(a%b));
		System.out.println("-------------");
		
//		�� ������
		/* 1) < : ������? ���� ��� true
		 * 2) <= : �۰ų� ������?
		 * 3) > : ū��?
		 * 4) >= : ũ�ų� ������?
		 * 5) == : ������?
		 * 6) != : �ٸ���?
		 */
		
		  System.out.println("a<b: "+(a<b));
		  System.out.println("a<=b: "+(a<=b));
		  System.out.println("a>b: "+(a>b));
		  System.out.println("a>=b: "+(a>=b));
		  System.out.println("a==b: "+(a==b));
		  System.out.println("a!=b: "+(a!=b));
		  
		

	}

}
