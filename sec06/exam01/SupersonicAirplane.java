package sec06.exam01;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1; //��� NORMAL����
	public static final int SUPERSONIC = 2; //��� SYPERSONIC����
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		}else {
			super.fly();
			//Airplane ��ü��fly() �޼ҵ� ȣ��
		}
	}

}
