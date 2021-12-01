package day06;

public class BreakContinueTest {

	public static void main(String[] args) {
		System.out.println("1.break-----------------------");
		for(int i=0;i<3;i++) {
			if(i==1)break;//조건이 true면 for루프 벗어나라.
			System.out.println("i: "+i);
		}
		System.out.println();
		
		
		System.out.println("2.continue-----------------------");
		for(int i=0;i<3;i++) {
			if(i==1)continue;//조건이 true면 아래 실행문장을 건너뛰고 계속 반복문 수행.
			System.out.println("i: "+i);
		}
		System.out.println();
		
		//결과 예측 문제
		System.out.println("3.break--------------------------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) break;//가장 가까운 반복문 벗어남.
				System.out.println("i="+i+", k="+k);
				
			}
		}
		System.out.println();
		
		System.out.println("4.continue--------------------------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) continue;//가장 가까운 반복문 계속 수행.
				System.out.println("i="+i+", k="+k);
				
			}
		}
		System.out.println();
		
		System.out.println("5.label: break--------------------------------");
		outer: //label: 반복문 바로 앞에 label 붙일 수 있다.
		for(int i=0;i<3;i++) {
			inner: //label:
			for(int k=0;k<3;k++) {
				if(k==1) break outer;//outer와 가까운 반복문 벗어나라.
				System.out.println("i="+i+", k="+k);
				
			}
		}
		System.out.println();
		
		System.out.println("6.label: continue--------------------------------");
		outer: //label: 반복문 바로 앞에 label 붙일 수 있다.
		for(int i=0;i<3;i++) {
			inner: //label:
			for(int k=0;k<3;k++) {
				if(k==1) continue outer;//outer와 가까운 반복문 계속 수행.
				System.out.println("i="+i+", k="+k);
				
			}
		}
		System.out.println();

	}//main()

}//class
