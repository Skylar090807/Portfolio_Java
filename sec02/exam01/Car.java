package sec02.exam01;

public class Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//������
	Car() {
	}
	
	Car(String model) {
		this(model,null,0); //�ٸ� ������ �Լ� ȣ���� �ʱ�ȭ �۾� ����
//		this.model = model;
	}
	
	Car(String model, String color) { 
		this(model, color, 0); //�ٸ� ������ �Լ� ȣ���� �ʱ�ȭ �۾� ����
//		this.model = model;
//		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) { //�� this ȣ�� ����
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	
	//	speed �� ���� �޼ҵ� ����
	void speedSet(int speed) {
		this.speed = speed;
	}
	
	void getSpeed() {
		System.out.println(this.speed);
	}
}//class