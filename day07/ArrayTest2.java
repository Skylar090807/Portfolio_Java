package day07;

public class ArrayTest2 {

	public static void main(String[] args) {
//		float ���� 1���� �迭 ����. �ʱⰪ �ο�.
//		������ ��:-16.23, 100.5, 43, 'z', 3e+3
//		for ������ ���
//	    ����� �� �հ�� ��հ� ���
		float arr[]= {(float)-16.23, 100.5f, 43, 'z', 3e+3f};
		float sum=0.0f;
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
			sum+=arr[i];
		}
		System.out.println("�հ�: "+sum);
		System.out.println("���: "+(sum/arr.length));
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		int [] a= {1,2,3,4,};
		
		int b[];
		
		b=a;
		/* a------>|1|2|3|4|
		 *        |
		 * b------*
		 * �迭 b�� ���� �迭 a�� �Ҵ��Ѵ�.
		 * �� �� �迭 b�� ���ο� �޸𸮸� �Ҵ�޾� �����Ǵ� ���� �ƴ�,
		 * a�� �����ϴ� �迭�� ����Ű�� ����.
		 * ���� a, b�� ����� ���� ���� �� �Բ� ����.
		 * 
		 */
		
		System.out.println("a[0]= "+a[0]);
		System.out.println("b[0]= "+b[0]);
		
		b[3]=800;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		System.out.println("-----------------");
		System.out.println();
		
		/* [�ǽ�] �������� �̿� x,y�� ����� �� ���� �ٲ� ��
		 * for������ x, y ����� �� ��� 
		 * 
		 */
		int[] x= {100,200};
		int y []= {3,4,5,6};
		int tmp[];
		
		tmp=x;
		x=y;
		y=tmp;
		
		for(int i=0; i<x.length; i++)
			System.out.println("x["+i+"]="+x[i]);
		for(int i=0; i<y.length; i++)
			System.out.println("y["+i+"]="+y[i]);

		
		
		
		
		

	}

}
