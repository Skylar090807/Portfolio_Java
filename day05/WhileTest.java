package day05;



public class WhileTest {

	public static void main(String[] args) {
		/* ���� �ʱ�ȭ��;
		 * while(���ǽ�){
		 *     �ݺ� ������ ����;
		 *     ������;
		 * }
		 * ������ true�� �ݺ����� ������ ����.
		 * ������ false�� �ݺ����� �����.
		 * 
		 * 
		 */
		
		int a=1;
		while(a<5) {
			System.out.println("Hello : "+a);
			a++;
		}
		System.out.println("-The End- :"+a);
		
		int b=3;
		while(b>0) {
			System.out.println("Java: "+b);
			b-=2;
		}
		System.out.println("-The End- :"+b);
		
//		while(true) {
//			System.out.println("���� ����");
//		}�巡�� ctrl+/ =��ü �ּ� �����

//		[1]while ������ �̿��ؼ� 100~1���� 3�� ��� ���.
//		[2]while ������ �̿��ؼ� ������ 3�� ���.
//		[3]while ������ �̿��ؼ� ������ ��ü�� ����ϵ� �Ʒ��� ���� ���·� ���.
		/*
		 * 2x1=2  3x1=3  4x1=4  
		 */
		
		//[1]
		int k=100;
		while(k>0) {
			if(k%3==0) {
				System.out.println(k);
			}
			k--;
		}
		
		//[2]
		int dan=3;
		int j=1;
		while(j<10) {
			System.out.println(dan+"x"+j+"="+dan*j);
			j++;
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		//[3]while ��ø
		int l=1;
		while(l<10 ) {//���� ����
			int m=2;
			while (m<10) {
				System.out.print(m+"x"+l+"="+(l*m)+"\t");
				m++;
			}
			l++;
			System.out.println();
		}
		
		
		System.out.println("-------------------------------------------------------------------------");
		

		
		
	}//main()

	
}//class
