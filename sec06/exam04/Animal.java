package sec06.exam04;

public abstract class Animal {//�߻� Ŭ����
	//�ʵ�
    public String kind;
	
    //�޼ҵ�
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
    //�߻� �޼ҵ�
	public abstract void sound();
	public abstract void run();
	public abstract void fight();


}
