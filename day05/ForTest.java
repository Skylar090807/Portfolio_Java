package day05;

public class ForTest {
	int a=10;//�ν��Ͻ�(����)����.

	public static void main(String[] args) {
		int b=1;//��������. main()method block������ ��� ����.
		/* �ݺ��� - for ������
		 * for(�����ʱ�ȭ;���ǽ�;������)
		 * {
		 *      �ݺ� ������ ����;
		 * }
		 * -���ǽ��� true�� �ݺ� ������ ���� ����.
		 * -���ǽ��� false�� �ݺ����� ���.
		 */
		for(int i=1;i<=10;i++) {//i �������� scope(��ȿ����)�� for�� �ȿ���.
			System.out.println("Hello World!"+i);
			
		}//for
		System.out.println("###############");
		
		int j=5;//j�� scope�� ����� �������� main() block ������.
		for(;j>0;j--) {//�ʱ�ȭ �̹� ����Ǿ��� �� ��������.
			System.out.println("Hi Java!"+j);
		}
		System.out.println("@@@@@@@@@@@@@@@");
		
		for(int i=1;i<10;i+=3) {
			System.out.println("i: "+i);
			
		}
		System.out.println("***************");
		
		for(;;) {
			System.out.println("���� ����");//�ܼ� â �����ư���� ��������.
		}

	}//main

}//class
