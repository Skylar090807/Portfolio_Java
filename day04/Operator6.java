package day04;

public class Operator6 {

	public static void main(String[] args) {
		System.out.println("���ǿ�����(���� ������)-------------");
		/*���� ���� = (���ǽ�)? ��1:��2;
		 * -���ǽ��� true �� ��1�� ������ ����.
		 * -���ǽ��� false�� ��2�� ������ ����.
		 * ����) ����� ������ ��1, ��2�� ���� �ڷ����̾�� �Ѵ�.
		 */
		int a=50;
		int b=60;
		int c=(a<b)? a:b;
//		String c=(a<b)? a+"":b+"";
		System.out.println("c: "+c);
		
		System.out.println("�Ҵ� ������(���� �� ���Կ�����)---------");
//		+=, -=, /=, %=, >>=, <<=, >>>=, ...
		int i=3;
		i+=2; //i=i+2;
		System.out.println("i: "+i);
		
//		�ǽ� ����
//		[1]
		int j=9;
		j-=3; // j= j-3;
		System.out.println("j: "+j);
		
//		[2]
		int k=7;
		k*=8; // k= k*8;
		System.out.println("k: "+k);
		
//		[3]
		k/=3; //k= k/3;
		System.out.println("k: "+k);
		
//		[4]
		k%=4;//k= k/4�� ������;
		System.out.println("k: "+k);


	}

}
