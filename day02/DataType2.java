package day02;

public class DataType2 {
	public static void main(String[] args) {
		System.out.println("2. �Ǽ���----------");
//		ctrl+/ �ּ� ����Ű
//	    float(4) <double(8)
//		float:�����е�. �Ҽ��� ���� 7�ڸ�
//		double:�����е�. �Ҽ��� ���� 15~16�ڸ�.(default)
		float a=1.234F;
//		float ���� �ε��Ҽ����� ��� �ݵ�� ���̻�F�� ���δ�.
//		F�� ������ ������ double�� �ν�.
		float b=500;
		System.out.println("a: "+a);
//		ctrl+alt+����Ű �Ʒ� :����
//		ctrl+d :���ö��� ����
		System.out.println("a: "+a);
		System.out.println("b: "+b);
//		���� ������ ���� ū �ڷ������� ������ �ڵ�����ȯ�ȴ�.
//		(promotion - �ڵ�����ȯ)
		
		double c=a;//promotion
		System.out.println("c: "+c);
		
		double d1=45678.123456789D;//default�̱� ������ d������ �ʾƵ� ��.
		System.out.println("d1: "+d1);
		
		double d2= 0.45E-7;//0.45*10^-7
		double d3=300e3;//300*10^3
//		e,E: ������ ����
//		e�� 10�� ���� 
		System.out.println("d2: "+d2);
		System.out.println("d3: "+d3);
		
//		float f1=100e-1; ����
//		�����ذ�: float f1=100e-1f ���̻� f�� ����.
		float f1=100e-1f;
		System.out.println("f1: "+f1);
		
		
		
		
	}

}
