package sec07.exam01;

public interface RemoteControl {
//	���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
//	�߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
//	abstract ���� �ʾƵ� �ڵ����� �߻����� �ν�

}
