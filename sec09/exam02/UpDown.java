package sec09.exam02;
import java.util.*; //Random, Scanner 사용 위해 import
public class UpDown {

	public static void main(String[] args) {
		Random ran = new Random(0); //Random 초기화
		Scanner stdin = new Scanner(System.in);//Scanner값 stdin 대입
		
		int key = ran.nextInt(100)+1; //랜덤 값 1~100 범위 설정
		System.out.println("-------------------------");
		System.out.println("1~100 사이 값 중 하나 선택하여 답을 맞춰보세요.");
		System.out.println("-------------------------");
		while(true) {//while문 무한루프
			System.out.println("==▶");//Scanner에서 입력 값 받기 위해 출력
			int num = stdin.nextInt();//Scanner에서 받은 값 num에 대입
			if(num==key) {//Scanner 입력값이 랜덤 값과 같을 때 수행
				System.out.println("정답입니다!");
				break;//break문으로 무한루프 나옴.
			}
			else if(num>key)//입력 받은 num값이 랜덤 값 보다 작을 때 수행
				System.out.println("더 작은 값입니다! 다시 입력하세요.");
			else//위 조건과 다를 때 수행
				System.out.println("더 큰 값입니다! 다시 입력하세요.");
			
		}
		System.out.println("--------------------------------");
		System.out.println("Maker: Seunghee Choe");
		
		
		
		

	}

}
