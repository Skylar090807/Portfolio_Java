package day03;
import java.util.Date;

public class ReferenceType {

	public static void main(String[] args) {
		System.out.println("--Reference Type--------");
		/*������
		 * 1)Ŭ������
		 * 2)�������̽���
		 * 3)�迭
		 * -�������� �ݵ�� new �����ڷ� ��ü�� �����ؼ� ����ؾ� �Ѵ�.
		 * ����) Sting�� ���� ����ϹǷ� �⺻�ڷ��� ó�� ���ڿ� ���� 
		 *      ���� �Ҵ� ���.
		 * 
		 */
		String s1=new String("Hello");
//		import java.lang.String �⺻ ������ �������� �ʾƵ� ��.
		String s2="�ݰ����ϴ�~~";
//		new ���ʰ� ���� ū����ǥ ���.
		Date d1=new Date();
//		java.util.Date
		Object o1=new Object();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(d1);
		System.out.println(o1);
//		java.lang.Object@2eee9593
//		@�� et�ǹ�. 2eee9593(16����)
		
		int n1=100;
//		�⺻�ڷ��� ��(literal) �� ���� �Ҵ�.
		System.out.println(n1);
	}

}
