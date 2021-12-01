package day03;

public class Operator4 {

	public static void main(String[] args) {
		/* ��������: &, |
		 *          &&, ||
		 *         -&������ (AND ������)
		 *          T & T =true(��� true�� ��츸 true)
		 *         -|������ (OR ������)
		 *          T | T =true (�ϳ��� true���� true) 
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
		     : &,| �����ڸ� ����ϸ� ���� �������� ����� �� �� �־
			   ���� ������� ���Ѵ�.
		   3) &&
		   4) ||
		     : ���� �������� ����� �� �� ���� ���, ���� ������ �������� �ʴ´�.
			   ���� ��� &&�� ��� ���� �������� false�̸� ���� ������ �����Ѵ�.
			   		   ||�� ���� ���� �������� true�̸� ���� ������ �����Ѵ�.
		 * */

//		[����1] �Ʒ� ��� �� �����غ�����.
//		&������
		int i=1;
		int j=i++; //j:1, i:2
		
		if((i>++j) & (i++ == j)) {
			i= i+j;
		}
		System.out.println("i="+i);//i=3
		
/*		&&������
 *      int i=1;
		int j=i++; //j:1, i:2
		
		if((i>++j) && (i++ == j)) { ���� ������ false�̹Ƿ� �� ���� ����x
			i= i+j;
		}
		System.out.println("i="+i);//i=2
*/
		
//		[����2]
//		|������
		int k=0;
		int p=1;
		if((k++ == 0) | (p++ == 2)) {
			k=42;
		}
		System.out.println("k: "+k+", p: "+p);//k:42, p:2
		
//		||������
/*		int k=0;
		int p=1;
		if((k++ == 0) | (p++ == 2)) {
			k=42;
		}
		System.out.println("k: "+k+", p: "+p);//k:42, p:1
*/
		
//		[����3]
		boolean r=false;
		boolean e=false;
		boolean w=((r=true)|(e=true));
		System.out.println("r: "+r+", e: "+e+", w: "+w);
		//r:true, e:true, w:true
		
//		||������
/*		boolean r=false;
		boolean e=false;
		boolean w=((r=true)|(e=true));
		System.out.println("r: "+r+", e: "+e+", w: "+w);
		r:true, e:false, w:true

*/

	}

}
