package sec06.exam02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle ve= new Vehicle();
		
		Vehicle vebus= new Bus();//�θ�Ŭ���� Ÿ�Ժ����� �ڽ�Ŭ���� ��ü ����
		Vehicle vetaxi= new Taxi();//�θ�Ŭ���� Ÿ�Ժ����� �ڽ�Ŭ���� ��ü ����
		
		//�θ�Ŭ���� ������ �ڽ�Ŭ���� ������ �Ҵ�� ����� ����ȯ�� �ʿ�
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
