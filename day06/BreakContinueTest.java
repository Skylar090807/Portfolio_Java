package day06;

public class BreakContinueTest {

	public static void main(String[] args) {
		System.out.println("1.break-----------------------");
		for(int i=0;i<3;i++) {
			if(i==1)break;//������ true�� for���� �����.
			System.out.println("i: "+i);
		}
		System.out.println();
		
		
		System.out.println("2.continue-----------------------");
		for(int i=0;i<3;i++) {
			if(i==1)continue;//������ true�� �Ʒ� ���๮���� �ǳʶٰ� ��� �ݺ��� ����.
			System.out.println("i: "+i);
		}
		System.out.println();
		
		//��� ���� ����
		System.out.println("3.break--------------------------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) break;//���� ����� �ݺ��� ���.
				System.out.println("i="+i+", k="+k);
				
			}
		}
		System.out.println();
		
		System.out.println("4.continue--------------------------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) continue;//���� ����� �ݺ��� ��� ����.
				System.out.println("i="+i+", k="+k);
				
			}
		}
		System.out.println();
		
		System.out.println("5.label: break--------------------------------");
		outer: //label: �ݺ��� �ٷ� �տ� label ���� �� �ִ�.
		for(int i=0;i<3;i++) {
			inner: //label:
			for(int k=0;k<3;k++) {
				if(k==1) break outer;//outer�� ����� �ݺ��� �����.
				System.out.println("i="+i+", k="+k);
				
			}
		}
		System.out.println();
		
		System.out.println("6.label: continue--------------------------------");
		outer: //label: �ݺ��� �ٷ� �տ� label ���� �� �ִ�.
		for(int i=0;i<3;i++) {
			inner: //label:
			for(int k=0;k<3;k++) {
				if(k==1) continue outer;//outer�� ����� �ݺ��� ��� ����.
				System.out.println("i="+i+", k="+k);
				
			}
		}
		System.out.println();

	}//main()

}//class
