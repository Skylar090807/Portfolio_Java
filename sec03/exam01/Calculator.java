package sec03.exam01;

public class Calculator {
//	�ʵ�
	String calcType; //����, �Ϲ�
	String brandName; //�Ｚ, ī�ÿ�, �Ҵ�
	int price; //����
	
//	������ �Լ� �����ε�
	Calculator(){
	} //�⺻ ������ �ڵ� ����. ���� ����.
	
	public Calculator(String caclType,String brandName, int price){
		this.calcType=calcType;
		this.brandName=brandName;
		this.price=price;
	}
	
	
	
	
		
	
	
	//method �Լ� �����ε�
	
	public void calcInfo() {
		System.out.println("���� ����: "+calcType);
		System.out.println("���� �귣��: "+brandName);
		System.out.println("���� ����: "+price);
	}
	
	public void calcInfo(String owner) {
		System.out.println("---------------------");
		System.out.println("������ �̸�: "+owner);
		System.out.println("���� ����: "+calcType);
		System.out.println("���� �귣��: "+brandName);
		System.out.println("���� ����: "+price);
		System.out.println("---------------------");
	}
	
	public void calcInfo(String owner, int year) {
		System.out.println("---------------------");
		System.out.println("������ �̸�: "+owner);
		System.out.println("���� ����: "+year);
		System.out.println("���� ����: "+calcType);
		System.out.println("���� �귣��: "+brandName);
		System.out.println("���� ����: "+price);
		System.out.println("---------------------");
	}
	
	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public int plus(int x, int y) {
		return x+y;
//		int result = x + y;
//		return result; �� return x+y; �� �ٷ� �ٿ� �������⵵�� ���� �� �ִ�.
	}
	
	public double plus(double x, double y) {
		return x+y;
	}
	
	public int minus(int x, int y) {
		return x-y;
	}
	
	public double minus(double x, double y) {
		return x-y;
	}
	
	public int mul(int x, int y) {
		return x*y;
	}
	
	public double mul(double x, double y) {
		return x*y;
	}
	
	public double divide(int x, int y) {
		return (double)x / (double)y;
	}
	
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
		
	}

}
