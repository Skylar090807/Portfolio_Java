package day07;
/* Array
 * -���� ������ ����.
 * -ũ�� ����. �ش� ũ�� �� ������ ����.
 * -������(reference type)
 * 
 * 1.�⺻������
 * 2.������
 *   :new �����ڸ� ����� �ʱ�ȭ.
 * -Ŭ������
 * -�������̽���
 * -�迭
 *  
 */
public class ArrayTest {

	public static void main(String[] args) {
		/* �迭 �����ϴ� ���
		 * [1] ����
		 * [2] �޸� �Ҵ�
		 * [3] �ʱ�ȭ
		 */
		
		int arr[];// [1] 1���� �迭 ����
//		int []arr; ���ȣ ���� ���� �͵� ����. ���� ������ �� ��.
		
//		[2] �޸� �Ҵ�
		arr=new int[3];
		
//		[3] �ʱ�ȭ
//		index�� �׻� 0���� �迭ũ�� -1����
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		System.out.println("arr[0]: "+arr[0]);
		System.out.println("arr[1]: "+arr[1]);
		System.out.println("arr[2]: "+arr[2]);
		
		System.out.println();
		System.out.println("--------------------");
		
//		[�ǽ�1] double Ÿ�� 1���� �迭 ����, �޸� �Ҵ�. �迭 ũ��:5
		double a[]; //�� �������� �ʾ��� �� default �� ����. ex) double=0.0 
		a=new double[5];
		a[0]=456.123;
		a[1]=3.14;
		a[2]=200;
		a[3]='A';
		a[4]=741e-3;//e-3 =10^-3
		System.out.println("a[0]: "+a[0]);
		System.out.println("a[1]: "+a[1]);
		System.out.println("a[2]: "+a[2]);
		System.out.println("a[3]: "+a[3]);
		System.out.println("a[4]: "+a[4]);
		
		System.out.println();
		System.out.println("-------------------");
		
//		for���� �̿��� a�� ����� �� �Ѳ����� ���
		for(int i=0;i<5;i++) {//i=0;i<6;i++ �迭0~4�� �����Ƿ� ����.
			System.out.println("a["+i+"]: "+a[i]);
			
		}
		
		System.out.println();
		System.out.println("----------------------");
		
//		�迭 ũ��: length �Ӽ����� Ȯ��.
		System.out.println("a.length: "+a.length);
		
		System.out.println();
		System.out.println("----------------");
//		[1]+[2],[3] ����� �޸� �Ҵ� ���ÿ� �� �� �ʸ�ȭ
		char [] crr=new char[4];//[1]+[2]
//		[3] �ʱ�ȭ
		crr[0]='J';
		crr[1]='a';
		crr[2]='v';
		crr[3]='a';
		
		//crr�� ����� ���� for ���� �̿� ���
		for(int i=0;i<crr.length;i++) {
			System.out.print(crr[i]);
		}
		
		
		
		System.out.println();
		
//		[1]+[2]+[3]
		char drr[]= {'H','e','l','l','o'};
		
		//drr
		for(int i=0;i<5;i++) {
			System.out.print(drr[i]);
		}
		

		
				
		

	}

}
