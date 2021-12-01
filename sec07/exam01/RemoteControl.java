package sec07.exam01;

public interface RemoteControl {
//	상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
//	추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
//	abstract 쓰지 않아도 자동으로 추상으로 인식

}
