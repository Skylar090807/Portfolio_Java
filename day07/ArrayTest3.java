package day07;

public class ArrayTest3 {

	public static void main(String[] args) {
		/* 2���� �迭
		 * [1] ����
		 * [2] �޸� �Ҵ�
		 * [3] �ʱ�ȭ
		 */
		
//		[1]
		int [][]a;
//		int b[][];
		int []c[];
		
//		[2]
		a=new int[3][2];//row:3,column:2
		
//		[3]
		a[0][0]=1;
		a[0][1]=2;
		
		a[1][0]=3;
		a[1][1]=4;
		
		a[2][0]=5;
		a[2][1]=6;
		
//		��ø for������ a ����� �� ���
		for(int i=0;i<a.length;i++) {//row ����: row size->a.length
			for(int j=0;j<a[i].length;j++) {//column ����: a[i].length
//				���� ���� ����Ű���ִ�. 
				
				System.out.print(a[i][j]+", ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		
//		����� ���ÿ� �޸� �Ҵ�, �ʱ�ȭ
		int b[][]= {
				{5,6,7},
				{'A','B'},
				{0x12}
		};
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+", ");
			}
			System.out.println();
		}

	}//main()

}
