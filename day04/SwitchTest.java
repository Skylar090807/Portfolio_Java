package day04;
import java.util.*;

public class SwitchTest {

	public static void main(String[] args) {
		/*
		 * switch(���� or ����){ ������ ������ int���� �ڷ���
		 *                     -byte, short, char, int, String
		 *      case ��1: ���� ����1; break;
		 *      case ��2: ���� ����1; break;
		 *      case ��3: ���� ����1; break;
		 *      ...
		 *      default: ��Ÿ ���๮;
		 * }
		 * ����) ����, ������ ������� case�� ���� �ڷ����� ���ƾ� �Ѵ�.
		 */
		
		Scanner sc=new Scanner(System.in);
//		1~12������ �Է¹ޱ�
//		3,4,5��: "���Դϴ�"
//		6,7,8��: "�����Դϴ�"
//		9,10,11: "�����Դϴ�"
//		12,1,2: "�ܿ��Դϴ�"
		
		System.out.println("���� ���� �Է��ϼ���=>");
		int month=sc.nextInt();
//		long month=sc.nextLong(); int �̻��� switch�� �Ұ���
		System.out.print(month+"���� ");
		
		String season="";
		switch(month) {
		case 9,10,11:
			season="����";
			break;
		case 12,1,2:
			season="�ܿ�";
			break;
		case 3,4,5:
			season="��";
			break;
		case 6,7,8:
			season="����";
		    break;
		default:
		    System.out.println("�Է� ����! 1��~12�� ���� ���� �Է����ּ���.");
		    return;
		
		 
		}
		System.out.println(season+"�Դϴ�");

	}

}
