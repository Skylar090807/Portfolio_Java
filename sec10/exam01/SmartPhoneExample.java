package sec10.exam01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����","�ȵ���̵�");
		
		String strObj = myPhone.toString();//�����ǵ� toString() ȣ��
		System.out.println(strObj);
		
		System.out.println(myPhone.toString());//�����ǵ� toString()�� ȣ���ϰ� ���ϰ� �޾� ���
		System.out.println(myPhone);//�����ǵ� toString()�� ȣ���ϰ� ���ϰ� �޾� ���
//		myPhone.toString�� toString�� �����ص� ���� ���� ����Ų��.
		
		
		for(int i=0;i<10; i++) {
			System.out.println(i);
			if(i==5) {
//				break;
				System.exit(0);//���α׷�(JVM) ���� ����.
			}
			
		}
		System.out.println("���α׷� ����.");

	}

}
