package sec10.exam01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글","안드로이드");
		
		String strObj = myPhone.toString();//재정의된 toString() 호출
		System.out.println(strObj);
		
		System.out.println(myPhone.toString());//재정의된 toString()을 호출하고 리턴값 받아 출력
		System.out.println(myPhone);//재정의된 toString()을 호출하고 리턴값 받아 출력
//		myPhone.toString에 toString을 생략해도 같은 값을 가리킨다.
		
		
		for(int i=0;i<10; i++) {
			System.out.println(i);
			if(i==5) {
//				break;
				System.exit(0);//프로그램(JVM) 강제 종료.
			}
			
		}
		System.out.println("프로그램 종료.");

	}

}
