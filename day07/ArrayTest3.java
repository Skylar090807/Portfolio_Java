package day07;

public class ArrayTest3 {

	public static void main(String[] args) {
		/* 2차원 배열
		 * [1] 선언
		 * [2] 메모리 할당
		 * [3] 초기화
		 */
		
//		[1]
		int [][]a;
//		int b[][];
		int []c[];
		
//		[2]
		a=new int[3][2];//row:3,column:2
		
//		[3]
		a[0][0]=1;
		a[0][1]=2;
		
		a[1][0]=3;
		a[1][1]=4;
		
		a[2][0]=5;
		a[2][1]=6;
		
//		중첩 for루프로 a 저장된 값 출력
		for(int i=0;i<a.length;i++) {//row 조건: row size->a.length
			for(int j=0;j<a[i].length;j++) {//column 조건: a[i].length
//				열은 행을 가리키고있다. 
				
				System.out.print(a[i][j]+", ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		
//		선언과 동시에 메모리 할당, 초기화
		int b[][]= {
				{5,6,7},
				{'A','B'},
				{0x12}
		};
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+", ");
			}
			System.out.println();
		}

	}//main()

}
