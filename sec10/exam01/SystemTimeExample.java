package sec10.exam01;

public class SystemTimeExample {

	public static void main(String[] args) {
        
		long time1 = System.nanoTime();//������
		
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1000������ ��: " + sum); //overflow�߻�
		System.out.println("��꿡 " + (time2-time1)/*/1000000000.0*/ + " �ʰ� �ҿ�Ǿ����ϴ�.");
		
		long time3 = System.nanoTime();
		
		double num = 1000000;
		double sum1= num*(num+1)*0.5;
		
		long time4 = System.nanoTime();
		
		System.out.println("1~1000000������ ��: " + (long)sum1);
		System.out.println("��꿡 " + (time4-time3)/*/1000000000.0*/ + " �ʰ� �ҿ�Ǿ����ϴ�.");

		
		

	}

}
