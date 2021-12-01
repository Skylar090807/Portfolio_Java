package sec08.exam01;

public class A2 {
	//인스턴스 필드, 메소드 - stack공간 사용
	int field1;
	void method1() { }
	
	//정적 필드, 메소드 - shared data공간/공유(정적)메모리 사용 
	static int field2;
	static void method2() { }
	
	class B {
		void method() {//함수는 stack공간 사용
			field1 = 10;//stack공간 접근 가능
			method1();

			field2 = 10;//shared data/공유메모리 공간 접근 가능
			method2();
		}
	}
	
	static class C {
		void method() {
			//field1 = 10;
			//method1();

			field2 = 10; //shared data/공유메모리 공간 접근 가능
			method2();
		}
	}

}
