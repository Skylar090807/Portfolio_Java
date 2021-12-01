package sec04.exam01.mycompany;

import sec03.exam01.*;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		Calculator cal1= new Calculator("공학용","Casio",100000);
		
		cal1.calcInfo();
		
//		int result = cal1.plus(200, 400);
//		System.out.println(result);
		
		cal1.powerOn();
		System.out.println(cal1.plus(200,400));
		System.out.println(cal1.plus(24.7,47.9));
		System.out.println(cal1.minus(200,400));
		System.out.println(cal1.mul(200.6,400.5));
		cal1.powerOff();
		
        Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재 속도: "+myCar.getSpeed());
		
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도: "+myCar.getSpeed());
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		

	}

}
