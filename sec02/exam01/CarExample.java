package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
//		��ü ����
//		car= mycar5();
//		mycar5= new car();
		Car myCar = new Car();
//		�ʵ� �� �б�
		System.out.println("����ȸ��: "+myCar.company);
		System.out.println("�𵨸�: "+myCar.model);
		System.out.println("����: "+myCar.color);
		System.out.println("�ְ� �ӵ�: "+myCar.maxSpeed);
		System.out.println("���� �ӵ�: "+myCar.speed);
		
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		
		Car myCar1 = new Car("G80");
		
		System.out.println("����ȸ��: "+myCar1.company);
		System.out.println("�𵨸�: "+myCar1.model);
		System.out.println("����: "+myCar1.color);
		System.out.println("�ְ� �ӵ�: "+myCar1.maxSpeed);
		System.out.println("���� �ӵ�: "+myCar1.speed);
		
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		
        Car myCar2 = new Car("G80","������");
		
		System.out.println("����ȸ��: "+myCar2.company);
		System.out.println("�𵨸�: "+myCar2.model);
		System.out.println("����: "+myCar2.color);
		System.out.println("�ְ� �ӵ�: "+myCar2.maxSpeed);
		System.out.println("���� �ӵ�: "+myCar2.speed);
		
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		
        Car myCar3 = new Car("G80","������",300);
        myCar3.speedSet(100);
        myCar3.getSpeed();
		
		System.out.println("����ȸ��: "+myCar3.company);
		System.out.println("�𵨸�: "+myCar3.model);
		System.out.println("����: "+myCar3.color);
		System.out.println("�ְ� �ӵ�: "+myCar3.maxSpeed);
		System.out.println("���� �ӵ�: "+myCar3.speed);
		
		

	}

}
