package sec09.exam02;
import java.util.*; //Random, Scanner ��� ���� import
public class UpDown {

	public static void main(String[] args) {
		Random ran = new Random(0); //Random �ʱ�ȭ
		Scanner stdin = new Scanner(System.in);//Scanner�� stdin ����
		
		int key = ran.nextInt(100)+1; //���� �� 1~100 ���� ����
		System.out.println("-------------------------");
		System.out.println("1~100 ���� �� �� �ϳ� �����Ͽ� ���� ���纸����.");
		System.out.println("-------------------------");
		while(true) {//while�� ���ѷ���
			System.out.println("==��");//Scanner���� �Է� �� �ޱ� ���� ���
			int num = stdin.nextInt();//Scanner���� ���� �� num�� ����
			if(num==key) {//Scanner �Է°��� ���� ���� ���� �� ����
				System.out.println("�����Դϴ�!");
				break;//break������ ���ѷ��� ����.
			}
			else if(num>key)//�Է� ���� num���� ���� �� ���� ���� �� ����
				System.out.println("�� ���� ���Դϴ�! �ٽ� �Է��ϼ���.");
			else//�� ���ǰ� �ٸ� �� ����
				System.out.println("�� ū ���Դϴ�! �ٽ� �Է��ϼ���.");
			
		}
		System.out.println("--------------------------------");
		System.out.println("Maker: Seunghee Choe");
		
		
		
		

	}

}
