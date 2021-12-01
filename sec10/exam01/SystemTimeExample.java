package sec10.exam01;

public class SystemTimeExample {

	public static void main(String[] args) {
        
		long time1 = System.nanoTime();//나노초
		
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1000까지의 합: " + sum); //overflow발생
		System.out.println("계산에 " + (time2-time1)/*/1000000000.0*/ + " 초가 소요되었습니다.");
		
		long time3 = System.nanoTime();
		
		double num = 1000000;
		double sum1= num*(num+1)*0.5;
		
		long time4 = System.nanoTime();
		
		System.out.println("1~1000000까지의 합: " + (long)sum1);
		System.out.println("계산에 " + (time4-time3)/*/1000000000.0*/ + " 초가 소요되었습니다.");

		
		

	}

}
