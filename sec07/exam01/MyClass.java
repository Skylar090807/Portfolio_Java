package sec07.exam01;

public class MyClass {
	    // �ʵ�
		RemoteControl rc = new Television();//interface�� field�� ���

		// ������
		MyClass() {
		}

		MyClass(RemoteControl rc) {//interface�� ������ �Լ��� �Ű� ������ ���
			this.rc = rc;
			rc.turnOn();
			rc.setVolume(5);
		}

		// �޼ҵ�
		void methodA() {
			RemoteControl rc = new Audio();//interface�� ���������� ���
			rc.turnOn();
			rc.setVolume(5);
		}

		void methodB(RemoteControl rc) {//interface�� �Լ��� �Ű������� ���
			rc.turnOn();
			rc.setVolume(5);
		}

}
