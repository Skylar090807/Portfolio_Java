package day06;

public class MathRandom {

	public static void main(String[] args) {
//		java.lang.Math�� random() method Ȱ��
//		public static double random() : 0.0<=r<1.0
		
		for(int i=0;i<3;i++) {
			double r=Math.random();
			System.out.println("r: "+r);
		}
		
		System.out.println();
		System.out.println("[1]---------------");
//		[1] 0<r2<10 ������ ������ ������ �߻����� ����ϼ���.
		int r2=(int)(Math.random()*10);
		System.out.println("r2: "+r2);
		
		System.out.println();
		
		System.out.println("[2]-------------------");
//		[2] 5<= r3 <15 ������ ������ ������ �߻����� ����ϼ���.
        int r3=(int)(Math.random()*10+5);
        System.out.println("r3: "+r3);
        
        System.out.println((int)Math.floor(Math.random()*10+5));
//        int r=(int)(Math.random()*����+���ۼ�)
        
        System.out.println();
        
        System.out.println("[3]---------------------");
//        [3]33<= r4 <65 ���� ���
        int r4=(int)(Math.random()*32+33);
        System.out.println("r4: "+r4);
        
        System.out.println();
        
        System.out.println("[4]-------------------------------");
//      [4] ������ ���ĺ� �빮�� �Ʒ��� ���� ���·� ���
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
