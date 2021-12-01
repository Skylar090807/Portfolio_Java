package sec06.exam02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle ve= new Vehicle();
		
		Vehicle vebus= new Bus();//부모클래스 타입변수에 자식클래스 객체 대입
		Vehicle vetaxi= new Taxi();//부모클래스 타입변수에 자식클래스 객체 대입
		
		//부모클래스 변수를 자식클래스 변수에 할당시 명시적 형변환이 필요
//		Bus bus1 =  (Bus)vebus();
//		Taxi taxi1 = (Taxi)vetaxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(ve);
		driver.drive(vebus);
		driver.drive(vetaxi);
//		driver.drive(bus1);
//		driver.drive(taxi1);


	}

}
