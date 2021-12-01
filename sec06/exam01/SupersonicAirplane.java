package sec06.exam01;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1; //상수 NORMAL선언
	public static final int SUPERSONIC = 2; //상수 SYPERSONIC선언
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}else {
			super.fly();
			//Airplane 객체의fly() 메소드 호출
		}
	}

}
