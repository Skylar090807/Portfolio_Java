package day03;

public class Operator4 {

	public static void main(String[] args) {
		/* 논리연산자: &, |
		 *          &&, ||
		 *         -&연산자 (AND 연산자)
		 *          T & T =true(모두 true일 경우만 true)
		 *         -|연산자 (OR 연산자)
		 *          T | T =true (하나만 true여도 true) 
		 *          T | F =true
		 * 
		 */
		int a=50;
		int b=60;
		
		if((a>0) & (a>=b)) {
			System.out.println("@@@");
		}
		else {
			System.out.println("###");
		}
		System.out.println("-------------");
		if((a>0) | (a>=b)) {
			System.out.println("@@@");
		}
		else {
			System.out.println("###");
		}
		/*1) &
		   2) |
		     : &,| 연산자를 사용하면 앞의 연산으로 결과를 알 수 있어도
			   뒤의 문장까지 비교한다.
		   3) &&
		   4) ||
		     : 앞의 연산으로 결과를 알 수 있을 경우, 뒤의 연산은 수행하지 않는다.
			   예를 들어 &&의 경우 앞의 연산결과가 false이면 뒤의 연산을 생략한다.
			   		   ||의 경우는 앞의 연산결과가 true이면 뒤의 연산을 생략한다.
		 * */

//		[문제1] 아래 출력 값 예측해보세요.
//		&연산자
		int i=1;
		int j=i++; //j:1, i:2
		
		if((i>++j) & (i++ == j)) {
			i= i+j;
		}
		System.out.println("i="+i);//i=3
		
/*		&&연산자
 *      int i=1;
		int j=i++; //j:1, i:2
		
		if((i>++j) && (i++ == j)) { 앞의 연산이 false이므로 뒤 연산 수행x
			i= i+j;
		}
		System.out.println("i="+i);//i=2
*/
		
//		[문제2]
//		|연산자
		int k=0;
		int p=1;
		if((k++ == 0) | (p++ == 2)) {
			k=42;
		}
		System.out.println("k: "+k+", p: "+p);//k:42, p:2
		
//		||연산자
/*		int k=0;
		int p=1;
		if((k++ == 0) | (p++ == 2)) {
			k=42;
		}
		System.out.println("k: "+k+", p: "+p);//k:42, p:1
*/
		
//		[문제3]
		boolean r=false;
		boolean e=false;
		boolean w=((r=true)|(e=true));
		System.out.println("r: "+r+", e: "+e+", w: "+w);
		//r:true, e:true, w:true
		
//		||연산자
/*		boolean r=false;
		boolean e=false;
		boolean w=((r=true)|(e=true));
		System.out.println("r: "+r+", e: "+e+", w: "+w);
		r:true, e:false, w:true

*/

	}

}
