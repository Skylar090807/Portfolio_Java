package day02;

public class DataType4 {

	public static void main(String[] args) {
//		변수(variable, field, property, attribute)
		/*변수 명명규칙
		 * -소문자로 시작
		 * -명사형
		 *  int word=10;
		 *  int age=22;
		 *  String myName: camel표기법
		 *  String my_name: 케밥표기법
		 * -특수문자 사용 불가
		 *  _, $는 사용 가능
		 */
		int age=33;
	    String name="최승희";
	    double x1=3.141592;
	    float x$b=100;
	    char 나='나';
	    System.out.println(age);
	    System.out.println(name);
	    System.out.println(x1);
	    System.out.println(x$b);
	    System.out.println(나);

	    System.out.println(name+10+20);
//	    String+연산자 사용은 문자열 결합.
	    System.out.println(10+20+name);
//      연산을 앞에 입력해야 연산가능.
	    
/*      국어, 영어, 수학 점수 담아줄 변수 선언 후
 *      알맞는 값 할당.
 *      합계 점수와 평균 점수 출력.
 */
	    int kor=90;
	    int eng=80;
	    int math=70;
	    
	    int sum=kor+eng+math;
	    int avg=sum/3;
	   
	    System.out.println("국어\t영어\t수학");
	    System.out.println("-------------------");
	    System.out.println(kor+"\t"+eng+"\t"+math);
	    System.out.println("합계 점수: "+sum+"점");
	    System.out.println("평균 점수: "+avg+"점");
	    
	    
	}

}
