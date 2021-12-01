package sec06.exam04;

public abstract class Animal {//추상 클래스
	//필드
    public String kind;
	
    //메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
    //추상 메소드
	public abstract void sound();
	public abstract void run();
	public abstract void fight();


}
