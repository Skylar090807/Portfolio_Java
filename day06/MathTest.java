package day06;

public class MathTest {

	public static void main(String[] args) {
		/* java.lang.math 클래스가 가지고 있는 Field(전역변수)
		 * public static final double PI
		 * public static final double E
		 * 
		 * -final : 상수를 만들 때 붙이는 modifier
		 * -static : 변수 앞에 붙으면 "클래스 변수"라고 함 => 전역변수를 만들 때 붙인다.
		 *           static 변수에 접근하고자 할 때는 
		 *           "클래스명.변수" 식으로 접근해야 한다.
		 *           Math.PI
		 */
		System.out.println(Math.PI);
		System.out.println(Math.E);//자연상수
		
		System.out.println("-------------------------------");
		
//		Math 클래스의 method
		/* 
		 * public static double abs(double a) : 매개변수 a의 절대값을 구해 반환.
		 * -public: 접근지정자(access modifer)
		 * -static: 지정자,제한자(modifier)
		 * -abs: method명
		 * -double a: 매개변수(실수유형)
		 * 
		 * static method접근 시 "클래스.메소드()"
		 */
		double a=Math.abs(-13.123);
		System.out.println("a: "+a);
		
		System.out.println("----------------------------------");
		
//		public static double ceil(double a) :올림 값
//		public static double floor(double a) :내림 값
//      public static long	round(double a)  :반올림 값
//		public static int	max(int a, int b):a,b 중 최대 값 반환
//		public static int	min(int a, int b):a,b 중 최소 값 반환
//	    public static double random(): 0.0 r<1.0 사이 임의의 실수 반환 
		
		double b=Math.ceil(123.0001);
		System.out.println("123.0001의 올림값 "+b);
		double c=Math.floor(123.0001);
		System.out.println("123.0001의 내림값 "+c);
		
		
		//123.501의 반올림을 구해 출력.
		long d=Math.round(123.501);
		System.out.println("123.501의 반올림값 "+d);
		
		System.out.println();
		
		//-78, -24 중 최대값, 최소값을 출력
		int e=Math.max(-78, -24);
		int f=Math.min(-78, -24);
		System.out.println("최대값: "+e+", 최소값: "+f);
		
		System.out.println();
		
		//random
		double r=Math.random();
		System.out.println("r: "+r);
		//0.0<=r<1.0
		
		
		
		
	}

}
