package sec06.exam04;

public class Dog extends Animal {
	public Dog() {
		this.kind = "������";
	}

	@Override
	public void sound() {
		System.out.println("�۸�");
	}
	
	@Override
	public void run() {
		System.out.println("���沱��");
	}

	@Override
	public void fight() {
		System.out.println("��ī�ο� �̻� ");
	}

}
