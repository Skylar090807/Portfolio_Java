package day06;

public class MathRandom {

	public static void main(String[] args) {
//		java.lang.Math의 random() method 활용
//		public static double random() : 0.0<=r<1.0
		
		for(int i=0;i<3;i++) {
			double r=Math.random();
			System.out.println("r: "+r);
		}
		
		System.out.println();
		System.out.println("[1]---------------");
//		[1] 0<r2<10 사이의 임의의 정수를 발생시켜 출력하세요.
		int r2=(int)(Math.random()*10);
		System.out.println("r2: "+r2);
		
		System.out.println();
		
		System.out.println("[2]-------------------");
//		[2] 5<= r3 <15 사이의 임의의 정수를 발생시켜 출력하세요.
        int r3=(int)(Math.random()*10+5);
        System.out.println("r3: "+r3);
        
        System.out.println((int)Math.floor(Math.random()*10+5));
//        int r=(int)(Math.random()*범위+시작수)
        
        System.out.println();
        
        System.out.println("[3]---------------------");
//        [3]33<= r4 <65 정수 출력
        int r4=(int)(Math.random()*32+33);
        System.out.println("r4: "+r4);
        
        System.out.println();
        
        System.out.println("[4]-------------------------------");
//      [4] 랜덤한 알파벳 대문자 아래와 같은 형태로 출력
        /* F E C E W
         * K I Z S Q
         * A S D W Q
         */
        for (int i=1; i<4; i++) {
        	for(int j=1;j<6;j++) {
            char ch=(char)(Math.random() *26+'A');
            System.out.print(ch+"\t");
        	}
        	System.out.println();
          }

          
         
		
	}//main()

}//class
