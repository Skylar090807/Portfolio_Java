package day05;



public class ForTest2 {

	public static void main(String[] args) {
		//�ǽ� ����
//		[1] for������ �̿��ؼ� "��"�� ���.
		
//		[2] for���� �̿��ؼ� 1~10���� ���.
//		[3] for���� �̿��ؼ� 1~10���� �� ���ϱ�.
//		[4] for���� �̿��ؼ� 1~10���� �� ���ϱ�.
		
//		[1]
		for(int i=1;i<11;i++) {
			System.out.print("��");
		}
		System.out.println();
		
			
//	    [2]
		for(int i=1;i<11;i++) {
			System.out.print(i+", ");
		}
		System.out.println();
		
//		[3]
		int sum=0;
		for(int i=1;i<=10;++i) {
			if(i<10) {
				System.out.print(i+"+");
			}
			else {
				System.out.print(i+"=");
			}
			sum+=i;
		}
		System.out.println(sum);
		
//      [4]
		int mul=1;
		for(int i=1;i<=10;++i) {
			System.out.print((i<10)?i+"x":i+"=");
			
			mul*=i;//mul=mul*+i
		}
		System.out.println(mul);

	}

}
