package sec08.exam01;

public class A1 {
	    //�ν��Ͻ� �ʵ�
		B field1 = new B();               
		C field2 = new C();               
		
		//�ν��Ͻ� �޼ҵ�
		void method1() {
			B var1 = new B();
			C var2 = new C();
		}
		
		//���� �ʵ� �ʱ�ȭ
		//static B field3 = new B();//class B�� �ν��Ͻ� Ŭ������ ���� �ʵ� ���� �Ұ�
		static C field4 = new C();
		
		//���� �޼ҵ�
		static void method2() {
			//B var1 = new B();
			C var2 = new C();
		}
		
		//�ν��Ͻ� ��� Ŭ����
		class B {}
		//���� ��� Ŭ����
		static class C {}


}
