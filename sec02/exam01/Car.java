package sec02.exam01;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//생성자
	Car() {
	}
	
	Car(String model) {
		this(model,null,0); //다른 생성자 함수 호출해 초기화 작업 수행
//		this.model = model;
	}
	
	Car(String model, String color) { 
		this(model, color, 0); //다른 생성자 함수 호출해 초기화 작업 수행
//		this.model = model;
//		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) { //위 this 호출 응답
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	
	//	speed 값 지정 메소드 지정
	void speedSet(int speed) {
		this.speed = speed;
	}
	
	void getSpeed() {
		System.out.println(this.speed);
	}
}//class