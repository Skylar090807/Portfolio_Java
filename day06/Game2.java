package day06;
import java.util.*;

public class Game2 {
	
	public static void showMenu(){
		System.out.println("*********Game v1.1**********");
		System.out.println("1. ���� 2.���� 3.�� 9.����");
		System.out.println("****************************");
		System.out.println("���ڸ� �Է��ϼ���: ");
		System.out.println("****************************");
	}

	public static void main(String[] args) {//main() JVM ȣ��
		Scanner sc=new Scanner(System.in);
		
		//showMenu() ȣ���ϱ�.
		int no=0;
		
		
		do {
		Game2.showMenu();
		no=sc.nextInt();//����� �Է�
		//��ǻ�Ͱ� �����ϰ� (1,2,3)�� �ϳ��� �߻�.
		int com=(int)(Math.random()*3+1);
		
		//[1]����ڰ� (1,2,3) ���� ��ȣ �Է� "�Է� ����! �޴��� �ִ� ��ȣ�� �Է��ϼ���."
		//���� ��� ����.
		if(no==9) break;
		if(no<1 || no>3) {
			System.out.println("�Է� ����! �޴��� �ִ� ��ȣ�� �Է��ϼ���.");
			continue;
		}
		System.out.println("���������� ���...");
		
		
		//[2]����ڰ� ��� ���
		String msg="";
		if(no==com) {
			msg="���º�.";
		}else if((no==1&&com==3)||(no==2&&com==1)||(no==3&&com==2)) {
			msg="�¸�";
		}else {
			msg="�����ϴ�.";
		}
		//   ����ڰ� �̱� ��� (no==1 com==3), (no==2 com==1),(no==3 com==2)
		//   ����ڰ� �� ���
		System.out.println("com: "+com);
		System.out.println("user: "+no);
		System.out.println(msg);
		
		
		
		//����ڰ� �Է��� ���� 9�̸� ����.
		}while(true);
		System.out.println("Game Finished");
 
	}//main()

}//class
