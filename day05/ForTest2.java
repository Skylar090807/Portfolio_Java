package day05;



public class ForTest2 {

	public static void main(String[] args) {
		//실습 문제
//		[1] for루프를 이용해서 "★"을 출력.
		
//		[2] for루프 이용해서 1~10까지 출력.
//		[3] for루프 이용해서 1~10까지 합 구하기.
//		[4] for루프 이용해서 1~10까지 곱 구하기.
		
//		[1]
		for(int i=1;i<11;i++) {
			System.out.print("★");
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
