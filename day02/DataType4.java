package day02;

public class DataType4 {

	public static void main(String[] args) {
//		����(variable, field, property, attribute)
		/*���� ����Ģ
		 * -�ҹ��ڷ� ����
		 * -�����
		 *  int word=10;
		 *  int age=22;
		 *  String myName: camelǥ���
		 *  String my_name: �ɹ�ǥ���
		 * -Ư������ ��� �Ұ�
		 *  _, $�� ��� ����
		 */
		int age=33;
	    String name="�ֽ���";
	    double x1=3.141592;
	    float x$b=100;
	    char ��='��';
	    System.out.println(age);
	    System.out.println(name);
	    System.out.println(x1);
	    System.out.println(x$b);
	    System.out.println(��);

	    System.out.println(name+10+20);
//	    String+������ ����� ���ڿ� ����.
	    System.out.println(10+20+name);
//      ������ �տ� �Է��ؾ� ���갡��.
	    
/*      ����, ����, ���� ���� ����� ���� ���� ��
 *      �˸´� �� �Ҵ�.
 *      �հ� ������ ��� ���� ���.
 */
	    int kor=90;
	    int eng=80;
	    int math=70;
	    
	    int sum=kor+eng+math;
	    int avg=sum/3;
	   
	    System.out.println("����\t����\t����");
	    System.out.println("-------------------");
	    System.out.println(kor+"\t"+eng+"\t"+math);
	    System.out.println("�հ� ����: "+sum+"��");
	    System.out.println("��� ����: "+avg+"��");
	    
	    
	}

}
