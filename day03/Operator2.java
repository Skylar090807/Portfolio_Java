package day03;

public class Operator2 {

	public static void main(String[] args) {
//		3. ��Ʈ�� not ������: ~
//		���� ��Ʈ(0,1)�� �ٲ� ����.
//		~�� ������ 0=1, 1=0 
		int a=42;
		System.out.println("a: "+a);
		System.out.println("a: "+(~a));
		/*
		 * 42
		 * 21...0
		 * 10...1
		 *  5...0
		 *  2...1
		 *  1...0
		 *  42=2���� 101010
		 *  int�� ǥ�� 32byte
		 *   42=00000000 00000000 00000000 00101010
		 *  ~42=11111111 11111111 11111111 11010101->-43
		 *
		 */
		
		System.out.println("4. ������ ������:!");
//		!: true�� false��, false�� true�� �ٲ�.
//		�����̳� ���� �տ� ���.
		boolean b=true;
		System.out.println(b);
		System.out.println(!b);
		System.out.println(2>3);
		System.out.println(!(2>3));
		
//		= :���Կ�����
//		== :���� ������ ��. true or false
//		!= : �ٸ��� true ������ flase
		int x=5;
		double y=5.0;
		System.out.println(x==y);
		System.out.println(x!=y);
		
 
	}

}
