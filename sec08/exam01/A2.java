package sec08.exam01;

public class A2 {
	//�ν��Ͻ� �ʵ�, �޼ҵ� - stack���� ���
	int field1;
	void method1() { }
	
	//���� �ʵ�, �޼ҵ� - shared data����/����(����)�޸� ��� 
	static int field2;
	static void method2() { }
	
	class B {
		void method() {//�Լ��� stack���� ���
			field1 = 10;//stack���� ���� ����
			method1();

			field2 = 10;//shared data/�����޸� ���� ���� ����
			method2();
		}
	}
	
	static class C {
		void method() {
			//field1 = 10;
			//method1();

			field2 = 10; //shared data/�����޸� ���� ���� ����
			method2();
		}
	}

}
