package day03;

public class Operator {

	public static void main(String[] args) {
		System.out.println("1. ���� ������ (++, --)--------");
//		++ : 1�� ����
//		--: 1�� ����
		int a=5;
		long b=9;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a++;
		b--;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		++a;
		--b;
		System.out.println("-------------");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
//		���� �����ڿ� �ٸ� �����ڸ� �Բ� ����� �� ++ -- ���� ����.
		float c=8.7f;
		double d=6.4;
		
		System.out.println(c++); //8.7
		System.out.println("c: "+c); //9.7
		System.out.println(++c); //10.7
		System.out.println("c: "+c); //10.7
		
		System.out.println(d--); //6.4
		System.out.println("d: "+d); //5.4
		System.out.println(--d); //4.4
		System.out.println("d: "+d); //4.4
//		++c :c�� ������ ���� ������Ų �� ��¹��� ���
//		c++ :c���� ���� ��¹��� ����� �ڿ� ����.
		
//		�� �����ϱ�.
		int x=10;
		int y=x++;
//		x�� ���� ��(10)�� ���� y�� ���� �� x���� 1����.
		System.out.println("x: "+x); //11
		System.out.println("y: "+y); //10
		
		x=10;
		int z=++x;
//		x���� ���� 1������Ų �� z�� ����.
		System.out.println("x: "+x); //11
		System.out.println("z: "+z); //11
		
		System.out.println("2. ��ȣ ������ (+, -)---------");
		int m=-8;
		System.out.println(+m);//-8
		System.out.println(-m);//8
		
		
		
	}

}
