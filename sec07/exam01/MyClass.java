package sec07.exam01;

public class MyClass {
	    // 필드
		RemoteControl rc = new Television();//interface를 field로 사용

		// 생성자
		MyClass() {
		}

		MyClass(RemoteControl rc) {//interface를 생성자 함수의 매개 변수로 사용
			this.rc = rc;
			rc.turnOn();
			rc.setVolume(5);
		}

		// 메소드
		void methodA() {
			RemoteControl rc = new Audio();//interface를 지역변수로 사용
			rc.turnOn();
			rc.setVolume(5);
		}

		void methodB(RemoteControl rc) {//interface를 함수의 매개변수로 사용
			rc.turnOn();
			rc.setVolume(5);
		}

}
