package sec06.exam04;

public class Cat extends Animal {
	public Cat() {
		this.kind = "������";
	}

	@Override
	public void sound() {
		System.out.println("�߿�");
	}
	
	@Override
	public void run() {
		System.out.println("��ݻ��");
	}

	@Override
	public void fight() {
		System.out.println("��ī�ο� ����, ");
	}
}
