package day03;

public class Casting {

	public static void main(String[] args) {
//		promotion(�ڵ�����ȯ):���� �������� ū �������� �ڵ���ȯ.
//		Casting(��������ȯ):ū �������� ���� �������� ������ȯ.
//		                 �� �� ĳ���� ������()�� �̿�.
/*
 * byte < short <int <long <float <double
 *        char  
 */
		byte b=58;
		float f=b;
		System.out.println("b: "+b);
		System.out.println("f: "+f);
		
		double d=789.123;
		short s=(short)d;//��������ȯ
//		Casting ����=(�ڷ���)��; ������ �ս� �߻��� �� �ִ�.
		System.out.println("d: "+d);
		System.out.println("s: "+s);
		
//		��������
		char ch='A';
		int x=ch;
//		��� ��� :promotion
		System.out.println("ch: "+ch);
		System.out.println("x: "+x);
		
		
		int y=66;
		char c=(char)y;
//		Casting �غ���
//		��� ���
		System.out.println("y: "+y);
		System.out.println("c: "+c);
		
		byte i=5;//-128 ~ 127
		byte j=3;
		byte k=(byte)(i+j);//������ ��� �Ұ�ȣ�� ����.
		//int k=i+j; //int ���� ū �ڷ��� ����.
		/*Java�� int�� ������ �ڷ���(byte, short, char)�� �����ϸ�
		 * �ڵ����� int������ ����ȯ �ȴ�.
		 * 
		 */
		System.out.println("i: "+i+", j: "+j);
		System.out.println("k: "+k);
		
		char y2=(char)(ch+5);//char + int -> int
		System.out.println(y2);
		
		int xx=1;
		float yy=2;
		double zz=xx*yy;
//		float ���� double�� ������ �Ҵ�.
//		int���� ū �ڷ������� �����ϸ� ū �ڷ��������� promotion��.
		System.out.println(zz);
		
		
		
	}

}
