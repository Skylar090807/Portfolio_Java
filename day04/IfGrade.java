package day04;
import java.util.*;

public class IfGrade {

	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			
			System.out.println("���� ���� �Է�=>");
			float kor = sc.nextFloat();
			System.out.println("����: "+kor+"��");
			
			System.out.println("���� ���� �Է�=>");
			float eng = sc.nextFloat();
			System.out.println("����: "+eng+"��");
			
			System.out.println("���� ���� �Է�=>");
			float math = sc.nextFloat();
			System.out.println("����: "+math+"��");
			
			float aver= (kor+eng+math)/3;
			System.out.println("========================");
			System.out.println("��� ����: "+aver+"��");
//			���������� �ݵ�� �ʱⰪ�� �����ؾ� �Ѵ�.
			char hak=' '; //�����̽� ��(���鹮��) �ʱ� �� ����
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
				System.out.println("�߸��� �����Դϴ�.");
				return;
				//�Ʒ� ������ �������� �ʰ� �޼ҵ带 ȣ���� ������ �ǵ��ư���.
			}
			System.out.println("����: "+hak);
			
//			���� �ۼ��� �ڵ�
/*			if (aver>=90) {
				System.out.println("A�Դϴ�.");
			} else if (aver>=80) {
				System.out.println("B�Դϴ�.");
			}else if (aver>=70) {
				System.out.println("C�Դϴ�.");
			}else if (aver>=60) {
				System.out.println("D�Դϴ�.");
			} else {
				System.out.println("F�Դϴ�.");
			}		
*/		

	}

}
