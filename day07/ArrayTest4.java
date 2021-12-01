package day07;

public class ArrayTest4 {

	public static void main(String[] args) {
		//2 차원 배열 [문제1]
		/*5행5열의 2차원 배열을 생성해서 아래와 같이 값을 
		 * 저장하되, 반복문 이용해서 저장한 뒤, 출력하기
		 * 
		 * 1 0 0 0 0
		 * 0 1 0 0 0
		 * 0 0 1 0 0
		 * 0 0 0 1 0
		 * 0 0 0 0 1
		 * 
		 * */
		int m[][] = new int[5][5];
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				//m[i][j] = (i==j) ? 1 : 0;
				if(i==j)
					m[i][j]=1;
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------");
		//행의 크기만 먼저 잡아놓고, 열의 크기는 나중에 필요할 때 할당받을 수 있다.
		char[]ch[]=new char[3][];
		
		ch[0]=new char[2];//1행은 2열
		ch[1]=new char[4];//2행은 4열
		ch[2]=new char[3];//3행은 3열
		
		ch[0][0]='H';
		ch[0][1]='i';
		
		ch[1][0]='J';
		ch[1][1]='a';
		ch[1][2]='v';
		ch[1][3]='a';
		
		//char의 디폴트 '\u0000'
		
		//for루프 이용해서 출력해보세요
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		System.out.println("Bye~~~");
		
		//String 타입의 2차원 배열을 선언하고 메모리 할당 후 문자열을 저장하세요.
		//그런뒤 for루프 이용해서 출력하세요
		String []str[]=new String[2][];
		
		str[0]=new String[4];
		str[1]=new String[1];
		
		str[0][0]="Hello";
		str[0][1]="Java";
		str[0][2]="Happy";
		str[0][3]=new String("Good~");
		
		str[1][0]=new String("Bye~~");
		
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str[i].length;j++) {
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
		}

		/* [1] 다음 예시를 보고 자료 유형을 맞춰보세요
		 * 1) int i, j;    i: int형, j:int형
		 * 2) int i[], j;  i: int타입의 1차원 배열, j: int형
		 * 
		 * 3) int [] i, j;  i,j모두 int형의 1차원 배열
		 * 4) int i[], j[][], k;
		 *        i:int 1차원
		 *        j:int 2차원
		 *        k:int
		 * 5) int []i[], j;
		 *        i:int 2차
		 *        j:int 1차
		 * 6) int []i[], []j;
		 *        i,j 모두 int 2차원
		 * 
		 * */

	}

}





