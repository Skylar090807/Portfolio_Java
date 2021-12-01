package day03;

public class Operator {

	public static void main(String[] args) {
		System.out.println("1. 증감 연산자 (++, --)--------");
//		++ : 1씩 증가
//		--: 1씩 감소
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
		
//		증감 연산자와 다른 연산자를 함께 사용할 때 ++ -- 순서 차이.
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
//		++c :c의 값ㅇ르 먼저 증가시킨 뒤 출력문에 사용
//		c++ :c값을 먼저 출력문에 사용한 뒤에 증가.
		
//		값 예측하기.
		int x=10;
		int y=x++;
//		x가 가진 값(10)을 먼저 y에 대입 후 x값을 1증가.
		System.out.println("x: "+x); //11
		System.out.println("y: "+y); //10
		
		x=10;
		int z=++x;
//		x값을 먼저 1증가시킨 뒤 z에 대입.
		System.out.println("x: "+x); //11
		System.out.println("z: "+z); //11
		
		System.out.println("2. 부호 연산자 (+, -)---------");
		int m=-8;
		System.out.println(+m);//-8
		System.out.println(-m);//8
		
		
		
	}

}
