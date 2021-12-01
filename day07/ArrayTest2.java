package day07;

public class ArrayTest2 {

	public static void main(String[] args) {
//		float 유형 1차원 배열 선언. 초기값 부여.
//		저장할 값:-16.23, 100.5, 43, 'z', 3e+3
//		for 루프로 출력
//	    저장된 값 합계와 평균값 출력
		float arr[]= {(float)-16.23, 100.5f, 43, 'z', 3e+3f};
		float sum=0.0f;
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
			sum+=arr[i];
		}
		System.out.println("합계: "+sum);
		System.out.println("평균: "+(sum/arr.length));
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		int [] a= {1,2,3,4,};
		
		int b[];
		
		b=a;
		/* a------>|1|2|3|4|
		 *        |
		 * b------*
		 * 배열 b에 기존 배열 a로 할당한다.
		 * 이 떄 배열 b는 새로운 메모리를 할당받아 생성되는 것이 아닌,
		 * a가 참조하는 배열을 가리키는 형태.
		 * 따라서 a, b에 저장된 값을 변경 시 함께 변경.
		 * 
		 */
		
		System.out.println("a[0]= "+a[0]);
		System.out.println("b[0]= "+b[0]);
		
		b[3]=800;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		System.out.println("-----------------");
		System.out.println();
		
		/* [실습] 참조관계 이용 x,y에 저장된 값 서로 바꾼 뒤
		 * for루프로 x, y 저장된 값 출력 
		 * 
		 */
		int[] x= {100,200};
		int y []= {3,4,5,6};
		int tmp[];
		
		tmp=x;
		x=y;
		y=tmp;
		
		for(int i=0; i<x.length; i++)
			System.out.println("x["+i+"]="+x[i]);
		for(int i=0; i<y.length; i++)
			System.out.println("y["+i+"]="+y[i]);

		
		
		
		
		

	}

}
