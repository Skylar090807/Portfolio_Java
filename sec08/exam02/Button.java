package sec08.exam02;

public class Button {
	OnClickListener listener;//인터페이스 타입의 필드 선언
	
	void setOnClickListener(OnClickListener listener) {//인터페이스 타입 매개변수 선언
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();//추상 메소드 선언->클래스 구현시 재정의(Override).
	}

}
