package day06;
import java.util.*;

public class NumberGameRandom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		1. ��ǻ�Ͱ� ������ ������ �߻���Ű��(1<= num <101)
		int num=(int)(Math.random()*100+1);
		System.out.println("*********Number Game********");
		System.out.println("���� �õ� 7ȸ �ȿ� ���ڸ� ���纸����.");
		System.out.println();
		
		
//		2.���ѷ��� ���鼭 ��ǻ�Ͱ� �߻��� ���� ���ߴ� ���� �ۼ�.
//		���� ���߸� �ݺ��� �����.
		int count=0;
	    while(true) {
		    System.out.println("1~100 ������ ������ �Է��ϼ���: ");
		    int input=sc.nextInt();
		    count++;//���� �õ� Ƚ��
		    //�Է¹��� ���� ������ ���ؼ� �޽��� ���.
		    if(count>7) {
		    	System.out.println("����!!! ���� �õ� Ƚ���� 7���Դϴ�.");
		    }
		    if(input == num) {
		    	System.out.println("����!!!");
		    	break;
		    }else if(num>input) {
		    	System.out.println("�� ū �� �Է�: ");
		    }else {
		    	System.out.println("�� ���� �� �Է�: ");
		    }
		
		

		
		//�� �õ� Ƚ���� 7ȸ�� ����.
		}//while
	    System.out.println();
	    System.out.println("------------------------------");
	    System.out.println("���ӽõ� Ƚ��: "+count);
	    System.out.println("���� : "+num);

	}//main()

}//class
