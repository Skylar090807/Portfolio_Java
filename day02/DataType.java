package day02;

public class DataType {

	public static void main(String[] args) {
		System.out.println("1. �ڹ��� �ڷ���---------");
		System.out.println("1) ������************");
		/*byte 1byte :-2^7 ~ 2^7-1 (-128 ~127)
		 * short 2byte: -2^15 ~ 2^15 -1 
		 * int 4byte:-2^31 ~ 2^31-1
		 * long 8byte:-2^63 ~ 2^63-1
		 * byte < short < int < long
		 * 
		 */
		 byte a=10; //�ڹ�
		 //�ڷ��� �����̸�= ��;
		 
		 System.out.println(a);
		 byte b=-128;
		 byte c=127;
		 System.out.println("b: "+b);
		 System.out.println("c: "+c);
		 
		 //byte d�� ���� �� 128�� ��������.
		 //byte d=128;
		 //����� ����.
		 //byte ������ �Ѿ�� ����. int�� �ν�.
		 short d=128;
		 System.out.println("d: "+d);
		 short e= -5000;
		 System.out.println("e: "+e);
		 
		 int i= 4547487;
		 System.out.println("i: "+i);
		 
		 long j=800L;//���̻�L�� ����.
		 long k=8000000L;
		 System.out.println("j: "+j);
		 System.out.println("k: "+k);
		 
		 int x=1000000000;//0�� 9��
		 long y=10000000000L;//0�� 10��
		 //L�� ������ ������ int�� �ν�.
		 
		 //�������� default�� int
		 //��¹�
		 System.out.println("x: "+x);
		 System.out.println("y: "+y);
		 
		 int n=010;//8������ �ν�.(0�� ���ξ�� ����)
		 System.out.println("n: "+n);
		 int m=011;
		 System.out.println("m: "+m);
		 
		 int z=0xa5;	//16������ �ν�.(0x�� ���ξ�� ���δ�)
		 System.out.println("z: "+z);
		 
		 int s=0b1101;
		 //2������ �ν�. 0b�� ���ξ�� ����.
		 System.out.println("s: "+s);
		 
		 
		 
		 

	}

}
