package day04;
import java.util.*;

public class IfTest {

	public static void main(String[] args) {
//		���ǹ� if��
		/*
		 * [1]
		 * if(���ǽ�){
		 *      ������ ����;
		 * 
		 * }
		 */
		int a=5;
		if(a>2) {
			System.out.println(a+" �� 2���� Ů�ϴ�.");
		}
		System.out.println("****************************");
		
		/*
		 * [2]
		 * if(���ǽ�){
		 *    ���๮1;
		 * }else{
		 *    ���๮2;
		 * }
		 */
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���=> ");
		int b=sc.nextInt();
		System.out.println("b: "+b);
//		����ڰ� �Է��� �� b�� ����� "����Դϴ�", ������ "�����Դϴ�"�� ����ϴ� ���α׷� �ۼ�.
		if(b>0) {
			System.out.println(b+"����Դϴ�.");
			System.out.println("########");
		}
		else{
			System.out.println(b+"�����Դϴ�. �Ǵ� 0�Դϴ�.");
			System.out.println("@@@@@@@@");
		}
		System.out.println("Bye Bye~~~~");
       
		

	}

}
