package day07;

public class ArrayTest4 {

	public static void main(String[] args) {
		//2 ���� �迭 [����1]
		/*5��5���� 2���� �迭�� �����ؼ� �Ʒ��� ���� ���� 
		 * �����ϵ�, �ݺ��� �̿��ؼ� ������ ��, ����ϱ�
		 * 
		 * 1 0 0 0 0
		 * 0 1 0 0 0
		 * 0 0 1 0 0
		 * 0 0 0 1 0
		 * 0 0 0 0 1
		 * 
		 * */
		int m[][] = new int[5][5];
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				//m[i][j] = (i==j) ? 1 : 0;
				if(i==j)
					m[i][j]=1;
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------");
		//���� ũ�⸸ ���� ��Ƴ���, ���� ũ��� ���߿� �ʿ��� �� �Ҵ���� �� �ִ�.
		char[]ch[]=new char[3][];
		
		ch[0]=new char[2];//1���� 2��
		ch[1]=new char[4];//2���� 4��
		ch[2]=new char[3];//3���� 3��
		
		ch[0][0]='H';
		ch[0][1]='i';
		
		ch[1][0]='J';
		ch[1][1]='a';
		ch[1][2]='v';
		ch[1][3]='a';
		
		//char�� ����Ʈ '\u0000'
		
		//for���� �̿��ؼ� ����غ�����
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		System.out.println("Bye~~~");
		
		//String Ÿ���� 2���� �迭�� �����ϰ� �޸� �Ҵ� �� ���ڿ��� �����ϼ���.
		//�׷��� for���� �̿��ؼ� ����ϼ���
		String []str[]=new String[2][];
		
		str[0]=new String[4];
		str[1]=new String[1];
		
		str[0][0]="Hello";
		str[0][1]="Java";
		str[0][2]="Happy";
		str[0][3]=new String("Good~");
		
		str[1][0]=new String("Bye~~");
		
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str[i].length;j++) {
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
		}

		/* [1] ���� ���ø� ���� �ڷ� ������ ���纸����
		 * 1) int i, j;    i: int��, j:int��
		 * 2) int i[], j;  i: intŸ���� 1���� �迭, j: int��
		 * 
		 * 3) int [] i, j;  i,j��� int���� 1���� �迭
		 * 4) int i[], j[][], k;
		 *        i:int 1����
		 *        j:int 2����
		 *        k:int
		 * 5) int []i[], j;
		 *        i:int 2��
		 *        j:int 1��
		 * 6) int []i[], []j;
		 *        i,j ��� int 2����
		 * 
		 * */

	}

}





