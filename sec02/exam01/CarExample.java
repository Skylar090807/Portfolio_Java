package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
//		객체 생성
//		car= mycar5();
//		mycar5= new car();
		Car myCar = new Car();
//		필드 값 읽기
		System.out.println("제작회사: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("최고 속도: "+myCar.maxSpeed);
		System.out.println("현재 속도: "+myCar.speed);
		
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		
		Car myCar1 = new Car("G80");
		
		System.out.println("제작회사: "+myCar1.company);
		System.out.println("모델명: "+myCar1.model);
		System.out.println("색깔: "+myCar1.color);
		System.out.println("최고 속도: "+myCar1.maxSpeed);
		System.out.println("현재 속도: "+myCar1.speed);
		
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		
        Car myCar2 = new Car("G80","검정색");
		
		System.out.println("제작회사: "+myCar2.company);
		System.out.println("모델명: "+myCar2.model);
		System.out.println("색깔: "+myCar2.color);
		System.out.println("최고 속도: "+myCar2.maxSpeed);
		System.out.println("현재 속도: "+myCar2.speed);
		
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		
        Car myCar3 = new Car("G80","검정색",300);
        myCar3.speedSet(100);
        myCar3.getSpeed();
		
		System.out.println("제작회사: "+myCar3.company);
		System.out.println("모델명: "+myCar3.model);
		System.out.println("색깔: "+myCar3.color);
		System.out.println("최고 속도: "+myCar3.maxSpeed);
		System.out.println("현재 속도: "+myCar3.speed);
		
		

	}

}
