package day05;


public class DoWhileTest {

	public static void main(String[] args) {
		/* 변수 선언 및 초기화;
		 * do{
		 *     반복 실행 문장;
		 *     증감식;
		 *     
		 * }while(조건식);
		 * -while문의 경우 조건을 먼저 판단하여 조건이 true면 반복실행하지만,
		 *  do~while문은 조건이 false라도 한 번은 실행하고 루프문을 벗어난다. 
		 */
		int a=-7;
		do {
			System.out.println("Hello: "+a);
			a-=3;
		}while(a>0);
		System.out.println("-The End- :"+a);
		
		//[1]do~while루프 이용, 1~20사이 정수 중 2또는 3의 배수가 아닌 수 들의 총 합.
		//[2]do~while루프 이용해서 1~30까지의 정수 중 5단위마다 "땅콩", 10단위마다 "찐콩" 출력,
		//나머지는 숫자로 출력.
		
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
		System.out.println("\n총합 : "+sum);
		
		
		//[2]
		int num=1;
		do {
			if(num%10==0) {
				System.out.print("찐콩, ");
			}else if(num%5==0) {
				System.out.print("땅콩, ");
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
				System.out.print("땅콩, ");
			else if(x%10 ==0)
				System.out.print("찐콩, ");
			else 
				System.out.print(x+", ");
		} while(++x<=30);
		System.out.println("...");


		
		
		

	}//main()

}//class
