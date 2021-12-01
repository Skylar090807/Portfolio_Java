package day06;

public class MathTest {

	public static void main(String[] args) {
		/* java.lang.math Ŭ������ ������ �ִ� Field(��������)
		 * public static final double PI
		 * public static final double E
		 * 
		 * -final : ����� ���� �� ���̴� modifier
		 * -static : ���� �տ� ������ "Ŭ���� ����"��� �� => ���������� ���� �� ���δ�.
		 *           static ������ �����ϰ��� �� ���� 
		 *           "Ŭ������.����" ������ �����ؾ� �Ѵ�.
		 *           Math.PI
		 */
		System.out.println(Math.PI);
		System.out.println(Math.E);//�ڿ����
		
		System.out.println("-------------------------------");
		
//		Math Ŭ������ method
		/* 
		 * public static double abs(double a) : �Ű����� a�� ���밪�� ���� ��ȯ.
		 * -public: ����������(access modifer)
		 * -static: ������,������(modifier)
		 * -abs: method��
		 * -double a: �Ű�����(�Ǽ�����)
		 * 
		 * static method���� �� "Ŭ����.�޼ҵ�()"
		 */
		double a=Math.abs(-13.123);
		System.out.println("a: "+a);
		
		System.out.println("----------------------------------");
		
//		public static double ceil(double a) :�ø� ��
//		public static double floor(double a) :���� ��
//      public static long	round(double a)  :�ݿø� ��
//		public static int	max(int a, int b):a,b �� �ִ� �� ��ȯ
//		public static int	min(int a, int b):a,b �� �ּ� �� ��ȯ
//	    public static double random(): 0.0 r<1.0 ���� ������ �Ǽ� ��ȯ 
		
		double b=Math.ceil(123.0001);
		System.out.println("123.0001�� �ø��� "+b);
		double c=Math.floor(123.0001);
		System.out.println("123.0001�� ������ "+c);
		
		
		//123.501�� �ݿø��� ���� ���.
		long d=Math.round(123.501);
		System.out.println("123.501�� �ݿø��� "+d);
		
		System.out.println();
		
		//-78, -24 �� �ִ밪, �ּҰ��� ���
		int e=Math.max(-78, -24);
		int f=Math.min(-78, -24);
		System.out.println("�ִ밪: "+e+", �ּҰ�: "+f);
		
		System.out.println();
		
		//random
		double r=Math.random();
		System.out.println("r: "+r);
		//0.0<=r<1.0
		
		
		
		
	}

}
