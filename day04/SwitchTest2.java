package day04;
import java.util.*;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-------Cafe Menu-----------");
		System.out.println("�Ƹ޸�ī��: 2000��");
		System.out.println("ī���, īǪġ��, ����������:3500��");
		System.out.println("�������ֽ�: 4000��");
		System.out.println("----------------------------");
		
		System.out.println("���� ���Ḧ �帱���?");
		String menu= sc.next();//sc.next();��Ʈ�� �Է�
		System.out.println("menu: "+menu);
		System.out.println("�� �� �帱���?");
		int cup=sc.nextInt();
		
		int price=1;//�ܰ�
		switch(menu) {
		case "�Ƹ޸�ī��":
			price=2000;
			break;
		case "�����","īǪġ��","����������":
			price=3000;
		    break;
		case "�������ֽ�":
			price=4000;
			break;
		default:
			System.out.println("���� �޴��Դϴ�. �ٽ� �����ϼ���.");
			return;
		
			
		
		}
		System.out.println("1. ������ ����: "+menu);
		System.out.println("2. ��     �� : "+cup);
		System.out.println("3. ��     �� : "+price+"��");
		System.out.println("4. ����   �Ѿ�: "+(price*cup)+"��");
		

	}

}
