package day07;
/* Array
 * -동류 데이터 집합.
 * -크기 고정. 해당 크기 내 데이터 저장.
 * -참조형(reference type)
 * 
 * 1.기본참조형
 * 2.참조형
 *   :new 연산자를 사용해 초기화.
 * -클래스형
 * -인터페이스형
 * -배열
 *  
 */
public class ArrayTest {

	public static void main(String[] args) {
		/* 배열 생성하는 방법
		 * [1] 선언
		 * [2] 메모리 할당
		 * [3] 초기화
		 */
		
		int arr[];// [1] 1차원 배열 선언
//		int []arr; 대괄호 먼저 쓰는 것도 가능. 값을 넣으면 안 됨.
		
//		[2] 메모리 할당
		arr=new int[3];
		
//		[3] 초기화
//		index는 항상 0부터 배열크기 -1까지
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		System.out.println("arr[0]: "+arr[0]);
		System.out.println("arr[1]: "+arr[1]);
		System.out.println("arr[2]: "+arr[2]);
		
		System.out.println();
		System.out.println("--------------------");
		
//		[실습1] double 타입 1차원 배열 선언, 메모리 할당. 배열 크기:5
		double a[]; //값 설정하지 않았을 때 default 값 존재. ex) double=0.0 
		a=new double[5];
		a[0]=456.123;
		a[1]=3.14;
		a[2]=200;
		a[3]='A';
		a[4]=741e-3;//e-3 =10^-3
		System.out.println("a[0]: "+a[0]);
		System.out.println("a[1]: "+a[1]);
		System.out.println("a[2]: "+a[2]);
		System.out.println("a[3]: "+a[3]);
		System.out.println("a[4]: "+a[4]);
		
		System.out.println();
		System.out.println("-------------------");
		
//		for루프 이용해 a에 저장된 값 한꺼번에 출력
		for(int i=0;i<5;i++) {//i=0;i<6;i++ 배열0~4를 넘으므로 에러.
			System.out.println("a["+i+"]: "+a[i]);
			
		}
		
		System.out.println();
		System.out.println("----------------------");
		
//		배열 크기: length 속성으로 확인.
		System.out.println("a.length: "+a.length);
		
		System.out.println();
		System.out.println("----------------");
//		[1]+[2],[3] 선언과 메모리 할당 동시에 한 후 초리화
		char [] crr=new char[4];//[1]+[2]
//		[3] 초기화
		crr[0]='J';
		crr[1]='a';
		crr[2]='v';
		crr[3]='a';
		
		//crr에 저장된 값을 for 루프 이용 출력
		for(int i=0;i<crr.length;i++) {
			System.out.print(crr[i]);
		}
		
		
		
		System.out.println();
		
//		[1]+[2]+[3]
		char drr[]= {'H','e','l','l','o'};
		
		//drr
		for(int i=0;i<5;i++) {
			System.out.print(drr[i]);
		}
		

		
				
		

	}

}
