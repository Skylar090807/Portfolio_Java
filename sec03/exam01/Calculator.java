package sec03.exam01;

public class Calculator {
//	필드
	String calcType; //공학, 일반
	String brandName; //삼성, 카시오, 소니
	int price; //가격
	
//	생성자 함수 오버로딩
	Calculator(){
	} //기본 생성자 자동 생성. 생략 가능.
	
	public Calculator(String caclType,String brandName, int price){
		this.calcType=calcType;
		this.brandName=brandName;
		this.price=price;
	}
	
	
	
	
		
	
	
	//method 함수 오버로딩
	
	public void calcInfo() {
		System.out.println("계산기 종류: "+calcType);
		System.out.println("계산기 브랜드: "+brandName);
		System.out.println("계산기 가격: "+price);
	}
	
	public void calcInfo(String owner) {
		System.out.println("---------------------");
		System.out.println("소유자 이름: "+owner);
		System.out.println("계산기 종류: "+calcType);
		System.out.println("계산기 브랜드: "+brandName);
		System.out.println("계산기 가격: "+price);
		System.out.println("---------------------");
	}
	
	public void calcInfo(String owner, int year) {
		System.out.println("---------------------");
		System.out.println("소유자 이름: "+owner);
		System.out.println("생산 연도: "+year);
		System.out.println("계산기 종류: "+calcType);
		System.out.println("계산기 브랜드: "+brandName);
		System.out.println("계산기 가격: "+price);
		System.out.println("---------------------");
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public int plus(int x, int y) {
		return x+y;
//		int result = x + y;
//		return result; 를 return x+y; 한 줄로 줄여 공간복잡도를 줄일 수 있다.
	}
	
	public double plus(double x, double y) {
		return x+y;
	}
	
	public int minus(int x, int y) {
		return x-y;
	}
	
	public double minus(double x, double y) {
		return x-y;
	}
	
	public int mul(int x, int y) {
		return x*y;
	}
	
	public double mul(double x, double y) {
		return x*y;
	}
	
	public double divide(int x, int y) {
		return (double)x / (double)y;
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
		
	}

}
