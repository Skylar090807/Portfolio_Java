package day05;


public class DoWhileTest {

	public static void main(String[] args) {
		/* ���� ���� �� �ʱ�ȭ;
		 * do{
		 *     �ݺ� ���� ����;
		 *     ������;
		 *     
		 * }while(���ǽ�);
		 * -while���� ��� ������ ���� �Ǵ��Ͽ� ������ true�� �ݺ�����������,
		 *  do~while���� ������ false�� �� ���� �����ϰ� �������� �����. 
		 */
		int a=-7;
		do {
			System.out.println("Hello: "+a);
			a-=3;
		}while(a>0);
		System.out.println("-The End- :"+a);
		
		//[1]do~while���� �̿�, 1~20���� ���� �� 2�Ǵ� 3�� ����� �ƴ� �� ���� �� ��.
		//[2]do~while���� �̿��ؼ� 1~30������ ���� �� 5�������� "����", 10�������� "����" ���,
		//�������� ���ڷ� ���.
		
		//[1]
		int b=1;
		int total=0;
		do {
			if(!(b%2==0||b%3==0)) {
				System.out.println(b);
				total+=b;
			}
			b++;
		}while(b<21);
		System.out.println("sum: "+total);
		
		System.out.println("------------------------");
		int i=1, sum=0;
		do {
			if(i%2!=0 && i%3!=0) {
				System.out.print(i+" ");
				sum += i;
			}
		} while(++i<=20);
		System.out.println("\n���� : "+sum);
		
		
		//[2]
		int num=1;
		do {
			if(num%10==0) {
				System.out.print("����, ");
			}else if(num%5==0) {
				System.out.print("����, ");
			}else {
				System.out.print(num+", ");
			}
			num++;
		}while(num<=30);
		System.out.println("");
		
		
		System.out.println("-----------------------------");
		
		int	x=1;
		do {
			if(x%10 == 5)
				System.out.print("����, ");
			else if(x%10 ==0)
				System.out.print("����, ");
			else 
				System.out.print(x+", ");
		} while(++x<=30);
		System.out.println("...");


		
		
		

	}//main()

}//class
